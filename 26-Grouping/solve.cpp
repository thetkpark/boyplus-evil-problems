#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int arr[30];
int main(){
	int n,cnt=0,temp=1,sumAll=0,mn = 99999;
	scanf("%d",&n);	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
		sumAll+=arr[i];
		temp = temp*2;
	}
	bool bi[21];
	while(cnt < temp){
		int i = n-1;
		while(i>=0 && bi[i] == true){
			bi[i] = false;
			i--;
		}
		if(i >= 0){
			bi[i] = true;
		}
		int sum1 = 0;
		for(int i=0;i<n;i++){
			if(bi[i] == true){
				sum1+=arr[i];
			}
		}
		int sum2 = sumAll-sum1;
		int diff = sum1-sum2;
		if(diff < 0){
			diff*=-1;
		}
		if(diff < mn){
			mn = diff;
		}
		cnt++;
	}
	printf("%d\n", mn);
    return 0;
}
/*
5
2 7 4 3 5
*/