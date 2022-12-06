import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private JPanel JPanel1;
    private JButton convertButton;
    private JTextField celcius;

    public static void main(String[] args) {
        Main m = new Main();
        m.setVisible(true);

        ComponentShowcase c = new ComponentShowcase();
        c.setVisible(true);
    }

    public Main() {
        super("aaa");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "";

                try {
                   double celciusTemp = Double.parseDouble(celcius.getText());
                   if(celciusTemp < 273.15) throw new NumberFormatException("Can't calculate below absolute zero");
                   double fahrenheitTemp = celciusTemp * 1.8 + 32;
                   msg += celciusTemp + "C = " + fahrenheitTemp + "F";
                } catch(NumberFormatException ex) {
                    msg +=  "Invalid number: " + ex.getMessage();
                }
                JOptionPane.showMessageDialog(null, msg);
            }
        });
    }
}
