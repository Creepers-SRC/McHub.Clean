package com.CreepersHelp;

import org.fusesource.jansi.AnsiConsole;

public class ExampleApp {
	public static void main(String[] args) throws InterruptedException {
	    AnsiConsole.systemInstall();
	    AnsiConsole.out.println("\033[47m\033[31mRed\033[0m");
	    try {System.in.read();}catch(Exception e){}
	    AnsiConsole.out.println("\033[47m\033[31mBlue\033[0m");
	    Thread.sleep(5000);
	}
}
