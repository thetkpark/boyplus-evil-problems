#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int n;
	scanf("%d",&n);
	for(int i=2;i<n;i++){
		if(n%i == 0){
			printf("No\n");
			return 0;
		}
	}	 
	printf("Yes\n");
    return 0;
}