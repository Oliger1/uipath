package creational.Singleton;

public class AppConfigurationEager {
    private static AppConfigurationEager INSTANCE = new AppConfigurationEager();
    private String DbName;
    private int DbPort;
    private String DbPassword;

//comment
    private AppConfigurationEager() {
    }

    public static AppConfigurationEager getConfiguration() {
        return INSTANCE;
    }

    public String getDbName() {
        return DbName;
    }

    public void setDbName(String dbName) {
        DbName = dbName;
    }

    public int getDbPort() {
        return DbPort;
    }

    public void setDbPort(int dbPort) {
        DbPort = dbPort;
    }

    public String getDbPassword() {
        return DbPassword;
    }

    public void setDbPassword(String dbPassword) {
        DbPassword = dbPassword;
    }
}
