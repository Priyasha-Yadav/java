import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloWorld extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hello World", 150, 150);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World Example");
        HelloWorld panel = new HelloWorld();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}