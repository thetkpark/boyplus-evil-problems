#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 100000;
int bucket[maxn+10];
int main(){
	int n,q,x,y;
	scanf("%d %d",&n,&q);
	while(q--){
		scanf("%d %d",&x,&y);
		bucket[x]++;
		bucket[y+1]--;
	}
	for(int i=1;i<=n;i++){
		bucket[i] += bucket[i-1];
	}
	for(int i=1;i<=n;i++){
		printf("%d ",bucket[i]);
	}
	return 0;
}