package creational.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        //Lazy Singleton
        AppConfigurationLazy appConfigurationLazy1 = AppConfigurationLazy.getConfiguration();
        appConfigurationLazy1.setDbName("SDADb");
        appConfigurationLazy1.setDbPassword("Sda17");
        appConfigurationLazy1.setDbPort(1400);

        AppConfigurationLazy appConfigurationLazy2 = AppConfigurationLazy.getConfiguration();

        if (appConfigurationLazy1 == appConfigurationLazy2)
            System.out.println("Objektet referojne tek e njejta adrese.");

        else
            System.out.println("Objektet jane dy objekte te ndryshme!");

        //Eager Singleton
        AppConfigurationEager appConfigurationEager1 = AppConfigurationEager.getConfiguration();
        appConfigurationEager1.setDbName("SDADB");
        appConfigurationEager1.setDbPassword("Sda17");
        appConfigurationEager1.setDbPort(1500);

        AppConfigurationEager appConfigurationEager2 = AppConfigurationEager.getConfiguration();

        if (appConfigurationEager1 == appConfigurationEager2)
            System.out.println("Objektet referojne tek e njejta adrese.");

        else
            System.out.println("Objektet jane dy objekte te ndryshme!");

        //Enum Singleton
        AppConfigurationEnum appConfigurationEnum1 = AppConfigurationEnum.INSTANCE;
        AppConfigurationEnum appConfigurationEnum2 = AppConfigurationEnum.INSTANCE;
        appConfigurationEnum1.setDbName("AppDbEnum");
        appConfigurationEnum1.setDbPassword("AppDbPassEnum");
        appConfigurationEnum1.setDbPort(1600);

        System.out.println(appConfigurationEnum2.getDbName());
        System.out.println(appConfigurationEnum2.getDbPassword());
        System.out.println(appConfigurationEnum2.getDbPort());
    }
}
