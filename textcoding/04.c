#include <stdio.h>

int main() {
    int size, i, min;
	  min = 0;
    scanf("%d", &size);
    for(i=0; i< size; i++){
        int num;
        scanf("%d", &num);
			  if(i==0) min = num;
        if(min > num) min = num;
    }
    printf("%d", min);
    return 0;
}
