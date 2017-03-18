package org.dsikkema.consoleclient.console_client.commands;

import org.dsikkema.jamphony.jamphony.CommandInterface;
import org.dsikkema.jamphony.jamphony.io.CommandInputDefinition;
import org.dsikkema.jamphony.jamphony.io.InputData;
import org.dsikkema.jamphony.jamphony.io.Type;

public class TestCommand implements CommandInterface {

	public int execute(InputData inputArgs) {
		
		System.out.println("Arg: " + inputArgs.getArgument("arg1").getStringValue());
		System.out.println("Opt: " + inputArgs.getOption("opt1").getStringValue()); 
		
		return 0;
	}

	public void populateInputDefinition(CommandInputDefinition inputDefinition) {
		inputDefinition.addArgument("arg1", Type.STRING);
		inputDefinition.addOption("opt1", Type.STRING);

	}

}
