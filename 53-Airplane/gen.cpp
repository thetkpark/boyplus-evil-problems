#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%100+1;
	printf("%d\n",n);
	n*=2;
	for(int i=0;i<n;i++){
		int x = rand()%100+1;
		printf("%d ",x); 
	}
	printf("\n");
	return 0;
}