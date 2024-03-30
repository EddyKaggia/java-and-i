import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        // Create a JFrame object -> Graphical window
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(label);
        // Set its size
        frame.setSize(300, 300);
        // Make it visible
        frame.setVisible(true);
    }
}