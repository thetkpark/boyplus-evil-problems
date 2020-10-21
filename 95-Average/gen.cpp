#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%100+1;
	int m = rand()%100+1;
	printf("%d %d\n",n,m);
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			int x = rand()%100+1;
			printf("%d ",x);
		}
		printf("\n");
	}
	return 0;
}