#include <cstdio>
#include <algorithm>
#include <vector>
#include <time.h>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%100+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%100;
		printf("%d ",x);
	}
	printf("\n");
    return 0;
}