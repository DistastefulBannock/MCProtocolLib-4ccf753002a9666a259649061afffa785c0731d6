package com.github.steveice10.mc.protocol.packet.ingame.client;

import com.github.steveice10.mc.protocol.data.game.values.MagicValues;
import com.github.steveice10.mc.protocol.data.game.values.ResourcePackStatus;
import com.github.steveice10.packetlib.io.NetInput;
import com.github.steveice10.packetlib.io.NetOutput;
import com.github.steveice10.packetlib.packet.Packet;

import java.io.IOException;

public class ClientResourcePackStatusPacket implements Packet {
    private String hash;
    private ResourcePackStatus status;

    @SuppressWarnings("unused")
    private ClientResourcePackStatusPacket() {
    }

    public ClientResourcePackStatusPacket(String hash, ResourcePackStatus status) {
        this.hash = hash;
        this.status = status;
    }

    public String getHash() {
        return this.hash;
    }

    public ResourcePackStatus getStatus() {
        return this.status;
    }

    @Override
    public void read(NetInput in) throws IOException {
        this.hash = in.readString();
        this.status = MagicValues.key(ResourcePackStatus.class, in.readVarInt());
    }

    @Override
    public void write(NetOutput out) throws IOException {
        out.writeString(this.hash);
        out.writeVarInt(MagicValues.value(Integer.class, this.status));
    }

    @Override
    public boolean isPriority() {
        return false;
    }
}
