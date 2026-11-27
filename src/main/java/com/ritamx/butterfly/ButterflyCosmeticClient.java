package com.ritamx.butterfly;

import net.fabricmc.api.ClientModInitializer;

/**
 * Client-only entrypoint.
 *
 * This is intentionally a safe, minimal starter. The visible 3D butterfly
 * renderer and animation are not implemented in this starter yet.
 */
public final class ButterflyCosmeticClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Client cosmetic initialization will be added with the renderer.
    }
}
