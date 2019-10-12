#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){	 
	srand(time(NULL));
	int n = rand()%100+1;
	printf("%d\n",n);
	for(int i=0;i<n;i++){
		int c = rand()%4;
		if(c == 0){
			printf("up ");
		}
		else if(c == 1){
			printf("down ");
		}
		else if(c == 2){
			printf("right ");
		}
		else{
			printf("left ");
		}
		int t = rand()%3;
		printf("%d\n",t);
	}
	return 0;
}