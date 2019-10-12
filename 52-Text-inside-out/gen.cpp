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
		char c = rand()%('z'-'a'+1)+'a';
		printf("%c",c);
	}
	printf("\n");
	return 0;
}