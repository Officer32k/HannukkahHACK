package me.officer32k.hh.module.modules.misc;

import org.lwjgl.input.Keyboard;
import me.posotrite.hanukkahhack.module.Category;
import me.posotrite.hanukkahhack.module.Module;

public class AutoDupe extends Module {
	
	public AutoDupe() {
		super("AutoDupe", "dupes items", Category.MISC);
		this.setKey(Keyboard.KEY_K);
	}
}
