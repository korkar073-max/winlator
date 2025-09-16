package com.winlator.container;

import android.os.Environment;

import com.winlator.box86_64.Box86_64Preset;
import com.winlator.core.EnvVars;
import com.winlator.core.FileUtils;
import com.winlator.core.KeyValueSet;
import com.winlator.core.WineInfo;
import com.winlator.core.WineThemeManager;
import com.winlator.xenvironment.ImageFs;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;

public class Container {
    public static final String DEFAULT_ENV_VARS = "ZINK_DESCRIPTORS=lazy ZINK_DEBUG=compact MESA_SHADER_CACHE_DISABLE=false MESA_SHADER_CACHE_MAX_SIZE=512MB mesa_glthread=true WINEESYNC=0 MESA_VK_WSI_PRESENT_MODE=mailbox TU_DEBUG=noconform";
    public static final String DEFAULT_SCREEN_SIZE = "1280x720";
    public static final String DEFAULT_GRAPHICS_DRIVER = "turnip";
    public static final String DEFAULT_AUDIO_DRIVER = "alsa";
    public static final String DEFAULT_DXWRAPPER = "dxvk";
    public static final String DEFAULT_WINCOMPONENTS = "direct3d=1,directsound=1,directmusic=0,directshow=0,directplay=0,vcrun2010=1,wmdecoder=1";
    public static final String DEFAULT_DRIVES = "D:" + Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + "E:/data/data/com.winlator/storage";

    public final int id;
    private String name;
    private String screenSize;
    private String envVars;
    private String graphicsDriver;
    private String dxwrapper;
    private String dxwrapperConfig;
    private String wincomponents;
    private String audioDriver;
    private String drives;
    private String wineVersion;
    private boolean showFPS;
    private boolean wow64Mode;
    private byte startupSelection;
    private String cpuList;
    private String cpuListWoW64;
    private String desktopTheme;
    private String box86Preset;
    private String box64Preset;
    private File rootDir;
    private JSONObject extraData;

    // PES 2021 Optimized Constructor
    public Container(int id) {
        this.id = id;
        this.name = "Container-" + id;

        this.screenSize = DEFAULT_SCREEN_SIZE;
        this.envVars = DEFAULT_ENV_VARS;
        this.graphicsDriver = DEFAULT_GRAPHICS_DRIVER;
        this.dxwrapper = DEFAULT_DXWRAPPER;
        this.dxwrapperConfig = "";
        this.wincomponents = DEFAULT_WINCOMPONENTS;
        this.audioDriver = DEFAULT_AUDIO_DRIVER;
        this.drives = DEFAULT_DRIVES;
        this.wineVersion = WineInfo.MAIN_WINE_VERSION.identifier();
        this.showFPS = false;
        this.wow64Mode = true;
        this.startupSelection = 1; // ESSENTIAL
        this.cpuList = null;
        this.cpuListWoW64 = null;
        this.desktopTheme = WineThemeManager.DEFAULT_DESKTOP_THEME;
        this.box86Preset = Box86_64Preset.COMPATIBILITY;
        this.box64Preset = Box86_64Preset.COMPATIBILITY;
        this.rootDir = null;
        this.extraData = new JSONObject();
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getScreenSize() { return screenSize; }
    public void setScreenSize(String screenSize) { this.screenSize = screenSize; }
    public String getEnvVars() { return envVars; }
    public void setEnvVars(String envVars) { this.envVars = envVars != null ? envVars : ""; }
    public String getGraphicsDriver() { return graphicsDriver; }
    public void setGraphicsDriver(String graphicsDriver) { this.graphicsDriver = graphicsDriver; }
    public String getDXWrapper() { return dxwrapper; }
    public void setDXWrapper(String dxwrapper) { this.dxwrapper = dxwrapper; }
    public String getDXWrapperConfig() { return dxwrapperConfig; }
    public void setDXWrapperConfig(String dxwrapperConfig) { this.dxwrapperConfig = dxwrapperConfig != null ? dxwrapperConfig : ""; }
    public String getAudioDriver() { return audioDriver; }
    public void setAudioDriver(String audioDriver) { this.audioDriver = audioDriver; }
    public String getWinComponents() { return wincomponents; }
    public void setWinComponents(String wincomponents) { this.wincomponents = wincomponents; }
    public String getDrives() { return drives; }
    public void setDrives(String drives) { this.drives = drives; }
    public String getWineVersion() { return wineVersion; }
    public void setWineVersion(String wineVersion) { this.wineVersion = wineVersion; }
    public boolean isShowFPS() { return showFPS; }
    public void setShowFPS(boolean showFPS) { this.showFPS = showFPS; }
    public boolean isWow64Mode() { return wow64Mode; }
    public void setWow64Mode(boolean wow64Mode) { this.wow64Mode = wow64Mode; }
    public byte getStartupSelection() { return startupSelection; }
    public void setStartupSelection(byte startupSelection) { this.startupSelection = startupSelection; }
    public String getCpuList() { return cpuList; }
    public void setCpuList(String cpuList) { this.cpuList = cpuList; }
    public String getCpuListWoW64() { return cpuListWoW64; }
    public void setCpuListWoW64(String cpuListWoW64) { this.cpuListWoW64 = cpuListWoW64; }
    public String getDesktopTheme() { return desktopTheme; }
    public void setDesktopTheme(String desktopTheme) { this.desktopTheme = desktopTheme; }
    public String getBox86Preset() { return box86Preset; }
    public void setBox86Preset(String box86Preset) { this.box86Preset = box86Preset; }
    public String getBox64Preset() { return box64Preset; }
    public void setBox64Preset(String box64Preset) { this.box64Preset = box64Preset; }
    public File getRootDir() { return rootDir; }
    public void setRootDir(File rootDir) { this.rootDir = rootDir; }
    public JSONObject getExtraData() { return extraData; }
    public void setExtraData(JSONObject extraData) { this.extraData = extraData; }
}
