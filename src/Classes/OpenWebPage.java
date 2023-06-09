package Classes;
import java.awt.*;
import java.net.URI;
import java.net.URL;
public class OpenWebPage {
    public void location(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
