#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int m,n;
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||j==1||i==n||j==n||i==j||(i+j==n+1))
				printf("*");
			else
				printf("-");
		}
		printf("\n");
	}
    return 0;
}