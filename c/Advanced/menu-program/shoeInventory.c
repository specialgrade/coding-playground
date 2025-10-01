#include <stdio.h>
#include <stdlib.h>
#define SIZES 3
#define MAX_REC 4

struct SHOES {
    int stock[MAX_REC][SIZES];
    float shoePrices[MAX_REC];
    int styleNumbers[MAX_REC][SIZES];
    int shoeSizes[MAX_REC][SIZES];
	int pairs[MAX_REC][SIZES];
	int records;
};

void newRecord(struct SHOES *inventory) {
    int confirm, i;
    int userSize, userPairs;

    do {
        if (inventory->records >= MAX_REC) {
            printf("Maximum number of records reached.\n");
            return;
        }

        printf("\nEnter stock number: ");
        while (scanf("%d", &inventory->stock[inventory->records][0]) != 1) {  
            while (getchar() != '\n');  
            printf("*Invalid Input. Please enter an integer.\n\n");
            printf("Enter stock number: ");  
        }

        printf("Enter style number: ");
		while (scanf("%d", &inventory->styleNumbers[inventory->records][1]) != 1) {  
    		while (getchar() != '\n');  
    		printf("*Invalid Input. Please enter an integer.\n\n");
    		printf("Enter style number: ");  
		}


		do {
    		printf("Enter how many sizes (max of 3): ");
    		while (scanf("%d", &userSize) != 1 || (userSize < 1 || userSize > 3)) {
        		while (getchar() != '\n');  
        		printf("*Invalid number of sizes. Please enter a value between 1 and 3.\n\n");
        		printf("Enter how many sizes (max of 3): ");
    		}
    		inventory->styleNumbers[inventory->records][1] = userSize;

    		for (int i = 0; i < userSize; i++) {
        		printf("Enter size for size %d: ", i + 1);
        		while (scanf("%d", &inventory->shoeSizes[inventory->records][i]) != 1) {
                	while (getchar() != '\n');  
                	printf("*Invalid Input. Please enter an integer.\n\n");
                	printf("Enter size for size %d: ", i + 1);
            	}
    		}

    		for (int i = 0; i < userSize; i++) {
        		do {
            		printf("Enter how many pairs for size %d: ", inventory->shoeSizes[inventory->records][i]);
            		while (scanf("%d", &userPairs) != 1) {
                		while (getchar() != '\n');  
                		printf("*Invalid Input. Please enter an integer.\n\n");
                		printf("Enter how many pairs for size %d: ", inventory->shoeSizes[inventory->records][i]);
            		}
            		if (userPairs < 0) {
                		printf("\n*Invalid Input. Please enter a positive integer.\n\n");
            		}
        		} while (userPairs < 0);
        		inventory->pairs[inventory->records][i] = userPairs;
    		}
		} while (userSize < 1 || userSize > 3);

        printf("Enter price: ");
        while (scanf("%f", &inventory->shoePrices[inventory->records]) != 1) {  
            while (getchar() != '\n');  
            printf("*Invalid Input. Please enter a number.\n\n");
            printf("Enter price: ");  
        }

        inventory->records++;
        printf("\n*New record added successfully.\n\n");
        printf("==========================================\n\n");

        printf("Do you want to enter another record? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirm) != 1 || (confirm != 0 && confirm != 1)) {  
            while (getchar() != '\n');  
            printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
            printf("Do you want to enter another record? (1 - Yes | 0 - No): ");
        }
    } while (confirm == 1);
}

