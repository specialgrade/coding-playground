ALGORITHM MISSU
age = 0 educational = 0 height = 0 weight = 0
OUTPUT "Enter applicant's height (in feet):"
INPUT height
OUTPUT "Enter applicant's weight (in kilos):"
INPUT weight
OUTPUT "Enter applicant's age:"
INPUT age
OUTPUT "Enter applicant's education level (1 for HS graduate, 0 for not HS graduate):"
INPUT educational

IF (height >= 5) THEN
        IF (weight == 50) THEN
            IF (age >= 18) THEN
                IF (educational == 1) THEN
            		OUTPUT "Congratulations! The applicant is accepted."
            	ELSE 
            		OUTPUT "Sorry, the applicant is not accepted. Educational qualification is below HS graduate."
            ELSE 
				OUTPUT "Sorry, the applicant is not accepted. Age not met."
   		ELSE 
			OUTPUT "Sorry, the applicant is not accepted. Weight not met."
	ELSE 
    	OUTPUT "Sorry, the applicant is not accepted. Height not met."
END IF
END MISSU



