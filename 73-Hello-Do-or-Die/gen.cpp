#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n1 = rand()%1000+1;
	int n2 = rand()%1000+1;
	for(int i=0;i<n1;i++){
		int x = rand()%2;
		int y = rand()%('Z'-'A'+1)+'A';
		if(x == 0){
			y = rand()%('z'-'a'+1)+'a';
		}
		printf("%c",y);
	}
	printf("\n");
	for(int i=0;i<n2;i++){
		int x = rand()%2;
		int y = rand()%('Z'-'A'+1)+'A';
		if(x == 0){
			y = rand()%('z'-'a'+1)+'a';
		}
		printf("%c",y);
	}
	return 0;
}