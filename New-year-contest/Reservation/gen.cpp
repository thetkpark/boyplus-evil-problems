#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
const int maxR = 50,maxH = 50;
int main(){
	srand(time(NULL));
	int n = rand()%1000+1;
	int q = 1000;
	printf("%d %d\n",n,q);
	for(int i=0;i<n;i++){
		int x = rand()%maxR+1;
		printf("%d ",x);
	}
	printf("\n");
	for(int i=0;i<q;i++){
		int x = rand()%maxR+10;
		int h = rand()%maxH+1;
		printf("%d %d\n",x,h);
	}
}