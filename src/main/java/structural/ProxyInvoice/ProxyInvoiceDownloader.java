package structural.ProxyInvoice;

import java.util.HashMap;

public class ProxyInvoiceDownloader implements InvoiceDownloader {
    private InvoiceDownloader downloader;

    HashMap<String, String> cache = new HashMap<>();

    public ProxyInvoiceDownloader(InvoiceDownloader downloader) {
        this.downloader = downloader;
    }

    public InvoiceDownloader getDownloader() {
        return downloader;
    }

    public void setDownloader(InvoiceDownloader downloader) {
        this.downloader = downloader;
    }

    @Override
    public String getInvoiceFromDPT(String iic, String nuis, String dateTimeCreated) {
        if(cache.containsKey(iic))
            return cache.get(iic);
        else {
            var invoiceInfo = this.downloader.getInvoiceFromDPT(iic, nuis, dateTimeCreated);
            cache.put(iic, invoiceInfo);
            return invoiceInfo;
        }
    }
}
