#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int n1 = rand()%5000000+1;
	printf("%d",rand()%9+1);
	for(int i=1;i<n1;i++){
		printf("%d",rand()%10);
	}

	printf(" ");
	int n2 = rand()%5000000+1;
	printf("%d",rand()%9+1);
	for(int i=1;i<n2;i++){
		printf("%d",rand()%10);
	}
}