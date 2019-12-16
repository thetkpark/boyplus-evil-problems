#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	int l = rand()%20+1;
	for(int i=0;i<l;i++){
		int c = rand()%2;
		int x = rand()%('Z'-'A'+1)+'A';
		if(c == 1){
			x = rand()%('z'-'a'+1)+'a';
		}
		printf("%c",x);
	}
}