#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct SALESMAN {
    char salesman_num[10];
    char salesman_name[25];
    double total_sales;
    float commission;
};

void newRec() {
    int confirmExit;
    double quarterly_sales[4];
    FILE *fp;
    struct SALESMAN inventory;

    do {
        printf("Add New SalesMan:\n");
        fp = fopen("sales1.txt", "a");

        if(fp == NULL) {
            printf("\n*Error! Can't Open File for appending!\n");
            return;
        }

        printf("Salesman Number: ");
        scanf("%s", inventory.salesman_num);
        printf("Salesman Name: ");
        scanf("%s", inventory.salesman_name);

        inventory.total_sales = 0.0;
        for(int i = 0; i < 4; i++) {
            printf("Quarter %d Sales: ", i + 1);
            scanf("%lf", &quarterly_sales[i]);
            inventory.total_sales += quarterly_sales[i];
        }

        printf("Commission: ");
        scanf("%f", &inventory.commission);

        fprintf(fp, "%s\t%s\t%.2lf\t%.2f\n",
                inventory.salesman_num,
                inventory.salesman_name,
                inventory.total_sales,
                inventory.commission);
        fclose(fp);

        printf("\n*New record added successfully.\n\n");

        printf("Do you want to add another record? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirmExit) != 1 || (confirmExit != 0 && confirmExit != 1)) {
            while (getchar() != '\n');
            printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
            printf("Do you want to add another record? (1 - Yes | 0 - No): ");
        }
    } while (confirmExit == 1);
}

void editRec() {
    char salesman_num[10];
    int confirmExit, found = 0;
    FILE *fp, *fp1;
    struct SALESMAN inventory;

    do {
        printf("Edit Salesman Information:\n");

        fp = fopen("sales1.txt", "r");
        if(fp == NULL) {
            printf("\n*Error! Can't Open File for reading!\n");
            return;
        }

        fp1 = fopen("temp.txt", "w");
        if(fp1 == NULL) {
            printf("\n*Error! Can't Open Temp File for writing!\n");
            fclose(fp);
            return;
        }

        printf("Enter Salesman Number to Edit: ");
        scanf("%s", salesman_num);

        found = 0;
        while (fscanf(fp, "%s\t%s\t%lf\t%f\n",
                      inventory.salesman_num,
                      inventory.salesman_name,
                      &inventory.total_sales,
                      &inventory.commission) != EOF) {
            if(strcmp(inventory.salesman_num, salesman_num) == 0) {
                found = 1;
                printf("\nInput new contents of salesman:\n");
                printf("Salesman Name: ");
                scanf("%s", inventory.salesman_name);

                inventory.total_sales = 0.0;
                double quarterly_sales;
                for(int i = 1; i <= 4; i++) {
                    printf("Quarter %d Sales: ", i);
                    scanf("%lf", &quarterly_sales);
                    inventory.total_sales += quarterly_sales;
                }

                printf("Commission: ");
                scanf("%f", &inventory.commission);
            }
            fprintf(fp1, "%s\t%s\t%.2lf\t%.2f\n",
                    inventory.salesman_num,
                    inventory.salesman_name,
                    inventory.total_sales,
                    inventory.commission);
        }
        fclose(fp);
        fclose(fp1);

        if(found) {
            if (remove("sales1.txt") != 0) {
                printf("\n*Error! Can't Delete Original File!\n");
            } else if (rename("temp.txt", "sales1.txt") != 0) {
                printf("\n*Error! Can't Rename Temp File!\n");
            } else {
                printf("\n*Record has been updated successfully.\n\n");
            }
        } else {
            printf("*Record not found.\n");
        }

        printf("Do you want to edit another record? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirmExit) != 1 || (confirmExit != 0 && confirmExit != 1)) {
            while (getchar() != '\n');
            printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
            printf("Do you want to edit another record? (1 - Yes | 0 - No): ");
        }
    } while (confirmExit == 1);
}

void searchRec() {
    int confirmExit, found = 0;
    char salesman_num[10];
    FILE *fp;
    struct SALESMAN inventory;

    do {
        printf("Search Salesman Information:\n");
        fp = fopen("sales1.txt", "r");

        if(fp == NULL) {
            printf("\n*Error! Can't Open File for reading!\n");
            return;
        }

        printf("Enter Salesman Number: ");
        scanf("%s", salesman_num);

        found = 0;
        while (fscanf(fp, "%s\t%s\t%lf\t%f\n",
                      inventory.salesman_num,
                      inventory.salesman_name,
                      &inventory.total_sales,
                      &inventory.commission) != EOF) {
            if(strcmp(inventory.salesman_num, salesman_num) == 0) {
                printf("Salesman Name: %s\n", inventory.salesman_name);
                printf("Total Sales: %.2lf\n", inventory.total_sales);
                printf("Commission: %.2f\n", inventory.commission);
                found = 1;
                break;
            }
        }

        if(!found) {
            printf("*Record not found.\n");
        }
        fclose(fp);

        printf("Do you want to search another record? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirmExit) != 1 || (confirmExit != 0 && confirmExit != 1)) {
            while (getchar() != '\n');
            printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
            printf("Do you want to search another record? (1 - Yes | 0 - No): ");
        }
    } while (confirmExit == 1);
}

