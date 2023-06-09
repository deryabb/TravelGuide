import Classes.OpenWebPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EglenceMekanlariFrame extends JFrame {
    private JPanel panel1;
    private JButton taksimButton;
    private JButton nisantasiButton;
    private JButton bebekButton;
    private JButton kadikoyButton;
    private JButton konumButton;
    private JButton konumButton2;
    private JButton konumButton3;
    private JButton konumButton4;

    public EglenceMekanlariFrame(){
        OpenWebPage openWebPage = new OpenWebPage();
        setContentPane(panel1);
        setTitle("Eğlence Mekanları");
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
        taksimButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Taksim_Meydan%C4%B1");
            }
        });
        nisantasiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Ni%C5%9Fanta%C5%9F%C4%B1");
            }
        });
        kadikoyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Kad%C4%B1k%C3%B6y");
            }
        });
        bebekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Bebek,_Be%C5%9Fikta%C5%9F");
            }
        });
        konumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/WMGR6mZ1W11kqtG37");
            }
        });
        konumButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/4rcbKjfYPcLCc9SA6");
            }
        });
        konumButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/ceTRjcvvb7a6X25B9");
            }
        });
        konumButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/Rga9XKECS6RVmkxj8");
            }
        });
    }
}
