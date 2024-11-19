package Swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;  // Import JPasswordField for password input
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SingUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textName;
    private JTextField textId;
    private JPasswordField passwordField;  // Use JPasswordField for password input

    private static ArrayList<User> users = new ArrayList<>();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SingUp frame = new SingUp();
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
    public SingUp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 755, 399);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Java OOP\\Java OOP\\ICE.png"));
        lblNewLabel.setBounds(10, 36, 225, 222);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name :");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1.setBounds(292, 36, 98, 38);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Roll I'd :");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(276, 114, 114, 38);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_2 = new JLabel("Password :");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_1_2.setBounds(268, 194, 122, 38);
        contentPane.add(lblNewLabel_1_2);

        textName = new JTextField();
        textName.setFont(new Font("Tahoma", Font.BOLD, 17));
        textName.setBounds(400, 36, 225, 38);
        contentPane.add(textName);
        textName.setColumns(10);

        textId = new JTextField();
        textId.setFont(new Font("Tahoma", Font.BOLD, 17));
        textId.setColumns(10);
        textId.setBounds(400, 118, 225, 38);
        contentPane.add(textId);

        // Use JPasswordField for the password
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.BOLD, 17));
        passwordField.setBounds(400, 198, 225, 38);
        contentPane.add(passwordField);

        JButton btnNewButton = new JButton("Create Account ");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Store user input in the ArrayList
                String name = textName.getText();
                String id = textId.getText();
                char[] passwordChars = passwordField.getPassword(); // Retrieve password
                String password = new String(passwordChars); // Convert char[] to String

                // Create a new User object and add it to the list
                User newUser = new User(name, id, password);
                users.add(newUser);

                JOptionPane.showMessageDialog(null, "Account Created! You can now log in.");

                // Go back to the login page
                login frame = new login();
                frame.setVisible(true);
                dispose();  // Close the sign-up frame
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton.setBounds(275, 284, 191, 38);
        contentPane.add(btnNewButton);

        JButton btnCancel = new JButton("Cancel ");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login frame = new login();
                frame.setVisible(true);
                dispose();
            }
        });
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnCancel.setBounds(503, 284, 122, 38);
        contentPane.add(btnCancel);
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}
