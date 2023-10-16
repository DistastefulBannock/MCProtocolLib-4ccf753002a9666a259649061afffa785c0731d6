# MCProtocolLib
MCProtocolLib is a simple library for communicating with a Minecraft client/server. It aims to allow people to make custom bots, clients, or servers for Minecraft easily.

## About this fork
This is a fork of the last 1.8.8 commit I was able to find. I've updated some of the pom file and such, so it will at least compile, but you still may need to tweak the code a bit to get everything functional. 

Neither me or the original developers will offer support for this version. 

Check out the original repo: https://github.com/GeyserMC/MCAuthLib

## Example Code
See example/com/github/steveice10/mc/protocol/test 

## Building the Source
MCProtocolLib uses Maven to manage dependencies. Simply run 'mvn clean install' in the source's directory.

TODO: Someone fix these links:
Builds can be downloaded **[here](https://build.spacehq.org/job/MCProtocolLib)**.
Javadocs can be found **[here](https://build.spacehq.org/job/MCProtocolLib/javadoc)**.

## License
MCProtocolLib is licensed under the **[MIT license](http://www.opensource.org/licenses/mit-license.html)**.

# Add to your project
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```
```xml
<dependency>
    <groupId>com.github.DistastefulBannock</groupId>
    <artifactId>MCProtocolLib-4ccf753002a9666a259649061afffa785c0731d6</artifactId>
    <version>19913f2cf1</version>
</dependency>
```

