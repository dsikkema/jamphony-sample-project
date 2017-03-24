# Sample jamphony commands

Project exists to demonstrate use of jamphony for creating console commands

## Jamphony

Jamphony has arguments that are required raw values (e.g. `test-command 123`) and options and flags.

Options and flags
 * are prefixed by `--`
 * are optional
 * must follow after all arguments
 * flags do not take a value, they are just present or not present
 * look like this: `test-command --option1="some_value" --flag2

## Usage

For your application to use jamphony:
* Commands are represented as classes that implement CommandInterface
* Adding the mapping of a command to a "CommandModule", which implements CommandModuleInterface and returns a map of command names to command classes.
* Making sure that Guice is configured to bind the CommandModuleInterface to your command module.
* See these classes as examples; `org.dsikkema.consoleclient.console_client.CommandModule` and `org.dsikkema.consoleclient.console_client.GuiceModule`

To add more commands:
* Write a new class implementing CommandInterface, the execute method contains code to execute when command is called
* Return value of execute method is the exit code
* Get arguments, options, and flags from the instance of `InputData` passed to the execute method
* Add your command name and command class to your CommandModule
* Profit
* See example command below

## Example
To run this sample, download jamphony and install it locally with maven, then you can install this package, which has a maven dependency on jamphony. Jamphony is on github: https://github.com/dsikkema/jamphony

Install both jamphony and this package with `mvn clean install`


`send-message <name> --message=<message>`

#### Running command examples:

```
 [ ~/home/eclipse/console-workspace/console-client/target ]
 $ java -jar console-client.jar send-message John
Hello, John, you have a message: "<message is empty>"

 [ ~/home/eclipse/console-workspace/console-client/target ]
 $ java -jar console-client.jar send-message John
Hello, John, you have a message: "<message is empty>"

 [ ~/home/eclipse/console-workspace/console-client/target ]
 $ java -jar console-client.jar send-message John --message=hello
Hello, John, you have a message: "hello"
 
 [ ~/home/eclipse/console-workspace/console-client/target ]
 $ java -jar console-client.jar send-message John\ Doe --message="Hello, it's been a long time!"
Hello, John Doe, you have a message: "Hello, it's been a long time!"
 

```
