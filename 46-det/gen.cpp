#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = 8;
	printf("%d\n",n);	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			int x = rand()%10+1;
			printf("%d ",x);
		}
		printf("\n");
	}
    return 0;
}