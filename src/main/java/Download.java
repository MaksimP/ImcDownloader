import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Download implements Runnable {

    private String url_connection = "http://ims-kharkov.narod.ru/xls";

    @Override
    public void run() {
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        String url_file_download;

        for (int i = 0; i < ListFiles.getList_file().length; i++) {
            try {
                int buffer;
                url_file_download = url_connection + "/" + ListFiles.getNameFile(i);
                URL url = new URL(url_file_download);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                inputStream = connection.getInputStream();
                fileOutputStream = new FileOutputStream(ListFiles.getNameFile(i));

                while ((buffer = inputStream.read()) != -1) {
                    fileOutputStream.write(buffer);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
