#include <cstdio>
int main(){
	long long n,ans=1;
	scanf("%lld",&n);	
	while(n > 0){
		ans*=n;
		n--;
	}
	printf("%lld\n",ans);
    return 0;
}