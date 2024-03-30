package net.taureon.inanimateinsanity.mixin;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method = "getRepairCost()I", at = @At("RETURN"), cancellable = true)
    public void getRepairCost(CallbackInfoReturnable<Integer> cir) {
        //keeps combine costs reasonable
        cir.setReturnValue(0);
    }
}
