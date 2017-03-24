package org.dsikkema.consoleclient.console_client.commands;

import org.dsikkema.jamphony.jamphony.CommandInterface;
import org.dsikkema.jamphony.jamphony.io.CommandInputDefinition;
import org.dsikkema.jamphony.jamphony.io.InputData;
import org.dsikkema.jamphony.jamphony.io.Type;

public class PrintMessage implements CommandInterface {

	public int execute(InputData inputArgs) {
		String name = inputArgs.getArgument("recipient").getStringValue();
		String message = inputArgs.isOptionProvided("message") ? inputArgs.getOption("message").getStringValue() : "<message is empty>";
		
		
		System.out.println(String.format("Hello, %s, you have a message: \"%s\"", name, message));
		
		return 0;
	}

	public void populateInputDefinition(CommandInputDefinition inputDefinition) {
		inputDefinition.addArgument("recipient", Type.STRING);
		inputDefinition.addOption("message", Type.STRING);

	}

}
