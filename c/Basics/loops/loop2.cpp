#include <stdio.h>
#include <math.h>

#define PI 3.14159265359

int main() {
    // Declare variables
    double diameter, price, area, pricePerSquareInch;

    // Input diameter and price
    printf("Enter the diameter of the pizza (in inches): ");
    scanf("%lf", &diameter);

    printf("Enter the price of the pizza (in pesos): ");
    scanf("%lf", &price);

    // Calculate area of the pizza
    area = PI * pow(diameter / 2, 2);

    // Calculate price per square inch
    pricePerSquareInch = price / area;

    // Output results
    printf("\nPizza Details:\n");
    printf("Diameter: %.2f inches\n", diameter);
    printf("Area: %.2f square inches\n", area);
    printf("Price: %.2f pesos\n", price);
    printf("Price per square inch: %.2f pesos/square inch\n", pricePerSquareInch);

    return 0;
}

