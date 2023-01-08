package structural.ProxyInvoice;

public interface InvoiceDownloader {
    public String getInvoiceFromDPT(String iic, String nuis, String dateTimeCreated);
}
