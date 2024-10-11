package question2;

import javax.swing.*;
import java.awt.*;

public class PresentationLayer {

    public void designUI() {
        JFrame frame = new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 200, 50);
        button.setBackground(Color.GREEN);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        
        panel.add(button);
    }

    public static void main(String[] args) {
    	PresentationLayer ui = new PresentationLayer();
        ui.designUI();
    }
}