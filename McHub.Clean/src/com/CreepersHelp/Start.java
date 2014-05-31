package com.CreepersHelp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import com.CreepersHelp.Variables;
import org.apache.commons.io.FileUtils;

@SuppressWarnings({"unused"})
public class Start {
	static com.CreepersHelp.Variables  Variables  = new com.CreepersHelp.Variables();
	public static void main(String[] args) 
		throws InterruptedException 
	{
		//Make neccessary directories
	    if (!Variables.serverdir.exists()) {
	    		Variables.serverdir.mkdir();
	    }
	    if (!Variables.jardir.exists()) {
	        	Variables.jardir.mkdir();
	    }
	    if (!Variables.pluginsdir.exists()) {
		        Variables.pluginsdir.mkdir();
		}
	      
		
		
		
		CheckJavaVersion();
		System.out.println("Pass");
		Variables.ArgsParser.Parser(args);
	}
	public static void CheckJavaVersion() 
		throws InterruptedException 
	{
		  System.out.print("Checking Java Version...");
		if (Float.parseFloat(System.getProperty("java.class.version")) < Variables.JavaVer)
	    {
		      double i = 51.0D;
		      int type = 7;
		      while (i <= Float.parseFloat(System.getProperty("java.class.version"))||i >= Float.parseFloat(System.getProperty("java.class.version"))) {
		    	  /**Do Code Here*/
		    	  if (i == Float.parseFloat(System.getProperty("java.class.version"))) {
		    	      System.err.print(Variables.newLine+"*~* Begin: ERROR *~*"+Variables.newLine+"" +
		    		               	   "==============================================="+Variables.newLine+"");
		    	  Thread.sleep(1);
		      	  System.out.print(Variables.App+" requires Java "+Variables.MinJava+" or above to function!"+Variables.newLine+"" +
		      			  	       "You currently have: Java "+type+""+Variables.newLine+"" +
		    		  		       "Please contact us if you need help with this."+Variables.newLine+""); 
		      	  Thread.sleep(1);
		      	  System.err.print("==============================================="+Variables.newLine+"");
		      	  Thread.sleep(1);
		      	  System.out.print("Skype: TyrannyCraft"+Variables.newLine+"");
		      	  Thread.sleep(1);
		      	  System.err.print("~~~~~~~~~~~~~~~~~~~~~~~~~~"+Variables.newLine+"");
		      	  Thread.sleep(1);
		      	  System.out.print("IRC: #TyrannyCraftHelp, #TCH"+Variables.newLine+"");
		      	  Thread.sleep(1);
		      	  System.err.println("==============================================="+Variables.newLine+"" +
		      				     "*~* End: ERROR *~*" );
		    	  System.out.println("==============================================="+Variables.newLine+"" +
		    	  		             "Will Now wait 10 Seconds..."+Variables.newLine+"" +
		    	  	                 "Before exit..."+Variables.newLine+"" +
		    	  	                 "===============================================");
		    	  System.out.println("Failed");
		    	  Thread.sleep(10 * 1000);
		    	  System.exit(0);
		    	  }
		    	  /**Do Code Here*/
		    	  if (i < Float.parseFloat(System.getProperty("java.class.version"))) {
			    	  i++;
			    	  type++;
		    	  } else
		    	  if (i > Float.parseFloat(System.getProperty("java.class.version"))) {
			    	  i--;
			    	  type--;
		    	  }
		      }
	      System.exit(0);
	    }
	}
}
