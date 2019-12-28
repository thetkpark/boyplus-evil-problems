#include <cstdio>
#include <algorithm>
#include <vector>
#include <time.h>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%(1000-3+1)+3;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%1000+1;
		int y = rand()%100+1;
		printf("%d.%d ",x,y);
	}
	return 0;
}