void deleteRec() {
    int confirmExit, found = 0;
    char salesman_num[10];
    FILE *fp, *fp1;
    struct SALESMAN inventory;

    do {
        printf("Delete Salesman Information:\n");
        fp = fopen("sales1.txt", "r");
        if(fp == NULL) {
            printf("\n*Error! Can't Open File for reading!\n");
            return;
        }

        fp1 = fopen("temp.txt", "w");
        if(fp1 == NULL) {
            printf("\n*Error! Can't Open Temp File for writing!\n");
            fclose(fp);
            return;
        }

        printf("Salesman Number: ");
        scanf("%s", salesman_num);

        found = 0;
        while (fscanf(fp, "%s\t%s\t%lf\t%f\n",
                      inventory.salesman_num,
                      inventory.salesman_name,
                      &inventory.total_sales,
                      &inventory.commission) != EOF) {
            if(strcmp(inventory.salesman_num, salesman_num) == 0) {
                found = 1;
            } else {
                fprintf(fp1, "%s\t%s\t%.2lf\t%.2f\n",
                        inventory.salesman_num,
                        inventory.salesman_name,
                        inventory.total_sales,
                        inventory.commission);
            }
        }
        fclose(fp);
        fclose(fp1);

        if(found) {
            if (remove("sales1.txt") != 0) {
                printf("\n*Error! Can't Delete Original File!\n");
            } else if (rename("temp.txt", "sales1.txt") != 0) {
                printf("\n*Error! Can't Rename Temp File!\n");
            } else {
                printf("\n*Record has been deleted successfully.\n\n");
            }
        } else {
            printf("*Record not found.\n");
        }

        printf("Do you want to delete another record? (1 - Yes | 0 - No): ");
        while (scanf("%d", &confirmExit) != 1 || (confirmExit != 0 && confirmExit != 1)) {
            while (getchar() != '\n');
            printf("*Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
            printf("Do you want to delete another record? (1 - Yes | 0 - No): ");
        }
    } while (confirmExit == 1);
}

void viewRec() {
    FILE *fp;
    struct SALESMAN inventory;

    printf("\nView All Salesmen Information:\n\n");

    fp = fopen("sales1.txt", "r");
    if (fp == NULL) {
        printf("\n*Error! Can't Open File for reading!\n");
        return;
    }

    printf("%-12s %-20s %-15s %-15s\n", "Salesman No", "Salesman Name", "Total Sales", "Commission");
    printf("---------------------------------------------------------------------
    printf("%-12s %-20s %-15s %-15s\n", "Salesman No", "Salesman Name", "Total Sales", "Commission");
    printf("---------------------------------------------------------------------\n");

    while (fscanf(fp, "%s\t%s\t%lf\t%f\n",
                  inventory.salesman_num,
                  inventory.salesman_name,
                  &inventory.total_sales,
                  &inventory.commission) != EOF) {
        printf("%-12s %-20s %-15.2lf %-15.2f\n",
               inventory.salesman_num,
               inventory.salesman_name,
               inventory.total_sales,
               inventory.commission);
    }

    fclose(fp);
    printf("\n");
}

int main() {
    char choice;
    int confirmExit;

    printf("+-----SALESMAN RECORD SYSTEM-----+\n");
    do {
        printf("\nMENU:\n\n");
        printf("[A]dd\n[E]dit\n[S]earch\n[D]elete\n[V]iew\nE[X]it\n\n");
        printf("Hi there! Please select: ");
        scanf(" %c", &choice);

        switch(choice) {
            case 'A':
                newRec();
                break;
            case 'E':
                editRec();
                break;
            case 'S':
                searchRec();
                break;
            case 'D':
                deleteRec();
                break;
            case 'V':
                viewRec();
                break;
            case 'X':
                printf("Do you really want to exit? (1 - Yes | 0 - No): ");
                while (scanf("%d", &confirmExit) != 1 || (confirmExit != 0 && confirmExit != 1)) {
                    while (getchar() != '\n');
                    printf("Invalid Input. Please enter 1 for Yes or 0 for No.\n\n");
                    printf("Do you really want to exit? (1 - Yes | 0 - No): ");
                }
                if(confirmExit == 1) {
                    printf("\nTerminating Program...\n\nThank you for using our program!\n");
                    return 0;
                } else {
                    printf("\nGoing Back to Menu...\n");
                }
                break;
            default:
                printf("Invalid Choice. Please Try Again.\n");
                break;
        }
    } while (1);

    return 0;
}
