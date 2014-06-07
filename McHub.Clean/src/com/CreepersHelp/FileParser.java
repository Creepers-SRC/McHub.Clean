package com.CreepersHelp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.CreepersHelp.Variables;

@SuppressWarnings({"unused" , "resource"})
public class FileParser {
	static com.CreepersHelp.Variables  Variables  = new com.CreepersHelp.Variables();
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void Parser() throws IOException, InterruptedException {
		Variables.URLNames[0] = "Craftbukit-Dev.jar";
		Variables.URLNames[1] = "Spigot-Latest.jar";
		Variables.URLNames[2] = "BungeeCord-Latest.jar";
		Variables.URLNames[3] = "Vanilla-Latest.jar";
		Variables.website[4] = "http://dl.bukkit.org/latest-dev/craftbukkit.jar";
		Variables.Names[0] = new File("jar" + File.separator + "CraftBukkit-Dev.jar");
		Variables.Names[1] = new File("jar" + File.separator + "Spigot-Latest.jar");
		Variables.Names[2] = new File("jar" + File.separator + "BungeeCord-Latest.jar");
		Variables.Names[3] = new File("jar" + File.separator + "Vanilla-Latest.jar");
		
		BukkitSize();
		System.exit(0);	
		
		if (Variables.Names[0].length() < Variables.SpigotSize) {
			Variables.Names[0].delete();
		}
		if (Variables.Names[1].length() < Variables.BukkitSize) {
			Variables.Names[1].delete();
		}
		if (Variables.Names[2].length() < Variables.BungeeSize) {
			Variables.Names[2].delete();
		}
		if (Variables.Names[3].length() < Variables.VanillaSize) {
			Variables.Names[3].delete();
		}
		
		while (Variables.kk <= 3) {
	      File file = new File("jar" + File.separator + Variables.URLNames[Variables.kk]);
	      SimpleDateFormat mm = new SimpleDateFormat("MM");
	      SimpleDateFormat dd = new SimpleDateFormat("dd");
	      SimpleDateFormat yy = new SimpleDateFormat("yyyy");
	      int month = Calendar.getInstance().get(2);
	      int day = Calendar.getInstance().get(5);
	      int year = Calendar.getInstance().get(1);
	      int mmm = Integer.parseInt(mm.format(Long.valueOf(file.lastModified())));
	      int ddd = Integer.parseInt(dd.format(Long.valueOf(file.lastModified())));
	      int yyy = Integer.parseInt(yy.format(Long.valueOf(file.lastModified())));
	      try {
	          if ((month >= mmm + 1) || (day >= ddd + 5) || (year >= yyy + 1)) {
	            if (Variables.kk <= 3) {
	              file.delete();
	            }
	          }
	        }
	        catch (Exception localException1) {}
	        if (Variables.kk <= 3) {
	          Variables.kk++;
	        }
		}
		boolean SD1 =false;
		boolean BD1 =false;
		boolean BD2 =false;
		boolean VD1 =false;
		if (!Variables.Names[0].exists()||!Variables.Names[1].exists()||!Variables.Names[2].exists()||!Variables.Names[3].exists()) {
		System.out.println("The following files will be downloaded (needed for server to run)"+Variables.newLine+
						   ".........................");
			if (!Variables.Names[0].exists()) {
				System.out.println("Spigot (Latest)");
				SD1=true;
			} 
			if (!Variables.Names[1].exists()) {
				System.out.println("Craftbukkit (Development)");
				BD1=true;
			} 
			if (!Variables.Names[2].exists()) {
				System.out.println("BungeeCord (Latest)");
				BD2=true;
			}
			if (!Variables.Names[3].exists()) {
				System.out.println("Vanilla (Latest {Release})");
				VD1=true;
			}
			System.out.println(".........................");
		}
		if (!Variables.Names[0].exists()||!Variables.Names[1].exists()||!Variables.Names[2].exists()||!Variables.Names[3].exists()) {
				if (SD1 == true) {
					DownloadSpigot();
				}if (BD1 == true) {
					DownloadBukktit();
				}if (BD2 == true) {
					DownloadBungee();
				}if (VD1 == true) {
					DownloadVanilla();
			}
		}
		if (BD1 == false) {
			Variables.finishedBukkit = true;
		}
		if (BD2 == false) {
			Variables.finishedBungee = true;
		}
		if (SD1 == false) {
			Variables.finishedSpigot = true;
		}
		if (VD1 == false) {
			Variables.finishedVanilla = true;
		}
		while (!Variables.finishedBungee||!Variables.finishedSpigot||!Variables.finishedBukkit||!Variables.finishedVanilla) {
			Thread.sleep(500);
			System.out.println(".");
			if ( Variables.ErrorBukkit|| Variables.ErrorSpigot|| Variables.ErrorBungee|| Variables.ErrorVanilla) {
				System.out.println("FAILED");
				System.exit(0);				
			}
		}
	} 
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int BukkitSize() {
	     URL url = null;
	     URLConnection conn = null;
		try {
			url = new URL(Variables.Web1);
	     conn = url.openConnection();
	    Variables.BukkitSize = conn.getContentLength();
	     if (Variables.BukkitSize <= 0) {
	    	 System.out.println("Could not determine remote file size.");
	    	 Variables.ErrorBukkit = true;
	     }
		}
		catch (Exception e) {}
		finally {
			if (conn != null) {
				try {
					conn.getInputStream().close();
				} catch (Exception g) {}
			}
		}
	     return Variables.BukkitSize;
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=	
	public static int SpigotSize() throws IOException {
	     URL url = new URL(Variables.Web2);
	     URLConnection conn = url.openConnection();
	     Variables.SpigotSize = conn.getContentLength();
	     if (Variables.SpigotSize < 0) {
//	     System.out.println("Could not determine file size.");
	     } else
	  //   System.out.println(SpigotSize);
	     conn.getInputStream().close();
	     return Variables.SpigotSize;
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int BungeeSize() throws IOException {
	     URL url = new URL(Variables.Web3);
	     URLConnection conn = url.openConnection();
	     Variables.BungeeSize = conn.getContentLength();
	     if (Variables.BungeeSize < 0) {
//	      System.out.println("Could not determine file size.");
	     }
	     else
	    //  System.out.println(BungeeSize);
	      conn.getInputStream().close();
	      return Variables.BungeeSize;
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int VanillaSize() throws IOException {
		URL url = new URL(Variables.Web4);
		URLConnection conn = url.openConnection();
		conn.setAllowUserInteraction(true);
		Variables.VanillaSize = conn.getContentLength();
		if (Variables.VanillaSize < 0) {
			//    ystem.out.println("Could not determine file size.");
		}
		else
			System.out.println(Variables.VanillaSize);
		conn.getInputStream().close();
		return Variables.VanillaSize;
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	private static void DownloadBukktit() {
		    new Thread(new Runnable() {
				public void run() {
		        	String Web=Variables.Web1;
		        	String names="Craftbukkit-Dev.jar";
		        	Variables.finishedBukkit = false;
		        	/*Do code here*/
		        	try {
		        	URL website = new URL(Web);
		        	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		        	FileOutputStream fos = new FileOutputStream("jar" + File.separator + names);
		        	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		        	}  catch (UnknownHostException h) {
		        		System.out.println(Variables.newLine+"Unable to download CraftBukkit Minecraft"
		        				+ " Server."
		        				+ Variables.newLine+"Please Check internet Connection."+Variables.newLine
		        				+ "UnknownHostException: Unable to do a DNS lookup.");
		        		Variables.finishedBukkit = true;
		        	}  catch (Exception k) {
		        		Variables.finishedBukkit = true;
		        	}
		        	/*Do code here*/
		        	Variables.finishedBukkit = true;
			   }
		    }).start();
		}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	private static void DownloadSpigot() {
		    new Thread(new Runnable() {
		        public void run() {
		        	String Web=Variables.Web2;
		        	String names="Spigot-Latest.jar";
		        	Variables.finishedSpigot = false;
		        	/*Do code here*/
		        	try {
		        	URL website = new URL(Web);
		        	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		        	FileOutputStream fos = new FileOutputStream("jar" + File.separator + names);
		        	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		        	}  catch (UnknownHostException h) {
		        		System.out.println(Variables.newLine+"Unable to download Spigot Minecraft"
		        				+ " Server."
		        				+ Variables.newLine+"Please Check internet Connection."+Variables.newLine
		        				+ "UnknownHostException: Unable to do a DNS lookup.");
		        		Variables.finishedSpigot = true;
		        	}  catch (Exception k) {
		        		Variables.finishedSpigot = true;
		        	}
		        	/*Do code here*/
		        	Variables.finishedSpigot = true;
			   }
		    }).start();
		}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	private static void DownloadBungee() {
		    new Thread(new Runnable() {
		        public void run() {
		        	String Web=Variables.Web3;
		        	String names="BungeeCord-Latest.jar";
		        	Variables.finishedBungee = false;
		        	/*Do code here*/
		        	try {
		        	URL website = new URL(Web);
		        	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
		        	FileOutputStream fos = new FileOutputStream("jar" + File.separator + names);
		        	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		        	}  catch (UnknownHostException h) {
		        		System.out.println(Variables.newLine+"Unable to download BungeeCord Minecraft"
		        				+ " Server."
		        				+ Variables.newLine+"Please Check internet Connection."+Variables.newLine
		        				+ "UnknownHostException: Unable to do a DNS lookup.");
		        		Variables.finishedBungee = true;
		        	}  catch (Exception k) {
		        		Variables.finishedBungee = true;
		        	}
		        	/*Do code here*/
		        	Variables.finishedBungee = true;
			   }
		    }).start();
		}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	private static void DownloadVanilla() {
	    new Thread(new Runnable() {
	        public void run() {
	        	String Web=Variables.Web4;
	        	String names="Vanilla-Latest.jar";
	        	Variables.finishedVanilla = false;
	        	/*Do code here*/
	        	try {
	            GetVanilla();
	        	URL website = new URL(Web);
	        	ReadableByteChannel rbc = Channels.newChannel(website.openStream());
	        	FileOutputStream fos = new FileOutputStream("jar" + File.separator + names);
	        	fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	        	}  catch (UnknownHostException h) {
	        		System.out.println(Variables.newLine+"Unable to download Vanilla Minecraft"
	        				+ " Server."
	        				+ Variables.newLine+"Please Check internet Connection."+Variables.newLine
	        				+ "UnknownHostException: Unable to do a DNS lookup.");
	        		Variables.finishedVanilla = true;
	        	}  catch (Exception k) {
	        		Variables.finishedVanilla = true;
	        	}
	        	/*Do code here*/
	        	Variables.finishedVanilla = true;
		   }
	    }).start();
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void GetVanilla() throws IOException {
		int i = 1;
        URL oracle = new URL("http://s3.amazonaws.com/Minecraft.Download/versions/versions.json");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));
        String Ver = "Unknown Version";
        String inputLine = null;
        while (i <= 5) {
        	inputLine = in.readLine();
            if (inputLine.toLowerCase().contains("release")) {
            	Ver = inputLine.replaceAll("    \"release\": \"", "");
            	Ver = Ver.replaceAll("\"", "");
//            	System.out.println(Ver);
            }
            if (inputLine.toLowerCase().contains("},")) {
            	inputLine = inputLine.replaceAll("},", "}\n}");
            }
//            System.out.println(inputLine);
            i++;
        }
        in.close();
        Variables.Web4 = "http://s3.amazonaws.com/Minecraft.Download/versions/"+Ver+"/minecraft_server."+Ver+".jar";
	}
//-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
}
