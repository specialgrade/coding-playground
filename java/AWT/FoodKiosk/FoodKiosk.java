import java.awt.*;
import java.awt.event.*;

public class FoodKiosk extends Frame implements ActionListener {
    Checkbox pizzaCheckBox, burgerCheckBox, teaCheckBox;
    Button orderButton;
    Label totalCostLabel;

    public FoodKiosk() {
        setTitle("CheckBoxes");
        setSize(350, 250);
        setLayout(null);

        pizzaCheckBox = new Checkbox("Pizza");
        pizzaCheckBox.setBounds(50, 50, 100, 20);
        pizzaCheckBox.setName("pizzaCheckBox");
        pizzaCheckBox.setState(false);

        burgerCheckBox = new Checkbox("Burger");
        burgerCheckBox.setBounds(50, 80, 100, 20);
        burgerCheckBox.setName("burgerCheckBox");
        burgerCheckBox.setState(false);

        teaCheckBox = new Checkbox("Tea");
        teaCheckBox.setBounds(50, 110, 100, 20);
        teaCheckBox.setName("teaCheckBox");
        teaCheckBox.setState(false);

        orderButton = new Button("Order");
        orderButton.setBounds(100, 150, 100, 30);
        orderButton.setName("orderButton");
        orderButton.addActionListener(this);

        totalCostLabel = new Label();
        totalCostLabel.setBounds(50, 190, 250, 20);
        totalCostLabel.setName("totalCostLabel");

        add(pizzaCheckBox);
        add(burgerCheckBox);
        add(teaCheckBox);
        add(orderButton);
        add(totalCostLabel);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); 
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        float totalOrder = 0;

        if(pizzaCheckBox.getState()) totalOrder += 100.00;
        if(burgerCheckBox.getState()) totalOrder += 80.00;
        if(teaCheckBox.getState()) totalOrder += 50.00;

        totalCostLabel.setText(String.format("%.2f", totalOrder));
    }

    public static void main(String[] args) {
        new FoodKiosk();
    }
}
