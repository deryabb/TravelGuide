import Classes.OpenWebPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AntikKentlerFrame extends JFrame{
    private JPanel panel1;
    private JButton aspendosButton;
    private JButton olimposButton;
    private JButton pataraButton;
    private JButton myraButton;
    private JButton konumButton;
    private JButton konumButton2;
    private JButton konumButton3;
    private JButton konumButton4;

    public AntikKentlerFrame(){
        OpenWebPage openWebPage = new OpenWebPage();
        setContentPane(panel1);
        setTitle("Antik Kentler");
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
        aspendosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Aspendos");
            }
        });
        olimposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Olimpos,_Kumluca");
            }
        });
        myraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Mira_(antik_kent)");
            }
        });
        pataraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Patara");
            }
        });
        konumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/mLjyzKuobWW5c4Kn7");
            }
        });
        konumButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/6ZUkPMBLwAFS5Ckj7");
            }
        });
        konumButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/w2vHNfMiiEqiZGBfA");
            }
        });
        konumButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/rNRyD4HM1N9jrdv48");
            }
        });
    }
}
