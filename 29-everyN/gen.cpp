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
		int x = rand()%3;
		int u = rand()%(125-32+1)+32;
		printf("%c",u);
	}
	printf("\n");
	return 0;
}