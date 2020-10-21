#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%15+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%40+1;
		printf("%d ",x);
	}
	printf("\n");
	int q = 15;
	printf("%d\n",q);
	for(int i=0;i<q;i++){
		int x = rand()%100;
		printf("%d\n",x);
	}

}