import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class IstanbulFrame extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private JButton button3;
    private JButton sanatsalEtkinliklerButton;

    public IstanbulFrame(){
        setContentPane(panel1);
        setTitle("İstanbul");
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
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TarihiYarimadaFrame tarihiYarimadaFrame = new TarihiYarimadaFrame();
                setVisible(false);
            }
        });
        sanatsalEtkinliklerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            SanatsalEtkinliklerFrame sanatsalEtkinliklerFrame = new SanatsalEtkinliklerFrame();
            setVisible(false);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EglenceMekanlariFrame eglenceMekanlariFrame = new EglenceMekanlariFrame();
                setVisible(false);
            }
        });
    }
}
