import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10, 10));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Rock Paper Scissors");
        frame.pack();
        frame.setVisible(true);
    }
}
