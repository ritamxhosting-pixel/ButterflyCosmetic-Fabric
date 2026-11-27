# Butterfly Cosmetic — Fabric 26.2 starter

A client-only Fabric mod project scaffold for a decorative butterfly cosmetic.

## Target toolchain
- Minecraft Java Edition 26.2
- Fabric Loader 0.19.3
- Fabric API 0.161.0+26.2
- Fabric Loom 1.17-SNAPSHOT
- Gradle 9.5.1
- Java 25

These version choices follow Fabric's 26.2 release guidance. They have not been compiled or runtime-tested in this environment.

## Important: current scope
This ZIP is a **starter project**, not a finished in-game mod. It currently contains the Fabric client entrypoint and build setup only. It does not yet render the 3D butterfly, wing animation, keybind, or toggle UI. Do not install it expecting a visible cosmetic.

## Build
Use Gradle 9.5.1 with Java 25 and run:
`gradle build`

The output JAR will be in `build/libs/`.

## Install location (once the visual mod is implemented)
This is a client-side mod. The final JAR belongs in the Minecraft client's `mods` folder, together with the matching Fabric Loader and Fabric API. It does not go in the Paper server's `plugins` folder.
