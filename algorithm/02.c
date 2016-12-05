#include <stdio.h>

int main() {
	int num,cnt = 0;
	scanf("%d",&num);
	for(int i=2;i<num;i++){
			if(num%i ==0){
				cnt++;
			}
	}
	if(cnt){
		printf("False");
	}else{
		printf("True");
	}
  return 0;
}
