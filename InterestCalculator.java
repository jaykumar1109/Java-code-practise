import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class InterestCalculator extends JFrame implements ActionListener {
    private JLabel principalLabel;
    private JTextField principalField;
    private JLabel rateLabel;
    private JTextField rateField;
    private JLabel timeLabel;
    private JTextField timeField;
    private JLabel interestLabel;
    private JTextField interestField;
    private JButton calculateButton;

    public InterestCalculator() {
        super("interest Calculator");
        setLayout(new GridLayout(5, 2, 5, 5));
        principalLabel = new JLabel("Principal:");
        add(principalLabel);
        principalField = new JTextField(10);
        add(principalField);
        rateLabel = new JLabel("Rate");
        add(rateLabel);
        rateField = new JTextField(10);
        add(rateField);
        timeLabel = new JLabel("Time:");
        add(timeLabel);
        timeField = new JTextField(10);
        add(timeField);
        interestLabel = new JLabel("Interest:");
        add(interestLabel);
        interestField = new JTextField(10);
        interestField.setEditable(false);
        add(interestField);
        calculateButton = new JButton("Calculator");
        calculateButton.addActionListener(this);
        add(calculateButton);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double principal = Double.parseDouble(principalField.getText());
        double rate = Double.parseDouble(rateField.getText());
        double time = Double.parseDouble(timeField.getText());
        double interest = (principal * rate * time) / 100;
        interestField.setText(Double.toString(interest));
    }

    public static void main(String[] args) {
        new InterestCalculator();
    }
}

