#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
const int maxn = 100000;
int main(){
	srand(time(NULL));
	int n = rand()%maxn+1;
	int q = rand()%maxn+1;
	n = 70000;
	q = 70000;
	printf("%d %d\n",n,q);
	for(int i=0;i<q;i++){
		int x = 0,y=-1;
		while(x > y){
			x = rand()%n+1;
			y = rand()%n+1;
		}
		printf("%d %d\n",x,y);
	}
	return 0;
}