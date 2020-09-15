package util;


import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;


public class HttpUtils {
    private static CloseableHttpClient client;
    
    
    public static CloseableHttpClient getClient() {
        if (client == null)
            client = HttpClients.createDefault();
        
        return client;
    }
    
    
    public static void closeClient() throws IOException {
        if (client != null) {
            client.close();
            client = null;
        }
    }
}
