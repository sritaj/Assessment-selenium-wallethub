package constants;


public final class FrameworkConstants {

    private FrameworkConstants() {
    }

    private static final String RESOURCEPATH = System.getProperty("user.dir");
    private static final String CHROMEDRIVERPATH = RESOURCEPATH + "/src/main/resources/drivers/chromedriver";
    private static final int EXPLICITWAIT_TIMEOUT = 30;
    private static final String WALLETHUBUSERNAME = "sritajpatel@outlook.com";
    private static final String WALLETHUBPASSWORD = "Sritaj1990#";

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }

    public static int getExplicitWaitTimeOut() {
        return EXPLICITWAIT_TIMEOUT;
    }

    public static String getWallethubusername() {
        return WALLETHUBUSERNAME;
    }

    public static String getWallethubpassword() {
        return WALLETHUBPASSWORD;
    }

}
