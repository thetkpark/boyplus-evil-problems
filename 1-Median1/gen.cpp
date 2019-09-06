#include <cstdio>
#include <algorithm>
#include <vector>
#include <cstdlib>
#include <ctime>
using namespace std;
int main(){
	srand(time(NULL));
	int a = rand()%(int)1e9;
	int b = rand()%(int)1e9;
	int c = rand()%(int)1e9;
	printf("%d %d %d\n",a,b,c);
	 
    return 0;
}