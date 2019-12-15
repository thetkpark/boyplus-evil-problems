#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int x = rand()%1000000+1;
	printf("%d\n",x);
    return 0;
}