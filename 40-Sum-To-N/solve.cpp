#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	long long n;
	scanf("%lld",&n);
	long long ans = n*(n+1)/2;
	printf("%lld\n",ans);
    return 0;
}