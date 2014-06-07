package com.CreepersHelp;

import java.io.IOException;

import com.CreepersHelp.Variables;

@SuppressWarnings("unused")
public class ArgsParser {
	
	static com.CreepersHelp.Variables  Variables  = new com.CreepersHelp.Variables();
	static com.CreepersHelp.ArgsParser ArgsParser = new com.CreepersHelp.ArgsParser();
	static com.CreepersHelp.FileParser FileParser = new com.CreepersHelp.FileParser();
	static com.CreepersHelp.Start Start  = new com.CreepersHelp.Start();
	
	public void Parser(String[] args) 
			throws InterruptedException, IOException 
	{
		if (args.length!=0) {
			while(Variables.zero<args.length&&(Variables.zbhelp==false)){
			      if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--help")||args[Variables.zero].toLowerCase().equalsIgnoreCase("-help")||args[Variables.zero].toLowerCase().equalsIgnoreCase("--h")||args[Variables.zero].toLowerCase().equalsIgnoreCase("-h")||args[Variables.zero].toLowerCase().equalsIgnoreCase("-?")) {
				Variables.bhelp=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--noconsole")) {
				Variables.bnoconsole=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--version")) {
				Variables.bversion=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--demo")) {
				Variables.bdemo=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--defaults")) {
				Variables.bdefaults=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--restart")) {
				Variables.brestart=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--infof")) {
				Variables.binfof=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--infos")) {
				Variables.binfos=true;
			} else if (args[Variables.zero].toLowerCase().equalsIgnoreCase("--debug")) {
				Variables.debug=true;
			} else if (args[Variables.zero].toLowerCase().contains("help")||args[Variables.zero].toLowerCase().contains("-help")||args[Variables.zero].toLowerCase().contains("--h")||args[Variables.zero].toLowerCase().contains("-h")||args[Variables.zero].toLowerCase().contains("-?")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--help\"?");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("noconsole")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean " + 
								   "--noconsole");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("version")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--version\"?");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("demo")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--demo\"?");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("defaults")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--defaults\"?");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("restart")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--restart\"?");
				Variables.zbhelp=true;
			} else if (args[Variables.zero].toLowerCase().contains("debug")) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
				         + "\"--debug\"?");
				Variables.zbhelp=true;
			} 	else if (args[Variables.zero].toLowerCase().contains("info")&&(!args[Variables.zero].toLowerCase().contains("infof"))&&(!args[Variables.zero].toLowerCase().contains("infos"))) {
				System.out.println("Unknown variable: "+args[Variables.zero]+""+Variables.newLine+"Did you mean "
						         + "\"--infof\" or \"--infos\"?");
				Variables.zbhelp=true;
			} 
			else {
				System.out.println("Unknown variable: "+args[Variables.zero]);
				System.out.println(Variables.help);
				System.out.println("Using NO args...");
				System.out.println("Will Now wait 10 seconds before continuing...");
				Thread.sleep(10 * 1000);
				Variables.zbhelp=true;
			}
				Variables.zero++;
			}
			Variables.zero = 0;
		}
		FileParser.Parser();
	return;	
	}
}
