package creational.Singleton;

public class AppConfigurationLazy {
    private static AppConfigurationLazy INSTANCE;
    private String DbName;
    private int DbPort;
    private String DbPassword;

    private AppConfigurationLazy() {
    }

    public static synchronized AppConfigurationLazy getConfiguration() {
        if (INSTANCE == null) {
            INSTANCE = new AppConfigurationLazy();
        }
        return INSTANCE;
    }

    public static AppConfigurationLazy getConfiguration2() {
        if (INSTANCE == null) {
            synchronized (creational.Singleton.AppConfigurationLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AppConfigurationLazy();
                }
            }
        }
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
