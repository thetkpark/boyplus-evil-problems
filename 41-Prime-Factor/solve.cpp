#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int n,now=2;
	scanf("%d",&n);
	bool first = true;
	while(n!=1){
		while(n%now == 0){
			n/=now;
			if(first){
				printf("%d",now);
				first = false;
			}
			else{
				printf(" x %d",now);
			}
		}
		now++;
	}
	printf("\n");
	return 0;
}