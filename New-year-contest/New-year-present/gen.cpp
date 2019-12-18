#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%10+3;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%10000+1;
		printf("%d ",x);
	}
	printf("\n");
    return 0;
}