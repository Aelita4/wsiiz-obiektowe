import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComponentShowcase extends JFrame {
    private JPanel JPan;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JCheckBox useNewCredentialsCheckBox;
    private JCheckBox doNotLogOutCheckBox;
    private JTextField usernameField;
    private JTextField passwordField;
    private JButton loginButton;
    private JButton closeButton;
    private ButtonGroup group;

    public ComponentShowcase() {
        super("Showcase");

        group = new ButtonGroup();

        group.add(radioButton1);
        group.add(radioButton2);

        this.setContentPane(this.JPan);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "";

                String username = usernameField.getText();
                String password = passwordField.getText();

                if(username.isEmpty() || password.isEmpty()) msg += "Invalid username or password";
                else msg += "Logging in as " + username + " (" + password + ")";

                if(radioButton1.isSelected()) msg += "\nTried to connect to Hydrogen";
                else if(radioButton2.isSelected()) msg += "\nTried to connect to Helium";
                else msg += "\nTried to connect to unknown server";

                if(useNewCredentialsCheckBox.isSelected()) msg += "\nSelected to use new credentials";
                else msg += "\nSelected NOT to use new credentials";

                if(doNotLogOutCheckBox.isSelected()) msg += "\nSelected to not log out";
                else msg += "\nSelected to log out";

                JOptionPane.showMessageDialog(null, msg);
            }
        });
    }
}
