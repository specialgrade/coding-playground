#include <stdio.h>

int main() {
	
	char name[50];
	float radius, vol_sphere;
	
	printf("Please enter your name:");
	scanf("%s", &name);
	
	printf("%s, please enter the radius of the sphere:", name);
	scanf("%f", &radius);
	
	vol_sphere = (4.00/3.00)*3.14159265359*radius*radius*radius;
	
	printf("%s, the volume of the sphere is %.2f.", name, vol_sphere);
	
	return 0;
}




