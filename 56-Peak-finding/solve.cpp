#include <stdio.h>
int num[1002];
int main()
{
	int i,n,cnt=0;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
		scanf("%d",&num[i]);
	for(i=1;i<=n;i++){
		if(num[i]>=num[i-1]&&num[i]>=num[i+1])
			cnt++;
	}
	printf("%d\n",cnt);
	for(i=1;i<=n;i++){
		if(num[i]>=num[i-1]&&num[i]>=num[i+1])
			printf("%d ",num[i]);
	}
	return 0;
}
