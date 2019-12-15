#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
using namespace std;
int main(){
	srand(time(NULL));
	int len = rand()%10+1;
	for(int i=0;i<len;i++){
		int x = rand()%('z'-'a'+1)+'a';
		printf("%c",x);
	}	
	printf(" ");
	for(int i=0;i<len;i++){
		
	}
    return 0;
}