package com.CreepersHelp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
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
		throws InterruptedException, IOException 
	{
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
		Variables.ArgsParser.Parser(args);
		//System.out.println(Variables.ArgsParser.Variables.zbhelp);
	}
	public static void CheckJavaVersion() 
		throws InterruptedException 
	{
		  System.out.print("Checking Java Version...");
		  int type = 7;
		  double ii = 51.0D;

		if (Float.parseFloat(System.getProperty("java.class.version")) < Variables.JavaVer)
	    {
			double  i = 51.0D;
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
  	  if (ii < Float.parseFloat(System.getProperty("java.class.version"))) {
    	  ii++;
    	  type++;
	  } else
	  if (ii > Float.parseFloat(System.getProperty("java.class.version"))) {
    	  ii--;
    	  type--;
	  }
		System.out.print("Pass (Java "+type+")"+Variables.newLine);
	}
}




/**
   int j = 0;
		while (Variables.finishedSpigot == false) {
			Thread.sleep(500);
            if (j % 2 == 0) {
            if (j >= 80) {
               	System.out.print(Variables.newLine);
               	j = 0;
            }
            System.out.print(".");
            }
            j ++;
		}
 */
