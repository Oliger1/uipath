package structural.ProxyInvoice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class InvoiceClient {
    public static void main(String[] args) {
        InvoiceDownloader invoiceDownloader = new RealInvoiceDownloader();
        InvoiceDownloader proxyDownload = new ProxyInvoiceDownloader(invoiceDownloader);
        String invoiceInfo = "";
        var startTime = System.currentTimeMillis();
        for(int i =0; i<10; i++) {
            invoiceInfo = proxyDownload.getInvoiceFromDPT("E5E21664E1922C7DEBADB1A40884E24E", "L41506013B", "2022-12-25T11:47:06 01:00");
        }
        var endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
        System.out.println(invoiceInfo);
    }


}
