package com.delkabo.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static String loginLitres = config.LoginLitres();

    public static String passwordLitres = config.PasswordLitres();

    public static boolean isWebMobile() {
        return !config.browserMobileView().equals("");
    }

    public static boolean isRemoteWebDriver() {
        return !config.remoteDriverUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
