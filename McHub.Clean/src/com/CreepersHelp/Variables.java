package com.CreepersHelp;

import java.io.File;

import com.CreepersHelp.Variables;
import com.CreepersHelp.ArgsParser;
import com.CreepersHelp.FileParser;
import com.CreepersHelp.Start;

@SuppressWarnings("unused")
public class Variables {
	String version = "R1.3Beta";
	String newLine = System.getProperty("line.separator");
	final String[] URLNames = new String[5];
	final String[] website = new String[5];
	public int BungeeSize;
	public int BukkitSize;
	public int SpigotSize;
	public int VanillaSize;
	File[] Names = new File[8];
	int zero = 0;
	boolean bhelp = false;
	boolean bnoconsole = false;
	boolean bversion = false;
	boolean bdemo = false;
	boolean bdefaults = false;
	boolean brestart = false;
	int MinJava = 7;
	double JavaVer = 51.0D;
	String App = "McHubz";
	boolean binfof = false;
	File pluginsdir = new File("PluginsDir");
	File serverdir = new File("Servers");
	File jardir = new File("jar");
	boolean binfos = false;
	boolean debug = false;
	int kk = 0;
	boolean zbhelp = false;
	String os = System.getProperty("os.name");
	com.CreepersHelp.ArgsParser ArgsParser = new com.CreepersHelp.ArgsParser();
	com.CreepersHelp.FileParser FileParser = new com.CreepersHelp.FileParser();
	com.CreepersHelp.Start Start  = new com.CreepersHelp.Start();
	String ServerArgs = "-d64 -DJINTEGRA_NATIVE_MODE -DJINTEGRA_COINIT_VALUE=0 -Dsun.io.useCanonCaches=false -Djline.terminal=jline.UnsupportedTerminal -XX:ThreadPriorityPolicy=42 -XX:CompileThreshold=1500 -XX:+TieredCompilation -XX:TargetSurvivorRatio=90 -XX:MaxTenuringThreshold=15 -XX:+UnlockExperimentalVMOptions -XX:+UseAdaptiveGCBoundary -XX:+UseGCOverheadLimit -XX:+UseBiasedLocking -Xnoclassgc -Xverify:none -XX:UseSSE=8 -XX:+UseThreadPriorities -Djava.net.preferIPv4Stack=true -XX:+UseLargePages -XX:+UseFastAccessorMethods -Xrs -XX:+AggressiveOpts";
	String help = ("-=-=-=-=-=-=-|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+newLine+"" +
	               "  Option     |   Description"+newLine+"" +
				   "-=-=-=-=-=-=-|-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+newLine+"" +
			       "--help       |   Disables this help message"+newLine+"" +
			       "--noconsole  |   Disables console output for all servers"+newLine+"" +
				   "--Version    |   Will Print out product version"+newLine+"" +
				   "--Demo       |   Will run in a \"Demo\" Mode"+newLine+"" +
				   "--Defaults   |   Will reset config to defaults"+newLine+"" +
				   "--restart    |   Will restart server upon stop/crash(5 times {tryed})"+newLine+"" +
				   "--InfoF      |   Will Print debuging information(to file)"+newLine+"" +
				   "~~~~~~~~~~~~~|    Then will exit"+newLine+"" +
				   "--InfoS      |   Will Print debuging information(to screen)"+newLine+"" +
				   "~~~~~~~~~~~~~|    Then will exit"+newLine+"" +
				   "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+newLine+"" +
				   "You are running product version: " + version + ""+newLine+"On OS: "+ os + "" + newLine +				   
				   "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-="+newLine+"");
	 String Web1 = "http://dl.bukkit.org/latest-dev/craftbukkit.jar";
	 String Web2 = "http://ci.md-5.net/job/Spigot/lastSuccessfulBuild/artifact/Spigot-Server/target/spigot.jar";
	 String Web3 = "http://ci.md-5.net/job/BungeeCord/lastSuccessfulBuild/artifact/bootstrap/target/BungeeCord.jar";
	 String Web4 = "http://minecraft.net/download/minecraft_server.jar";
	 boolean finishedSpigot=false;
	 boolean finishedBukkit=false;
	 boolean finishedBungee=false;
	 boolean finishedVanilla=false;
}
