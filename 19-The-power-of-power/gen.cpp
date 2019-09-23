#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int q = rand()%10000+1;
	printf("%d\n",q);
	for(int i=0;i<q;i++){
		int a = rand()%1000000+1;
		int b = rand()%100000+1;
		int eiei = rand()%3;
		int m = rand()%(10000000)+1;
		if(eiei == 1){
			m = 1000000007;
		}
		printf("%d %d %d\n",a,b,m);
	}
	return 0;
}