package me.officer32k.hh.module.modules.movement;

import org.lwjgl.input.Keyboard;

import me.posotrite.hanukkahhack.module.Category;
import me.posotrite.hanukkahhack.module.Module;

public class Sprint extends Module {

	public Sprint() {
		super("Sprint", "auto runs when you hold w NO DUMBFUCK THATS SPRINT AUTO SPRINT nvm:D", Category.PLAYER);
		this.setKey(Keyboard.KEY_M);
	}
}
