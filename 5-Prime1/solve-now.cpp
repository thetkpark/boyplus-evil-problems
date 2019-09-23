#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int x,cnt=0;
	scanf("%d",&x);	
	for(int i=1;i<100;i++){
		if(x%i == 0){
			cnt++;
		}
	}
	if(cnt > 2){
		printf("No\n");
	}
	else{
		printf("Yes\n");
	}
    return 0;
}