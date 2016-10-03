import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/28.
 */
public class NotHelloWorld extends JApplet {
    public void init(){
        EventQueue.invokeLater(() -> {
            JLabel label = new JLabel("Not a Hello, World applet", SwingConstants.CENTER);
            add(label);
        });
    }
}
