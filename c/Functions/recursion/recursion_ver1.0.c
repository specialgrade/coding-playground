#include<stdio.h>
// the problem is to create a program that calculates the sum of numbers from 1 to a given input number or the range(n).

// The #include<stdio.h> statement includes the standard input/output library, 
// which provides functions like printf and scanf for input and output operations.

// function declaration: int sumOfRange(int num); 
// This declares a function sumOfRange that takes an integer num as input and returns an integer as well. 
// The function calculates the sum of numbers from 1 to num.

// main function: int main()
// This is the main function of the program. It's the entry point of the program execution.

// function call: sum = sumOfRange(num);
// This calls the sumOfRange function with the value of num provided by the user. The result is stored in the variable sum.
int sumOfRange(int num)
{
   int result;
   if (num == 1)
   {
      return (1);
   } else
   {
      result = num + sumOfRange(num - 1);
   }
   return (result);
}

int main()
{
   int num;
   int sum;
	printf("~~~Calculate the sum of numbers from 1 to n~~~\n");

   printf("\nInput the last number of the range(n): ");
   scanf("%d", &num);

   sum = sumOfRange(num);
   printf("\nThe sum of numbers from 1 to %d : %d", num, sum);

   return (0);
}