void displayRecord(struct SHOES inventory) {  
    int stock, style, confirm;
    int stockFound = 0, styleFound = 0;  
    int recordFound = 0;  
    
    do {
    	do {  
        	printf("\nEnter stock number: ");
        	if (scanf("%d", &stock) != 1 || stock < 0) {  
            	while (getchar() != '\n');  
            	printf("*Invalid Input. Please enter an integer.\n");
        	} else {
            	for (int i = 0; i < inventory.records; i++) {  
                	if (inventory.stock[i][0] == stock) {
                    	stockFound = 1;  
                    	break;
                	}
            	}
            	if (!stockFound) {
                	printf("*Stock number not found in the inventory.\n");
            	}
        	}
    	} while (stock < 0 || !stockFound);
    
    	if (stockFound) {  
        	do { 
            	printf("Enter style number: ");
            	if (scanf("%d", &style) != 1 || style < 0) {  
                	while (getchar() != '\n');  
                	printf("*Invalid Input. Please enter an integer.\n");
            	} else {  
                	for (int i = 0; i < inventory.records; i++) {
                    	if (inventory.stock[i][0] == stock && inventory.styleNumbers[i][1] == style) {
                        	styleFound = 1;  
                        	break;
                    	}
                	}
                	if (!styleFound) {
                    	printf("*Style number not found for the specified stock.\n\n");
                	}
            	}
        	} while (style < 0 || !styleFound);
        
        	if (styleFound) {  
            	printf("\nRecord:\n");
            	printf("|Stock#\t| Style\t| Size \t| No. of Pairs\t| Price\n");
            	for (int i = 0; i < inventory.records; i++) {
                	if (inventory.stock[i][0] == stock && inventory.styleNumbers[i][1] == style) {
                    	recordFound = 1;  
                    	printf("|  %d\t|  %d\t|", stock, style);
                    	for (int j = 0; j < SIZES; j++) {
                        	printf("   %d\t|      %d\t| Php %.2f\n", inventory.shoeSizes[i][j], inventory.pairs[i][j], inventory.shoePrices[i]);
                        	if (j != SIZES - 1) {
                        		printf("|\t|\t|");
							}
                    	}
                	}
            	}
            	if (!recordFound) {  
                	printf("*Record not found for the specified stock and style.\n");
            	}
        	}
    	}
    	printf("\n\n==========================================\n\n");

    	printf("Do you want to display another record? (1 - Yes | 0 - No): ");
    	while (scanf("%d", &confirm) != 1 || (confirm != 0 && confirm != 1)) {  
        	while (getchar() != '\n');  
        	printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
        	printf("Do you want to display another record? (1 - Yes | 0 - No): ");
    	} 
	} while (confirm == 1);
}

void changePrice(struct SHOES *inventory) { 
    int stock, style, confirm, i;
    int stockFound = 0, styleFound = 0;  
    int recordFound = 0;  
    
    do {
        do {  
            printf("\nEnter stock number: ");
            if (scanf("%d", &stock) != 1 || stock < 0) { 
                while (getchar() != '\n');  
                printf("*Invalid Input. Please enter an integer.\n");
            } else {
                for (int i = 0; i < inventory->records; i++) { 
                    if (inventory->stock[i][0] == stock) {
                        stockFound = 1;  
                        break;
                    }
                }
                if (!stockFound) {
                    printf("*Stock number not found in the inventory.\n");
                }
            }
        } while (stock < 0 || !stockFound);
        
        if (stockFound) {  
            do {  
                printf("Enter style number: ");
                if (scanf("%d", &style) != 1 || style < 0) { 
                    while (getchar() != '\n');  
                    printf("*Invalid Input. Please enter an integer.\n");
                } else {  
                    for (int i = 0; i < inventory->records; i++) {
                        if (inventory->stock[i][0] == stock && inventory->styleNumbers[i][1] == style) {
                            styleFound = 1;  
                            break;
                        }
                    }
                    if (!styleFound) {
                        printf("*Style number not found in the inventory.\n\n");
                    }
                }
            } while (style < 0 || !styleFound);
            
            if (styleFound) {  
                printf("Enter the new price: ");
                float newPrice;
                scanf("%f", &inventory->shoePrices[i]); 
            }
            if (!recordFound) { 
                printf("*Record not found for the specified stock and style.\n");
            }
        }
        printf("\nThe price has been updated successfully.\n");
        printf("\n==========================================\n");

        printf("\nDo you want to change the price of another product? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirm) != 1 || (confirm != 0 && confirm != 1)) {  
            while (getchar() != '\n'); 
            printf("*Invalid input. Please enter 1 for Yes or 0 for No.\n");
            printf("\nDo you want to change the price of another product? (1 - Yes | 0 - No): ");
        } 
    } while (confirm == 1);
}

