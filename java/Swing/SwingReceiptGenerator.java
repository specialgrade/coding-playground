import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class SwingReceiptGenerator extends JFrame implements ActionListener {
    JTextField nameTextField;
    JTextArea receiptTextArea;
    JComboBox<String> paymentMethodChoice;
    JButton generateButton;
    JLabel nameLabel, itemLabel, paymentLabel, discountLabel;
    JCheckBox shoesCheckBox, pantsCheckBox, shirtCheckBox;
    JRadioButton defaultRadioButton, specialRadioButton;
    ButtonGroup discountGroup;

    public SwingReceiptGenerator() {
        setTitle("Receipt Generator");
        setSize(400, 500);
        setLayout(null);

        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);

        nameTextField = new JTextField();
        nameTextField.setBounds(150, 50, 200, 30);
        nameTextField.setName("nameTextField");

        itemLabel = new JLabel("Select Items:");
        itemLabel.setBounds(50, 90, 100, 30);

        shoesCheckBox = new JCheckBox("Shoes");
        shoesCheckBox.setBounds(150, 90, 200, 30);
        shoesCheckBox.setName("shoesCheckBox");

        pantsCheckBox = new JCheckBox("Pants");
        pantsCheckBox.setBounds(150, 120, 200, 30);
        pantsCheckBox.setName("pantsCheckBox");

        shirtCheckBox = new JCheckBox("Shirt");
        shirtCheckBox.setBounds(150, 150, 200, 30);
        shirtCheckBox.setName("shirtCheckBox");

        paymentLabel = new JLabel("Payment Method:");
        paymentLabel.setBounds(50, 190, 100, 30);

        paymentMethodChoice = new JComboBox<>(new String[]{"Cash", "Credit Card", "Debit Card"});
        paymentMethodChoice.setBounds(150, 190, 200, 30);
        paymentMethodChoice.setName("paymentMethodComboBox");

        discountLabel = new JLabel("Discount:");
        discountLabel.setBounds(50, 230, 100, 30);

        defaultRadioButton = new JRadioButton("Default");
        defaultRadioButton.setBounds(150, 230, 200, 30);
        defaultRadioButton.setName("defaultRadioButton");

        specialRadioButton = new JRadioButton("Special");
        specialRadioButton.setBounds(150, 260, 200, 30);
        specialRadioButton.setName("specialRadioButton");

        discountGroup = new ButtonGroup();
        discountGroup.add(defaultRadioButton);
        discountGroup.add(specialRadioButton);

        generateButton = new JButton("Generate Receipt");
        generateButton.setBounds(150, 300, 150, 30);
        generateButton.setName("generateButton");
        generateButton.addActionListener(this);

        receiptTextArea = new JTextArea();
        receiptTextArea.setBounds(50, 350, 330, 100);
        receiptTextArea.setName("receiptTextArea");
        receiptTextArea.setEditable(false);

        add(nameLabel);
        add(nameTextField);
        add(itemLabel);
        add(shoesCheckBox);
        add(pantsCheckBox);
        add(shirtCheckBox);
        add(paymentLabel);
        add(paymentMethodChoice);
        add(discountLabel);
        add(defaultRadioButton);
        add(specialRadioButton);
        add(generateButton);
        add(receiptTextArea);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText().trim();
        String paymentMethod = (String) paymentMethodChoice.getSelectedItem();
        int totalCost = 0;
        List<String> items = new ArrayList<>();

        if (shoesCheckBox.isSelected()) {
            totalCost += 200;
            items.add("Shoes");
        }

        if (pantsCheckBox.isSelected()) {
            totalCost += 150;
            items.add("Pants");
        }

        if (shirtCheckBox.isSelected()) {
            totalCost += 120;
            items.add("Shirt");
        }

        double discount = 0;
        if (defaultRadioButton.isSelected() && totalCost > 300) {
            discount = 0.05 * totalCost;
        } else if (specialRadioButton.isSelected()) {
            discount = 0.15 * totalCost;
        }

        double finalCost = totalCost - discount;
        String itemsDisplay = String.join(", ", items);

        receiptTextArea.setText("Name: " + name +
                "\nItems: " + itemsDisplay +
                "\nPayment Method: " + paymentMethod +
                "\nTotal Cost: " + String.format("%.2f", finalCost));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingReceiptGenerator::new);
    }
}
