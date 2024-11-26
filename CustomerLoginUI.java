import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLoginUI {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Customer Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Set background color
        JPanel backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                // Gradient background
                GradientPaint gp = new GradientPaint(0, 0, new Color(3, 37, 76), getWidth(), getHeight(), new Color(4, 61, 92));
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        backgroundPanel.setBounds(0, 0, 400, 300);
        frame.add(backgroundPanel);
        backgroundPanel.setLayout(null);

        // Add "Customer Login" label
        JLabel loginLabel = new JLabel("CUSTOMER LOGIN");
        loginLabel.setBounds(100, 20, 200, 30);
        loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loginLabel.setFont(new Font("Arial", Font.BOLD, 18));
        loginLabel.setForeground(Color.WHITE);
        backgroundPanel.add(loginLabel);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(50, 70, 80, 25);
        emailLabel.setForeground(Color.WHITE);
        backgroundPanel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(140, 70, 200, 25);
        backgroundPanel.add(emailField);

        // Password Label and Password Field
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 110, 80, 25);
        passwordLabel.setForeground(Color.WHITE);
        backgroundPanel.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(140, 110, 200, 25);
        backgroundPanel.add(passwordField);

        // "Remember Me" Checkbox
        JCheckBox rememberMeCheckbox = new JCheckBox("Remember me");
        rememberMeCheckbox.setBounds(140, 150, 150, 20);
        rememberMeCheckbox.setForeground(Color.WHITE);
        rememberMeCheckbox.setOpaque(false);
        backgroundPanel.add(rememberMeCheckbox);

        // "Forgot Password" Button
        JButton forgotPasswordButton = new JButton("Forgot Password?");
        forgotPasswordButton.setBounds(140, 180, 200, 25);
        forgotPasswordButton.setContentAreaFilled(false);
        forgotPasswordButton.setBorderPainted(false);
        forgotPasswordButton.setForeground(Color.CYAN);
        backgroundPanel.add(forgotPasswordButton);

        // Login Button
        JButton loginButton = new JButton("LOGIN");
        loginButton.setBounds(140, 220, 100, 30);
        loginButton.setBackground(new Color(20, 120, 100));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        backgroundPanel.add(loginButton);

        // Action Listener for Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                if (!email.isEmpty() && !password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}