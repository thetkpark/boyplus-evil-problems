#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 100010;
int arr[maxn];
int w[maxn];
int main(){
	int n,q,p,t;
	scanf("%d %d",&n,&q);
	for(int i=1;i<=n;i++){
		scanf("%d",&arr[i]);
	}
	while(q--){
		scanf("%d %d",&p,&t);
		int mn = (int)1e9+7;
		for(int i=1;i<=n;i++){
			if(arr[i] >= p){
				//can use
				if(arr[i] < mn){
					mn = arr[i];
				}
			}
		}
		//track index
		int mnWait = (int)1e9+7;
		int idx = -1;
		for(int i=1;i<=n;i++){
			if(arr[i] == mn){
				if(w[i] < mnWait){
					mnWait = w[i];
					idx = i;
				}
			}
		}
		if(idx != -1){
			printf("%d %d\n",idx,w[idx]);
			w[idx]+=t;
		}
		else{
			printf("-1\n");
		}
	}
	return 0;
}