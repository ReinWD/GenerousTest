import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.Certificate;

/**
 * Created by 张巍 on 2017/1/21.
 */
public class HTTPConnectionTest {
    public static void main(String[] args) {
        try {
            URL github = new URL("https://www.baidu.com");
            HttpsURLConnection connection = (HttpsURLConnection) github.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(1000);
            connection.setReadTimeout(1000);
            connection.setDoOutput(true);
            connection.setInstanceFollowRedirects(true);


            String output = new String();
            OutputStream outputStream = connection.getOutputStream();
            outputStream.write(output.getBytes());
            outputStream.flush();
            outputStream.close();
            connection.connect();

            int responseCode = connection.getResponseCode();
            System.out.println(responseCode);
            String response = connection.getResponseMessage();
            System.out.println(response);
            InputStream in = connection.getInputStream();

            String inn = getStringFromInputStream(in);
            System.out.println(inn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getStringFromInputStream(InputStream in) throws IOException {
        String out = null;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int done = -1;
        while ((done=in.read())!=-1){
            outputStream.write(done);
        }
        in.close();
        out= outputStream.toString();
        outputStream.close();

        return out;
    }
}
