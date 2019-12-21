#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
const int maxn = 100,maxai=1000000,maxbi=maxai*2;
int main(){
	srand(time(NULL));
	int n = rand()%maxn+1;
	int q = rand()%maxn+1;
	n = 50000;
	q = 100;
	printf("%d %d\n",n,q);
	for(int i=0;i<n;i++){
		int h = rand()%maxai+1;
		printf("%d ",h);
	}
	printf("\n");
	while(q--){
		int x = rand()%maxbi+1;
		printf("%d\n",x);
	}
    return 0;
}