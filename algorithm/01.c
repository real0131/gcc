#include <stdio.h>

int main() {
	int isAnswer = 0;
	int num1,num2;
	scanf("%d %d",&num1,&num2);
	for(int i = num1;i<=num2;i++)
	{
		int cnt = 0;
		for(int j=1;j<=i-1;j++){
			if(i%j ==0){
				cnt+=j;
			}
		}
		if(i == cnt){
			printf("%d ",i);
			isAnswer = 1;
		}
	}
	if(!isAnswer){
		printf("No Answer!");
	}
  return 0;
}
