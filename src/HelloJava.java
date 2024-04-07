package ch02;

// Abstract Window Toolkit (awt)
import java.awt.*;
// Swing is Java's' UI toolkit
import javax.swing.*;

public class HelloJava {
    // Main serves as entry point into the program
    // Static method
    // Public -> Public access
    // Void -> Doesn't return anything
    // Takes an array of Strings as parameters
    public static void main(String[] args) {
        // Create a JFrame object -> Graphical window
        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent());
        // Set its size
        frame.setSize(300, 300);
        // Make it visible
        frame.setVisible(true);
    }
}

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 10, 10);
    }
}


