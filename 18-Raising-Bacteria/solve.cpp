#include <cstdio>
int main(){
	int n,now = 1,count=0;
	scanf("%d",&n);
	while(n != 0){
		if(n%2){
			n--;
			count++;
		}
		n/=2;
	}
	printf("%d\n",count);
	return 0;
}