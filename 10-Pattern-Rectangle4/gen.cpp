#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%(500-3+1)+3;
	int m = rand()%(500-3+1)+3;
	printf("%d %d\n",n,m);
    return 0;
}