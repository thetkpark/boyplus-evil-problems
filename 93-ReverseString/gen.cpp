#include <cstdio>
#include <algorithm>
#include <vector>
#include <time.h>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int n = rand()%100+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int l = rand()%100+1;
		for(int j=0;j<l;j++){
			int k = rand()%2;
			int x = rand()%('Z'-'A'+1)+'A';
			if(k == 0){
				x = rand()%('z'-'a'+1)+'a';
			}
			printf("%c",x);
		}
		printf(" ");
		
	}
	return 0;
}