package structural.ProxyInvoice;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import okhttp3.*;

import java.io.IOException;

public class RealInvoiceDownloader implements InvoiceDownloader{
    public String getInvoiceFromDPT(String iic, String nuis, String dateTimeCreated)  {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("iic",iic)
                .addFormDataPart("dateTimeCreated",dateTimeCreated)
                .addFormDataPart("tin",nuis)
                .build();
        Request request = new Request.Builder()
                .url("https://efiskalizimi-app.tatime.gov.al/invoice-check/api/verifyInvoice")
                .method("POST", body)
                .build();
        try {
            Response response = client.newCall(request).execute();

            var invoiceInfo = response.body().string();
            return getFormatedInvoice(invoiceInfo);
        }
        catch(IOException e)
        {
            System.out.println("Problem ne komunikimin me serverin e tatimeve!");
        }
        return null;
    }
    private static String getFormatedInvoice(String invocieInfo) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = JsonParser.parseString(invocieInfo);
        String formatedInvoice = gson.toJson(je);
        return formatedInvoice;
    }
}
