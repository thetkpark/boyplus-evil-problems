#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int x = rand()%300+1;
	printf("%d\n",x); 
    return 0;
}