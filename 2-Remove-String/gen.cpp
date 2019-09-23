#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%1000+1;
	for(int i=0;i<n;i++){
		int x = rand()%('Z'-'A'+1)+'A';
		printf("%c",x);
	}
	printf("\n");
	int x = rand()%('Z'-'A'+1)+'A';
	printf("%c",x);
	x = rand()%('Z'-'A'+1)+'A';
	printf("%c",x);
	x = rand()%('Z'-'A'+1)+'A';
	printf("%c\n",x);
	return 0;
}