#include <stdio.h>

int main() {
    double pizzaDiameter, pizzaPrice, radius, pizzaArea, price_perArea;

    printf("Domino's Pizza Menu\n\n");
    printf("Size   Price\n10     Php. 178.00\n12     Php. 259.00\n14     Php. 314.00\n\n");
    
    printf("Choose the diameter of the pizza from the menu:\n");
    scanf("%lf", &pizzaDiameter);

    printf("Choose the price of the pizza from the menu:\n");
    scanf("%lf", &pizzaPrice);

    if ((pizzaDiameter==10 && pizzaPrice==178) || (pizzaDiameter==12 && pizzaPrice==259) || (pizzaDiameter==14 && pizzaPrice==314)) {

        radius=pizzaDiameter/2;
        pizzaArea=3.1416*radius*radius;
        price_perArea=pizzaPrice/pizzaArea;

        printf("Area of the pizza: %.2lf square inches.\n", pizzaArea);
        printf("Price per area: Php. %.2lf per square inch.", price_perArea);
    } else {
        printf("Invalid Input. Please enter a valid combination from the menu.");
    }

    return 0;
}



