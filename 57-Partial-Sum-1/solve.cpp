#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 1000;
int arr[maxn];
int main(){
	int n,q,a,b;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
	scanf("%d",&q);
	while(q--){
		scanf("%d %d",&a,&b);
		int sum = 0;
		for(int i=a;i<=b;i++){
			sum+=arr[i];
		}
		printf("%d\n",sum);
	}
    return 0;
}