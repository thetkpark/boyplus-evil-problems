#include <cstdio>
#include <algorithm>
#include <vector>
#include <time.h>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int x = rand()%1000+1;
	int y = rand()%100+1;
	printf("%d.%d",x,y);
    return 0;
}