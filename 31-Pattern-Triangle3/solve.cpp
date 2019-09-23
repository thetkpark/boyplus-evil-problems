#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int n;
	scanf("%d",&n);	
	for(int i=n;i>=1;i--){
		for(int j=1;j<i;j++){
			printf("-");
		}
		for(int j=i;j<=n;j++){
			printf("*");
		}
		printf("\n");
	}
    return 0;
}