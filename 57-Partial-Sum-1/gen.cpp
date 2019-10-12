#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
const int maxn = 1000;
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%maxn+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int x = rand()%maxn+1;
		printf("%d ",x);
	}
	printf("\n");
	int q = rand()%maxn+1;
	printf("%d\n",q);
	while(q--){
		int a = 0,b=-1;
		while(a > b){
			a = rand()%n;
			b = rand()%n;
		}
		printf("%d %d\n",a,b);
	}
	return 0;
}