#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%1000+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%1000+1;
		int y = rand()%100;
		int k = rand()%3;
		if(k == 0){
			printf("-");
		}
		printf("%d.%d ",x,y);
	}
	return 0;
}