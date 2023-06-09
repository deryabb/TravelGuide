import Classes.OpenWebPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SanatsalEtkinliklerFrame extends  JFrame{
    private JPanel panel1;
    private JButton kulturSanatButton;
    private JButton konserlerButton;
    private JButton tiyatroButton;
    private JButton konumButton;
    private JButton konumButton1;
    private JButton konumButton2;

    public SanatsalEtkinliklerFrame(){
        OpenWebPage openWebPage = new OpenWebPage();
        setContentPane(panel1);
        setTitle("Sanatsal Etkinlikler");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                IstanbulFrame istanbulFrame = new IstanbulFrame();
            }
        });
        kulturSanatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/%C4%B0stanbul_K%C3%BClt%C3%BCr_Sanat_Vakf%C4%B1");
            }
        });
        konserlerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/K%C3%BC%C3%A7%C3%BCk%C3%87iftlik_Park1");
            }
        });
        tiyatroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/%C4%B0stanbul_Devlet_Tiyatrosu");
            }
        });
        konumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/TDxzYiRwEcAuPJoJ6");
            }
        });
        konumButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/LE7xEaLAaNet3p4k9");
            }
        });
        konumButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/TDxzYiRwEcAuPJoJ6");
            }
        });
    }
}
