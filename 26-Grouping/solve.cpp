#include <cstdio>
#include <cstdlib>
using namespace std;
int arr[30];
int main(){
	int n,cnt=0,temp=1,sumAll=0,mn = (int)1e9;
	scanf("%d",&n);	
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
		sumAll+=arr[i];
		temp*=2;
	}
	bool bi[21];
	while(cnt < temp){
		int i = n-1,sum1=0;
		while(i>=0 && bi[i] == true)
			bi[i--] = false;
		if(i >= 0)
			bi[i] = true;
		for(int i=0;i<n;i++)
			if(bi[i] == true)
				sum1+=arr[i];
		int sum2 = sumAll-sum1;
		int diff = abs(sum1-sum2);
		if(diff < mn)
			mn = diff;
		cnt++;
	}
	printf("%d\n", mn);
    return 0;
}