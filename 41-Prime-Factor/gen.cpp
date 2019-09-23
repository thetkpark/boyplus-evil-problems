#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%(1000000000-2+1)+2;
	printf("%d\n",n);
	 
    return 0;
}