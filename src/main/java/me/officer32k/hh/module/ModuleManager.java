package me.officer32k.hh.module;

import java.util.ArrayList;
import java.util.List;

import me.posotrite.hanukkahhack.Main;
import me.posotrite.hanukkahhack.module.modules.misc.AutoDupe;
import me.posotrite.hanukkahhack.module.modules.movement.Sprint;

public class ModuleManager {
	
	public ArrayList<Module> modules;
	
	public ModuleManager() {
		(modules = new ArrayList<Module>()).clear();
		//movement
		this.modules.add(new Sprint());
		this.modules.add(new AutoDupe());
	}
	
	public Module getModule (String name) {
		for(Module m : this.modules) {
			if(m.getName().equalsIgnoreCase(name)) {
				return m;
			}
		}
		return null;
	}
	
	public ArrayList<Module> getModuleList() {
		return this.modules;
	}
	
	public static List<Module> getModulesByCategory(Category c){
		List<Module> modules = new ArrayList<Module>();
		
		for(Module m : Main.moduleManager.modules) {
			if(m.getCategory() == c)
				modules.add(m);
		}
		return modules;
	} 
}
