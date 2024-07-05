package com.techlabs.solution.test;

import com.techlabs.solution.model.ICommand;
import com.techlabs.solution.model.OffCommand;
import com.techlabs.solution.model.OnCommand;
import com.techlabs.solution.model.RemoteControl;
import com.techlabs.solution.model.Television;

public class Demo {
	
	    public static void main(String[] args) {
	        Television tv = new Television();
	        ICommand onCommand = new OnCommand(tv);
	        ICommand offCommand = new OffCommand(tv);

	        RemoteControl remote = new RemoteControl();
	        System.out.println("Output");
	        System.out.println("--------------");
	        remote.setCommand(onCommand);
	        remote.pressButton();

	        remote.setCommand(offCommand);
	        remote.pressButton();
	        System.out.println("--------------");
	    }
	}


