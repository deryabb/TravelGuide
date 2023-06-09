import Classes.OpenWebPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PlajlarFrame extends JFrame{
    private JPanel panel1;
    private JButton kemerButton;
    private JButton olimposButton;
    private JButton konyaaltıButton;
    private JButton konumButton;
    private JButton konumButton1;
    private JButton konumButton2;
    private JButton karainButton;
    private JButton konum2;

    public PlajlarFrame(){
        OpenWebPage openWebPage = new OpenWebPage();
        setContentPane(panel1);
        setTitle("Antalya Plajları");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                AntalyaFrame antalyaFrame = new AntalyaFrame();
            }
        });
        kemerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Kemer,_Antalya");
            }
        });
        olimposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Olimpos,_Kumluca");
            }
        });
        konyaaltıButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Konyaalt%C4%B1");
            }
        });
        karainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Karain_Ma%C4%9Faras%C4%B1");
            }
        });
        konumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/K8n8Lg1w9qeBLALE9");
            }
        });
        konumButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/6ZUkPMBLwAFS5Ckj7");
            }
        });
        konumButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/SZb3iS1MuGQz8xJx9");
            }
        });
        konum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/EQswL4udvEJwp4V99");
            }
        });
    }
}
