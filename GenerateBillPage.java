import javax.swing.*;
import java.awt.*;

public class GenerateBillPage extends JFrame {
    private JButton totalBillButton;
    private double totalgst;
    private int newSum;
    private JButton gst;
    private double net;
    private JButton Net;

    public GenerateBillPage() {
        setLayout(new GridLayout(3, 1));
        totalBillButton = new JButton("Total Bill: Rs 0");
        totalBillButton.setFont(new Font("Arial", Font.BOLD, 20));
        gst = new JButton("Gst: Rs 0.0");
        gst.setFont(new Font("Arial", Font.BOLD, 20));
        Net = new JButton("Net Bill: Rs 0.0");
        Net.setFont(new Font("Arial", Font.BOLD, 20));
        totalBillButton.setBackground(new Color(227, 188, 154)); // Set background color
        totalBillButton.setForeground(Color.BLACK);
        gst.setBackground(new Color(227, 188, 154)); // Set background color
        gst.setForeground(Color.BLACK);
        Net.setBackground(new Color(227, 188, 154)); // Set background color
        Net.setForeground(Color.BLACK);
        add(totalBillButton);
        add(gst);
        add(Net);

        setTitle("Generate Bill");
        setSize(700, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        setVisible(true);
    }

    public void updateNewSum(int sum) {
        newSum = sum;
        totalBillButton.setText("Total Bill: Rs " + newSum);
        totalgst = (double) 0.18 * newSum;
        gst.setText("Gst: Rs " + totalgst);
        net = (double) totalgst + newSum;
        Net.setText("Net Bill: Rs " + net);
    }
}
