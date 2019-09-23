#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%50+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int h = rand()%50+1;
		printf("%d ",h);
	}
	return 0;
}