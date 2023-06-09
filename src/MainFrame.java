import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {
    private JPanel panel1;
    private JLabel label_ana_baslik;
    private JLabel label_aciklama;
    public JComboBox comboBoxSehir;
    private JPanel imgPanel1;
    private JPanel imgPanel2;
    private JLabel labelImage;
    public MainFrame(){
        setContentPane(panel1);

        String[] country = new String[]{"Şehir Seçiniz","İstanbul","Antalya"};
        comboBoxSehir.setModel(new DefaultComboBoxModel(country));
        setTitle("TURİSTLER İÇİN TUR REHBERİ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setVisible(true);

        comboBoxSehir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBoxSehir.getSelectedItem().toString().equals("İstanbul")){
                    IstanbulFrame ist = new IstanbulFrame();
                    setVisible(false);
                }
                if (comboBoxSehir.getSelectedItem().toString().equals("Antalya")){
                    AntalyaFrame ant = new AntalyaFrame();
                    setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args){
        MainFrame f = new MainFrame();
    }
}
