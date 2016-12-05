#include <stdio.h>

int main() {
	char ch[100];
	scanf("%s",ch);
	int i = 0;
	while(ch[i]!='\0'){
		for(int j = 0 ;j<=i;j++){
			printf("%c",ch[j]);
		}
		printf("\n");
		i++;
	}
  return 0;
}
