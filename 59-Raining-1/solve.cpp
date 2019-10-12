#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 1002;
int bucket[maxn];
int main(){
	int n,q,x,y;
	scanf("%d %d",&n,&q);
	while(q--){
		scanf("%d %d",&x,&y);
		for(int i=x;i<=y;i++){
			bucket[i]++;
		}
	}
	for(int i=1;i<=n;i++){
		printf("%d ",bucket[i]);
	}
	return 0;
}