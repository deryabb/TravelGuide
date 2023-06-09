import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AntalyaFrame extends JFrame {
    private JPanel panel1;
    private JButton plajlarButton;
    private JButton antikkentlerButton;

    public AntalyaFrame(){
        setContentPane(panel1);
        setTitle("Antalya");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                MainFrame mainFrame = new MainFrame();
            }
        });
        plajlarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PlajlarFrame plajlarFrame = new PlajlarFrame();
                setVisible(false);
            }
        });
        antikkentlerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AntikKentlerFrame antikKentlerFrame = new AntikKentlerFrame();
                setVisible(false);
            }
        });
    }
}
