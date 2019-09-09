#include <cstdio>
typedef long long ll;
ll rec(ll a,ll b,ll m){
	if(b == 0)
		return 1;
	ll p = rec(a,b/2,m)%m;
	return b%2==1 ? p*p%m*a%m:p*p%m;
}
int main(){
	long long q;
	scanf("%lld",&q);
	while(q--){
		long long a,b,m;
		scanf("%lld %lld %lld",&a,&b,&m);
		long long ans = rec(a,b,m);
		printf("%lld\n",ans%m);
	}	
    return 0;
}