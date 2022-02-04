package com.tungsten.hmclpe.launcher.setting.game;

public class PrivateGameSetting {

    public boolean enable;
    public boolean notCheckJvm;
    public boolean notCheckMinecraft;
    public boolean notCheckForge;
    public String javaPath;
    public String extraJavaFlags;
    public String extraMinecraftFlags;
    public String game_directory;
    public BoatLauncherSetting boatLauncherSetting;
    public PojavLauncherSetting pojavLauncherSetting;
    public float scaleFactor;

    public PrivateGameSetting (boolean enable,boolean notCheckJvm,boolean notCheckMinecraft,boolean notCheckForge,String javaPath,String extraJavaFlags,String extraMinecraftFlags,String game_directory,BoatLauncherSetting boatLauncherSetting,PojavLauncherSetting pojavLauncherSetting,float scaleFactor){
        this.enable = enable;
        this.notCheckJvm = notCheckJvm;
        this.notCheckMinecraft = notCheckMinecraft;
        this.notCheckForge = notCheckForge;
        this.javaPath = javaPath;
        this.extraJavaFlags = extraJavaFlags;
        this.extraMinecraftFlags = extraMinecraftFlags;
        this.game_directory = game_directory;
        this.boatLauncherSetting = boatLauncherSetting;
        this.pojavLauncherSetting = pojavLauncherSetting;
        this.scaleFactor = scaleFactor;
    }

}
