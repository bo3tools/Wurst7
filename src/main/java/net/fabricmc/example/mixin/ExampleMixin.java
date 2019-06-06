package net.fabricmc.example.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.MinecraftClient;

@Mixin(MinecraftClient.class)
public class ExampleMixin
{
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info)
	{
		System.out.println("This line is printed by an example mod mixin!");
	}
}