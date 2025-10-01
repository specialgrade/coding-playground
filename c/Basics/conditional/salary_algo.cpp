ALGORITHM SALARY
name = " " hours = 0 salary = 0
OUTPUT"Enter your name please:"
INPUT name
OUTPUT name, "Enter the number of hours rendered:"
INPUT hours
IF (hours <= 40) THEN
	salary = hours*10
ELSE
	salary = (40*10)+((hours-40)*15)
END IF
OUTPUT name, "your salary is", salary
END SALARY





