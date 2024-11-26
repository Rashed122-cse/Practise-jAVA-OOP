import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculatorGUI extends JFrame {

    private JTextField displayField;
    private StringBuilder input = new StringBuilder();
    private double firstOperand = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window on the screen

        // Create the display field
        displayField = new JTextField();
        displayField.setFont(new Font("Arial", Font.PLAIN, 30));
        displayField.setEditable(false);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        
        // Create the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10)); // 4x4 grid layout

        // Digits and operator buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 30));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        // Set the layout of the frame
        setLayout(new BorderLayout());
        add(displayField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Handle numeric inputs
            if ("0123456789.".contains(command)) {
                if (isOperatorClicked) {
                    input.setLength(0);  // Clear input if a new number is clicked after an operator
                    isOperatorClicked = false;
                }
                input.append(command);
                displayField.setText(input.toString());
            }

            // Handle operations
            else if (command.equals("=")) {
                if (operator.isEmpty()) {
                    return;  // Prevent calculation if no operator is selected
                }
                double secondOperand = Double.parseDouble(input.toString());
                double result = 0;

                // Perform the calculation based on the operator
                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand == 0) {
                            displayField.setText("Error");
                            return;
                        }
                        result = firstOperand / secondOperand;
                        break;
                }

                input.setLength(0);  // Clear the input after calculation
                input.append(result);
                displayField.setText(input.toString());
                operator = "";
            }

            // Handle operators (+, -, *, /)
            else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                if (input.length() == 0) {
                    return;  // No operator if there's no input
                }
                firstOperand = Double.parseDouble(input.toString());
                operator = command;
                isOperatorClicked = true;  // After clicking an operator, prepare for the next number
            }
        }
    }

    public static void main(String[] args) {
        // Run the GUI application on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SimpleCalculatorGUI().setVisible(true);
            }
        });
    }
}
