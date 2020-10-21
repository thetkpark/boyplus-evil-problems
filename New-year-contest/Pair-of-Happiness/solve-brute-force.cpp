#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 100000;
int arr[maxn];
int main(){
	int n,q,x;
	scanf("%d %d",&n,&q);
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	while(q--){
		scanf("%d",&x);
		bool chk = false;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]+arr[j] == x){
					printf("Yes\n");
					chk = true;
					break;
				}
			}
			if(chk){
				break;
			}
		}
		if(chk == false){
			printf("No\n");
		}
	}
    return 0;
}
/*
5 3
2 5 4 6 12
11
13
5
*/