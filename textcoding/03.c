#include <stdio.h>

int abs(int num){
	if(num<0){
		num = num * -1;
	}
	return num;
}
int main() {
	int num;
	scanf("%d",&num);
	printf("%d",abs(num));
  return 0;
}
