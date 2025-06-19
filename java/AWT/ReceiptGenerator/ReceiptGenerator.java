import java.awt.*;
import java.awt.event.*;

public class ReceiptGenerator extends Frame implements ActionListener {
    TextField nameTextField;
    TextArea receiptTextArea;
    Choice paymentMethodChoice;
    Button generateButton;
    Label nameLabel, itemLabel, paymentLabel, discountLabel;
    CheckboxGroup group;
    Checkbox shoesCheckBox, pantsCheckBox, shirtCheckBox, defaultCheckBox, specialCheckBox;

    public ReceiptGenerator() {
        setTitle("Receipt Generator");
        setSize(400, 500);
        setLayout(null);

        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        
        nameTextField = new TextField();
        nameTextField.setBounds(150, 50, 200, 30);
        nameTextField.setName("nameTextField");

        itemLabel = new Label("Select Items:");
        itemLabel.setBounds(50, 90, 100, 30);

        shoesCheckBox = new Checkbox("Shoes");
        shoesCheckBox.setBounds(150, 90, 200, 30);
        shoesCheckBox.setName("shoesCheckBox");

        pantsCheckBox = new Checkbox("Pants");
        pantsCheckBox.setBounds(150, 120, 200, 30);
        pantsCheckBox.setName("pantsCheckBox");

        shirtCheckBox = new Checkbox("Shirt");
        shirtCheckBox.setBounds(150, 150, 200, 30);
        shirtCheckBox.setName("shirtCheckBox");

        paymentLabel = new Label("Payment Method:");
        paymentLabel.setBounds(50, 190, 100, 30);

        paymentMethodChoice = new Choice();
        paymentMethodChoice.setBounds(150, 190, 200, 30);
        paymentMethodChoice.setName("paymentMethodChoice");
        paymentMethodChoice.add("Cash");
        paymentMethodChoice.add("Credit Card");
        paymentMethodChoice.add("Debit Card");

        discountLabel = new Label("Discount:");
        discountLabel.setBounds(50, 230, 100, 30);

        group = new CheckboxGroup();
        defaultCheckBox = new Checkbox("Default", group, false);
        defaultCheckBox.setBounds(150, 230, 200, 30);
        defaultCheckBox.setName("defaultCheckBox");

        specialCheckBox = new Checkbox("Special", group, false);
        specialCheckBox.setBounds(150, 260, 200, 30);
        specialCheckBox.setName("specialCheckBox");

        generateButton = new Button("Generate Receipt");
        generateButton.setBounds(150, 300, 150, 30);
        generateButton.setName("generateButton");
        generateButton.addActionListener(this);

        receiptTextArea = new TextArea();
        receiptTextArea.setBounds(50, 350, 330, 100);
        receiptTextArea.setName("receiptTextArea");

        add(nameLabel);
        add(nameTextField);
        add(itemLabel);
        add(shoesCheckBox);
        add(pantsCheckBox);
        add(shirtCheckBox);
        add(paymentLabel);
        add(paymentMethodChoice);
        add(discountLabel);
        add(defaultCheckBox);
        add(specialCheckBox);
        add(generateButton);
        add(receiptTextArea);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText().trim();
        String paymentMethod = paymentMethodChoice.getSelectedItem();
        int totalCost = 0;
        java.util.List<String> items = new java.util.ArrayList<>();

        if(shoesCheckBox.getState()) {
            totalCost += 200;
            items.add("Shoes");
        }

        if(pantsCheckBox.getState()) {
            totalCost += 150;
            items.add("Pants");
        }

        if(shirtCheckBox.getState()) {
            totalCost += 120;
            items.add("Shirt");
        }

        double discount = 0;
        if(defaultCheckBox.getState() && totalCost > 300) {
            discount = 0.05 * totalCost;
        } else if(specialCheckBox.getState()) {
            discount = 0.15 * totalCost;
        }

        double finalCost = totalCost - discount;
        String itemsDisplay = String.join(", ", items);

        receiptTextArea.setText("Name: " + name + "\nItems: " + itemsDisplay
                                + "\nPayment Method: " + paymentMethod
                                + "\nTotal Cost: " + String.format("%.2f", finalCost));  
    }

    public static void main(String[] args) {
        new ReceiptGenerator();
    }
}