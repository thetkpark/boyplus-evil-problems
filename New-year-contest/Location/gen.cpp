#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
const int maxn = 50,maxm = 50,maxai=1000000;
int main(){
	srand(time(NULL));
	int n = rand()%maxn+1;
	int m = rand()%maxm+1;
	printf("%d %d\n",n,m);
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			int x = rand()%maxai+1;
			printf("%d ",x);
		}
		printf("\n");
	}
}