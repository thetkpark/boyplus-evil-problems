#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%30+1;
	int m = rand()%30+1;
	printf("%d %d\n",n,m);
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if((i==0&&j==0)||(i==0&&j==m-1)||(i==n-1&&j==0)||(i==n-1&&j==m-1)){
				printf("H");
				continue;
			}
			int x = rand()%7;
			if(x == 0){
				printf("H");
			}
			else{
				printf("G");
			}
		}
		printf("\n");
	}
}