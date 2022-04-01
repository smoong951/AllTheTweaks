package com.thevortex.allthetweaks.mixin;

import com.mojang.serialization.Lifecycle;
import net.minecraft.world.level.storage.PrimaryLevelData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PrimaryLevelData.class)
public class BaghdadBob {

        @Inject(method = "worldGenSettingsLifecycle", at = @At("HEAD"), cancellable = true)
        private void everythingIsStable(CallbackInfoReturnable<Lifecycle> cir) {
            cir.setReturnValue(Lifecycle.stable());
        }
    }