void removeRecord(struct SHOES *inventory, int index) {  
    for (int k = index; k < inventory->records - 1; k++) {
        for (int l = 0; l < SIZES; l++) {
            inventory->stock[k][l] = inventory->stock[k + 1][l];
            inventory->styleNumbers[k][l] = inventory->styleNumbers[k + 1][l];
            inventory->shoeSizes[k][l] = inventory->shoeSizes[k + 1][l];
            inventory->pairs[k][l] = inventory->pairs[k + 1][l];
        }
        inventory->shoePrices[k] = inventory->shoePrices[k + 1];
    }
    for (int l = 0; l < SIZES; l++) {
        inventory->stock[inventory->records - 1][l] = 0;
        inventory->styleNumbers[inventory->records - 1][l] = 0;
        inventory->shoeSizes[inventory->records - 1][l] = 0;
        inventory->pairs[inventory->records - 1][l] = 0;
    }
    inventory->shoePrices[inventory->records - 1] = 0.0f;
    inventory->records--;
}

void changeStock(struct SHOES *inventory) {
    int stock, style, size, i, j, confirm;
    int stockFound = 0, styleFound = 0;  
    int recordFound = 0;  
    
    do {
        do {  
            printf("\nEnter stock number: ");
            if (scanf("%d", &stock) != 1 || stock < 0) {  
                while (getchar() != '\n');  
                printf("*Invalid Input. Please enter an integer.\n");
            } else {
                for (i = 0; i < inventory->records; i++) {  
                    if (inventory->stock[i][0] == stock) {
                        stockFound = 1;  
                        break;
                    }
                }
                if (!stockFound) {
                    printf("*Stock number not found in the inventory.\n");
                }
            }
        } while (stock < 0 || !stockFound);
        
        if (stockFound) {  
            do {  
                printf("Enter style number: ");
                if (scanf("%d", &style) != 1 || style < 0) {  
                    while (getchar() != '\n');  
                    printf("*Invalid Input. Please enter an integer.\n");
                } else { 
                    for (i = 0; i < inventory->records; i++) {
                        if (inventory->stock[i][0] == stock && inventory->styleNumbers[i][1] == style) {
                            styleFound = 1;  
                            break;
                        }
                    }
                    if (!styleFound) {
                        printf("*Style number not found in the inventory.\n\n");
                    }
                }
            } while (style < 0 || !styleFound);
        }
        
        if (styleFound) {  
            do {  
                printf("Enter the shoe size: ");
                if (scanf("%d", &size) != 1) {  
                    while (getchar() != '\n');  
                    printf("*Invalid Input. Please enter an integer.\n");
                } else {  
                    int sizeFound = 0;
                    for (i = 0; i < inventory->records; i++) {
                        if (inventory->stock[i][0] == stock && inventory->styleNumbers[i][1] == style) {
                            for (j = 0; j < SIZES; j++) {
                                if (inventory->shoeSizes[i][j] == size) {
                                    sizeFound = 1;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if (!sizeFound) {
                        printf("*Size not found for the specified stock and style.\n\n");
                    } else {
                        break;  
                    }
                }
            } while (1);
            
            printf("Enter number of pairs: ");  
            if (scanf("%d", &inventory->pairs[i][j]) == 0) {
                removeRecord(inventory, i);
            }
            printf("\n*Stock updated successfully.\n");
            printf("\n==========================================\n");
        }
        printf("\nDo you want to change the stock of another product? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirm) != 1 || (confirm != 0 && confirm != 1)) {  
            while (getchar() != '\n');  
            printf("*Invalid input. Please enter 1 for Yes or 0 for No.\n");
            printf("\nDo you want to change the stock of another product? (1 - Yes | 0 - No): ");
        } 
    } while (confirm == 1);
}

void displayInventory(struct SHOES inventory) {
    printf("\nInventory Table:\n");
    printf("|Stock#\t| Style\t| Size \t| No. of Pairs\t| Price\n");
    for (int i = 0; i < inventory.records; i++) {
        printf("|  %d\t|  %d\t|", inventory.stock[i][0], inventory.styleNumbers[i][1]);
        for (int j = 0; j < SIZES; j++) {
            if (inventory.pairs[i][j] > 0) {
                printf("   %d\t|      %d\t| Php %.2f\n", inventory.shoeSizes[i][j], inventory.pairs[i][j], inventory.shoePrices[i]);
                if (j != SIZES - 1) {
                    printf("|\t|\t|");
                }
            }
        }
    }
}

void bubbleSort(struct SHOES inventory[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (inventory[j].stock[0][0] > inventory[j + 1].stock[0][0]) {
                struct SHOES temp = inventory[j];
                inventory[j] = inventory[j + 1];
                inventory[j + 1] = temp;
            }
            else if (inventory[j].stock[0][0] == inventory[j + 1].stock[0][0] &&
                     inventory[j].styleNumbers[0][1] > inventory[j + 1].styleNumbers[0][1]) {
                struct SHOES temp = inventory[j];
                inventory[j] = inventory[j + 1];
                inventory[j + 1] = temp;
            }
        }
    }
}



int main() {  
    struct SHOES inventory; 
    int choice, confirmExit;
	inventory.records = 1; 

    inventory.stock[0][0] = 1;
    inventory.styleNumbers[0][1] = 1;
    inventory.shoePrices[0] = 350.0;
    inventory.shoeSizes[0][0] = 3;
    inventory.shoeSizes[0][1] = 4;
    inventory.shoeSizes[0][2] = 5;
    inventory.pairs[0][0] = 50;
    inventory.pairs[0][1] = 50;
    inventory.pairs[0][2] = 50;

    for (int i = 1; i < MAX_REC; i++) {
        for (int j = 0; j < SIZES; j++) {
            inventory.stock[i][j] = 0;
            inventory.styleNumbers[i][j] = 0;
            inventory.shoeSizes[i][j] = 0;
            inventory.pairs[i][j] = 0;
        }
        inventory.shoePrices[i] = 0.0f;
    }

    printf("+--- Foot Works Inventory Management System ---+\n");
    
    do {
    	printf("\n(1) Enter a new record\n");
        printf("(2) Display a specific record\n");
        printf("(3) Change the price of a stock item\n");
        printf("(4) Change the stock on hand\n");
        printf("(5) Display Inventory Table\n");
        printf("(6) Exit\n\n");

        printf("Please enter your choice: ");
		if (scanf("%d", &choice) != 1) {  
            while (getchar() != '\n');  
            printf("*Invalid Input. Please enter an integer.\n");
            choice = -1;  
        } else if (choice < 1 || choice > 6) {
            printf("*Input Out of Range. Please choose from 1 - 6.\n");
        } else {
        	switch(choice) {
				case 1:
					newRecord(&inventory);
					break;
				case 2:
					displayRecord(inventory);
					break;
				case 3:
					changePrice(&inventory);
					break;
				case 4:
					changeStock(&inventory);
					break;
				case 5:
					displayInventory(inventory);
					break;
				case 6:
					printf("\nDo you really want to exit? (1 - Yes | 0 - No): ");
					scanf("%d", &confirmExit);
					
					if(confirmExit == 1) {
						printf("\nTerminating program...\n\nThank you for using our program!\n");
            			return 0;
					} else {
						printf("\nGoing Back to Menu...\n");
					}
					break;
        		default:
            		printf("Invalid choice. Please try again.\n");
            		break;
			}
		}
	} while (1);
    return 0;
}
