import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    private static final String USERNAME = "Rashed122";
    private static final String PASSWORD = "Rashed122";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn frame = new LogIn();
                    frame.setVisible(true);
                    ImageIcon image = new ImageIcon("ICE.png");
                    frame.setIconImage(image.getImage());
                    frame.getContentPane().setBackground(new Color(255, 255, 255, 255));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LogIn() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 688, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("User Name:");
        lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblUsername.setBounds(336, 72, 99, 72);
        lblUsername.setForeground(Color.BLUE); // Set text color to blue
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblPassword.setBounds(336, 144, 89, 72);
        lblPassword.setForeground(Color.RED); // Set text color to red
        contentPane.add(lblPassword);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(435, 87, 218, 46);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBounds(435, 159, 218, 46);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnLogin.setBounds(435, 231, 127, 46);
        contentPane.add(btnLogin);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = new String(passwordField.getPassword());

                if (USERNAME.equals(username) && PASSWORD.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Thank you Sir for checking my program");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JLabel imageLabel = new JLabel(new ImageIcon("ICE.png"));
        imageLabel.setBounds(10, 10, 300, 300);
        contentPane.add(imageLabel);


    }
}
