#include <stdio.h> // header file
int main() { // main function
	int sec, timesec, timemin, timehr; // declared variables with data type
	
	printf("Please enter the number of second/s: ");
	scanf("%d", &sec);
	
	timehr=sec/3600;
	timemin=(sec%3600)/60;
	timesec=(sec%3600)%60;
	
	printf("Hour/s: %d\nMinute/s: %d\nSecond/s: %d\n", timehr, timemin, timesec);
	printf("The time is %d:%d:%d", timehr, timemin, timesec);

	return 0; // return, terminator of the program
}


