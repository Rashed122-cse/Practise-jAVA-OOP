import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingExample {
    public static void main(String[] args) {
        // Create a new JFrame container
        JFrame frame = new JFrame("Swing Example");

        // Set the frame size
        frame.setSize(300, 200);

        // Specify an action for the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button
        JButton button = new JButton("Click Me!");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Show a message dialog
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        // Add the button to the frame's content pane
        frame.add(button);

        // Display the frame
        frame.setVisible(true);
    }
}
