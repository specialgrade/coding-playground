import java.awt.event.*;
import javax.swing.*;

public class SwingFoodKiosk extends JFrame implements ActionListener {
    JCheckBox pizzaCheckBox, burgerCheckBox, teaCheckBox;
    JButton orderButton;
    JLabel totalCostLabel;

    public SwingFoodKiosk() {
        setTitle("Food Kiosk");
        setSize(350, 250);
        setLayout(null);

        pizzaCheckBox = new JCheckBox("Pizza");
        pizzaCheckBox.setBounds(50, 50, 100, 20);
        pizzaCheckBox.setName("pizzaCheckBox");

        burgerCheckBox = new JCheckBox("Burger");
        burgerCheckBox.setBounds(50, 80, 100, 20);
        burgerCheckBox.setName("burgerCheckBox");

        teaCheckBox = new JCheckBox("Tea");
        teaCheckBox.setBounds(50, 110, 100, 20);
        teaCheckBox.setName("teaCheckBox");

        orderButton = new JButton("Order");
        orderButton.setBounds(100, 150, 100, 30);
        orderButton.setName("orderButton");
        orderButton.addActionListener(this);

        totalCostLabel = new JLabel();
        totalCostLabel.setBounds(50, 190, 250, 20);
        totalCostLabel.setName("totalCostLabel");

        add(pizzaCheckBox);
        add(burgerCheckBox);
        add(teaCheckBox);
        add(orderButton);
        add(totalCostLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        float totalOrder = 0;

        if (pizzaCheckBox.isSelected()) totalOrder += 100.00;
        if (burgerCheckBox.isSelected()) totalOrder += 80.00;
        if (teaCheckBox.isSelected()) totalOrder += 50.00;

        totalCostLabel.setText(String.format("%.2f", totalOrder));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingFoodKiosk::new);
    }
}
