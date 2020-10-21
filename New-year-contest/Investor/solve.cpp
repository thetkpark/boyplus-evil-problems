#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int n,num,ans = 0;
	scanf("%d",&n);
	scanf("%d",&num);
	int mx = num,mn = num;
	for(int i=2;i<=n;i++){
		scanf("%d",&num);
		if(num < mn){
			mn = num;
		}
		if(num > mx){
			mx = num;
			if(mx - mn > ans){
				ans = mx - mn;
			}
		}
	}
	printf("%d\n",ans);
}