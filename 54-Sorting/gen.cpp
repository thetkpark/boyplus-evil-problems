#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%1000+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%10000+1;
		printf("%d ",x);
	}
}