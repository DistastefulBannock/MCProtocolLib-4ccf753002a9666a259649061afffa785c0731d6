package com.github.steveice10.mc.protocol.packet.ingame.server.world;

import com.github.steveice10.mc.protocol.data.game.values.world.block.BlockChangeRecord;
import com.github.steveice10.mc.protocol.util.NetUtil;
import com.github.steveice10.packetlib.io.NetInput;
import com.github.steveice10.packetlib.io.NetOutput;
import com.github.steveice10.packetlib.packet.Packet;

import java.io.IOException;

public class ServerBlockChangePacket implements Packet {

    private BlockChangeRecord record;

    @SuppressWarnings("unused")
    private ServerBlockChangePacket() {
    }

    public ServerBlockChangePacket(BlockChangeRecord record) {
        this.record = record;
    }

    public BlockChangeRecord getRecord() {
        return this.record;
    }

    @Override
    public void read(NetInput in) throws IOException {
        this.record = new BlockChangeRecord(NetUtil.readPosition(in), in.readVarInt());
    }

    @Override
    public void write(NetOutput out) throws IOException {
        NetUtil.writePosition(out, this.record.getPosition());
        out.writeVarInt(this.record.getBlock());
    }

    @Override
    public boolean isPriority() {
        return false;
    }

}
