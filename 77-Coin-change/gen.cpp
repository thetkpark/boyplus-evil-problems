#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int x = rand()%100000+1;
	int y = rand()%100000+1;
	while(y < x){
		y = rand()%100000+1;
	}
	printf("%d %d\n",x,y);
    return 0;
}