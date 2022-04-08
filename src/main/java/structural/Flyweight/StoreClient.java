package structural.Flyweight;

public class StoreClient {
    public static void main(String[] args) {
        StoreItemFactory factory = new StoreItemFactory();
        StoreItem bycycle = StoreItemFactory.getStoreItem(1, "Biciklete", "Biciklete e kuqe", 4000, "c:/photos/bicikleta.png");
        StoreItem book = StoreItemFactory.getStoreItem(2, "Libri 'Pipi Corape Gjata'", "Liber per femije", 100, "c:/photos/pipi.png");
        StoreItem dress = StoreItemFactory.getStoreItem(3, "Fustan per femije", "Fustan i kuq", 5000, "c:/photos/fustan.png");

        StoreItem bycycle2 = StoreItemFactory.getStoreItem(1, "Biciklete", "Biciklete e kuqe", 4000, "c:/photos/bicikleta.png");

        if (bycycle == bycycle2)
            System.out.println("Bicikletat jane te njejta");
        else
            System.out.println("Bicikeltat nuk jane te njejta");
    }
}
