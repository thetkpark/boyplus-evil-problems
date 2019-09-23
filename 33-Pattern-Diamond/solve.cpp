#include <cstdio>
int main(){
	int n;
	scanf("%d",&n);	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n-i;j++)
			printf("-");
		for(int j=1;j<=(2*i)-1;j++)
			printf("*");
		for(int j=1;j<=n-i;j++)
			printf("-");
		printf("\n");
	}
	int now = (2*n-1)-2;
	for(int i=1;i<n;i++){
		for(int j=1;j<=i;j++)
			printf("-");
		for(int j=1;j<=now;j++)
			printf("*");
		for(int j=1;j<=i;j++)
			printf("-");
		printf("\n");
		now-=2;
	}
    return 0;
}