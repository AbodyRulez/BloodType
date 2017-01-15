package sample;
import javafx.fxml.FXML;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Controller{

    @FXML
    private void handleButtonAction() {
        URL url = null;
        try {
            url = new URL("http://gscorner.net/bloodtype/fire.php");
            URLConnection urlConnection = url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            in.read();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}