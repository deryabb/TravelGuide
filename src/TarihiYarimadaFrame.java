import Classes.OpenWebPage;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TarihiYarimadaFrame extends JFrame {
    private JPanel panel1;
    private JButton konumButton;
    private JButton konum2;
    private JButton konum3;
    private JButton konum4;
    private JButton konum5;
    private JButton konum6;
    private JButton konum7;
    private JButton konum8;
    private JButton konum9;
    private JButton unkapaniButton;
    private JButton cemberlitasButton;
    private JButton topkapiButton;
    private JButton beyazitButton;
    private JButton suleymaniyeButton;
    private JButton kapalicarsiButton;
    private JButton misircarsisiButton;
    private JButton sultanahmetButton;
    private JButton eminonuButton;

    public TarihiYarimadaFrame(){
        OpenWebPage openWebPage = new OpenWebPage();
        setContentPane(panel1);
        setTitle("Tarihi Yarımada");
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
        konumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/9Ln6eUJAyA9uKBoHA");
            }
        });
        konum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/RW9PPLfdAEestcmr9");
            }
        });
        konum3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/e9jCcq6xdCrp9cP58");
            }
        });
        konum4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/GCDKt8Bc75vDpDxs8");
            }
        });
        konum5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/68mncCknVqRWqFuaA");
            }
        });
        konum6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/FRBmPNFY1ptLb63h6");
            }
        });
        konum7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/HZzcRHet7rSV9H3M8");
            }
        });
        konum8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/YAm5moFdvNzeJ7Ve9");
            }
        });
        konum9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://goo.gl/maps/bF7mFnLM6NBB95MY7");
            }
        });
        unkapaniButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Unkapan%C4%B1");
            }
        });
        cemberlitasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/%C3%87emberlita%C5%9F_S%C3%BCtunu");
            }
        });
        topkapiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Topkap%C4%B1_Saray%C4%B1");
            }
        });
        beyazitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Beyaz%C4%B1t,_Fatih");
            }
        });
        suleymaniyeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/S%C3%BCleymaniye_Camii");
            }
        });
        kapalicarsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Kapal%C4%B1%C3%A7ar%C5%9F%C4%B1");
            }
        });
        misircarsisiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/M%C4%B1s%C4%B1r_%C3%87ar%C5%9F%C4%B1s%C4%B1");
            }
        });
        sultanahmetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Sultanahmet_Meydan%C4%B1");
            }
        });
        eminonuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWebPage.location("https://tr.wikipedia.org/wiki/Emin%C3%B6n%C3%BC");
            }
        });
    }
}