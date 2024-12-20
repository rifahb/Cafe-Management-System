import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class backgr extends JFrame implements ActionListener {
    private static int sum;
    private static GenerateBillPage generateBillPage;

    public backgr(GenerateBillPage generateBillPage) {
        this.generateBillPage = generateBillPage;
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new GridLayout(5, 3));

        JButton Coffee = new JButton("Cold coffee\t Rs 120.0");
        JButton Tea = new JButton("Iced Tea \t Rs 120.0");
        JButton Sandwich = new JButton("Cheese Sandwich \t Rs 80.0");
        JButton Cake = new JButton("Cake \t Rs 70.0");
        JButton pizza = new JButton("pizza \t Rs 160.0");
        ImageIcon cf = new ImageIcon("icc.jpg");
        Image cfImage = cf.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon scaledCfIcon = new ImageIcon(cfImage);
        Coffee.setIcon(scaledCfIcon);

        ImageIcon ck = new ImageIcon("cake.jpg");
        Image ckImage = ck.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon scaledCkIcon = new ImageIcon(ckImage);
        Cake.setIcon(scaledCkIcon);
        ImageIcon T = new ImageIcon("ict.jpg");
        Image TImage = T.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon scaledTIcon = new ImageIcon(TImage);
        Tea.setIcon(scaledTIcon);
        ImageIcon san = new ImageIcon("grilled-cheese.jpg");
        Image sanImage = san.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon scaledsanIcon = new ImageIcon(sanImage);
        Sandwich.setIcon(scaledsanIcon);
        ImageIcon pj = new ImageIcon("piz.jpg");
        Image pjImage = pj.getImage().getScaledInstance(250, 180, Image.SCALE_SMOOTH);
        ImageIcon scaledpjIcon = new ImageIcon(pjImage);
        pizza.setIcon(scaledpjIcon);

        JButton Coffee1 = new JButton("Cold coffee\t ");
        Coffee1.setBackground(new Color(227, 188, 154)); // Set background color
        Coffee1.setForeground(Color.BLACK);
        JButton Tea1 = new JButton("Iced Tea \t ");
        Tea1.setBackground(new Color(227, 188, 154)); // Set background color
        Tea1.setForeground(Color.BLACK);
        JButton Sandwich1 = new JButton("Cheese Sandwich \t ");
        Sandwich1.setBackground(new Color(227, 188, 154)); // Set background color
        JButton Cake1 = new JButton("Cake \t ");
        Cake1.setBackground(new Color(227, 188, 154)); // Set background color
        JButton pizza1 = new JButton("Pizza \t ");
        pizza1.setBackground(new Color(227, 188, 154)); // Set background color
        JButton Coffee2 = new JButton("Click to Order");
        JButton Tea2 = new JButton("Click to Order");
        JButton Sandwich2 = new JButton("Click to Order");
        JButton Cake2 = new JButton("Click to Order");
        JButton pizza2 = new JButton("Click to Order");
        Cake2.setBackground(new Color(92, 64, 51));
        Coffee2.setBackground(new Color(92, 64, 51));
        pizza2.setBackground(new Color(92, 64, 51));
        Sandwich2.setBackground(new Color(92, 64, 51));
        Tea2.setBackground(new Color(92, 64, 51));
        Coffee2.addActionListener(this);
        Tea2.addActionListener(this);
        Sandwich2.addActionListener(this);
        Cake2.addActionListener(this);
        pizza2.addActionListener(this);
        pizza1.setFont(new Font("Arial", Font.BOLD, 16));
        Tea1.setFont(new Font("Arial", Font.BOLD, 16));

        Sandwich1.setFont(new Font("Arial", Font.BOLD, 16));
        Coffee1.setFont(new Font("Arial", Font.BOLD, 16));
        Cake1.setFont(new Font("Arial", Font.BOLD, 16));
        Cake2.setForeground(Color.WHITE);
        Cake2.setFont(new Font("Arial", Font.BOLD, 16));
        Coffee2.setForeground(Color.WHITE);
        Coffee2.setFont(new Font("Arial", Font.BOLD, 16));
        pizza2.setForeground(Color.WHITE);
        pizza2.setFont(new Font("Arial", Font.BOLD, 16));
        Sandwich2.setForeground(Color.WHITE);
        Sandwich2.setFont(new Font("Arial", Font.BOLD, 16));
        Tea2.setForeground(Color.WHITE);
        Tea2.setFont(new Font("Arial", Font.BOLD, 16));
        add(Coffee1);
        add(Coffee);
        add(Coffee2);
        add(Tea1);
        add(Tea);
        add(Tea2);
        add(Sandwich1);
        add(Sandwich);
        add(Sandwich2);
        add(Cake1);
        add(Cake);
        add(Cake2);
        add(pizza1);
        add(pizza);
        add(pizza2);

        setSize(700, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only the grid frame on exit
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        sum = sum + 150;
        JOptionPane.showMessageDialog(this, "Item Selected Successfully" + "\n Total Price:" + sum);
        if (generateBillPage != null) {
            generateBillPage.updateNewSum(sum);
        }
    }
}
