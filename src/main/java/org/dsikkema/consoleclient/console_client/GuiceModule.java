package org.dsikkema.consoleclient.console_client;

import org.dsikkema.jamphony.jamphony.CommandModuleInterface;

import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(CommandModuleInterface.class).to(CommandModule.class);
	}

}
