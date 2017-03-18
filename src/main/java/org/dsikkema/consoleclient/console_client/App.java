package org.dsikkema.consoleclient.console_client;

import org.dsikkema.jamphony.jamphony.CommandRunner;

import com.google.inject.Guice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Guice.createInjector(new GuiceModule()).getInstance(CommandRunner.class).run(args);
    }
}
