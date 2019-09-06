#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
#include <climits>
using namespace std;
int main(){
	srand(time(NULL));
	int a = rand()%(INT_MAX/2);
	printf("%d\n",a);
    return 0;
}