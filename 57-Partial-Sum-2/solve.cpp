#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 100000;
int arr[maxn];
int main(){
	int n,q,a,b;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	for(int i=1;i<n;i++){
		arr[i]+=arr[i-1];
	}
	scanf("%d",&q);
	while(q--){
		scanf("%d %d",&a,&b);
		int sum = arr[b]-arr[a-1];
		printf("%d\n",sum);
	}
    return 0;
}