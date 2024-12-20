import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;

public class M2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        ImageIcon image1 = new ImageIcon("coffee.png");
        label.setText("Oasis Cafe");
        label.setIcon(image1);
        Border border = BorderFactory.createLineBorder(Color.black, 3);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(new Color(227, 188, 154));
        label.setFont(new Font("Garamond", Font.BOLD, 40));
        frame.setTitle("CAFE HOUSE");
        label.setBorder(border);
        label.setBounds(20, 200, 600, 250);
        ImageIcon image = new ImageIcon("fan.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(92, 64, 51));
        JButton viewMenuButton = new JButton("View Menu");
        viewMenuButton.setBounds(100, 100, 100, 30);
        viewMenuButton.setFocusable(false);
        viewMenuButton.setBackground(Color.WHITE);
        viewMenuButton.setForeground(Color.BLACK);
        viewMenuButton.setFont(new Font("Arial", Font.BOLD, 16));
        GenerateBillPage generateBillPage = new GenerateBillPage();
        backgr menuFrame = new backgr(generateBillPage);
        viewMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the cafe menu
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        backgr menuFrame = new backgr(generateBillPage);
                        menuFrame.setSize(700, 700);
                        menuFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                        menuFrame.setVisible(true);
                    }
                });
            }
        });

        ImageIcon image2 = new ImageIcon("fan.jpg");
        Image fanImage = image2.getImage().getScaledInstance(300, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledsanIcon = new ImageIcon(fanImage);
        JLabel j1 = new JLabel(scaledsanIcon);
        j1.setBounds(100, -30, 50, 30);
        frame.add(label);
        frame.add(j1);
        frame.add(viewMenuButton);
        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
