#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int n;
	scanf("%d",&n);
	int year = n/525600;
	n = n - (year*525600);
	int day = n/1440;
	printf("%d %d\n",year,day);	 
    return 0;
}