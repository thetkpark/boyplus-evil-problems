#include <cstdio>
#include <algorithm>
#include <vector>
#include <cstdlib>
#include <ctime>
using namespace std;
int main(){
	srand(time(NULL));
	int a = rand()%500;
	printf("%d\n",a);
    return 0;
}