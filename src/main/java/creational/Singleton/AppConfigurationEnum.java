package creational.Singleton;

public enum AppConfigurationEnum {
    INSTANCE;
    private String DbName;
    private int DbPort;
    private String DbPassword;

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
