#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int a = rand()%9+1;
	int b = rand()%9+1;
	printf("%d %d\n",a,b);
    return 0;
}