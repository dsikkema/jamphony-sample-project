package org.dsikkema.consoleclient.console_client;

import java.util.HashMap;

import org.dsikkema.jamphony.jamphony.CommandInterface;
import org.dsikkema.jamphony.jamphony.CommandModuleInterface;

public class CommandModule implements CommandModuleInterface{

	public HashMap<String, Class<? extends CommandInterface>> getCommandMap() {
		HashMap<String, Class<? extends CommandInterface>> result = new HashMap<>();
		
		result.put("send-message", org.dsikkema.consoleclient.console_client.commands.PrintMessage.class);
		
		return result;
	}

}
