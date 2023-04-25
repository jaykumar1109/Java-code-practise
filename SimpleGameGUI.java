import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SimpleGameGUI extends JFrame {
    private int score = 0;
    private JLabel scoreLabel = new JLabel("score:" + score);
    private JButton addButton = new JButton("Add 1");

    public SimpleGameGUI() {
        super("Simple Game");
        //set up GUI Components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(scoreLabel);
        addButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(addButton);
        //Add Button listerner
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score++;
                scoreLabel.setText("Score:" + score);
            }
        });
        //set up JFrame
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleGameGUI game = new SimpleGameGUI();
    }

}
