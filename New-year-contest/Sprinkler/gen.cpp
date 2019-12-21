#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
const int maxn = 100,maxm = 100;
int main(){
	srand(time(NULL));
	int n = rand()%maxn+1;
	int m = rand()%maxm+1;
	printf("%d %d\n",n,m);
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			int x = rand()%10;
			if(x == 0){
				printf("S");
			} 
			else if(x == 1){
				printf("X");
			}
			else{
				printf("o");
			}
		}
		printf("\n");
	}
    return 0;
}