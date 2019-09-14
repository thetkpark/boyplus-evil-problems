#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int q = rand()%1000+1;
	q = 800;
	printf("%d\n",q);
	while(q--){
		int x = rand()%(1000000-2+1)+2;
		printf("%d ",x);
	}
	printf("\n");
    return 0;
}