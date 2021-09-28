import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JPanel panel;
    private JFrame frame;

    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Kast terning");
        button.addActionListener(this);

        label = new JLabel("Antal kast: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Terningspil GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText
    }
}
