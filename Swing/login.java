package Swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 682, 326);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("I'd number :");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(213, 54, 127, 38);
        contentPane.add(lblNewLabel);

        JLabel lblPassword = new JLabel("Password :");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblPassword.setBounds(220, 121, 118, 38);
        contentPane.add(lblPassword);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 20));
        textField.setBounds(348, 55, 264, 38);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        textField_1.setColumns(10);
        textField_1.setBounds(348, 122, 264, 38);
        contentPane.add(textField_1);

        JButton btnNewButton = new JButton("Sign In");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textField.getText();
                String password = textField_1.getText();

                // Check the entered credentials against the list of users
                boolean loginSuccess = false;
                ArrayList<User> users = SingUp.getUsers();
                for (User user : users) {
                    if (user.getId().equals(username) && user.getPassword().equals(password)) {
                        loginSuccess = true;
                        break;
                    }
                }

                if (loginSuccess) {
                    JOptionPane.showMessageDialog(null, "Login Successful. Welcome!");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials. Please try again.");
                }
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnNewButton.setBounds(336, 210, 133, 38);
        contentPane.add(btnNewButton);

        JButton btnCreateAccount = new JButton("Sign Up");
        btnCreateAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SingUp singUpFrame = new SingUp();
                singUpFrame.setVisible(true);
                dispose();
            }
        });
        btnCreateAccount.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnCreateAccount.setBounds(479, 210, 133, 38);
        contentPane.add(btnCreateAccount);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Java OOP\\Java OOP\\ICE.png"));
        lblNewLabel_1.setBounds(0, 36, 203, 189);
        contentPane.add(lblNewLabel_1);
    }
}
