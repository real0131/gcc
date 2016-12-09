#include <stdio.h>

int main() {
  int num,cnt =0,i=1;
	scanf("%d",&num);
	while(i<=num){
		if(num%i==0){
			cnt +=i;
		}
		i++;
	}
	printf("%d",cnt);
  return 0;
}
