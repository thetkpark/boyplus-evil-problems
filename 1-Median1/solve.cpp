#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int main(){
	int a,b,c;
	scanf("%d %d %d",&a,&b,&c);	
	vector<int> vec = {a,b,c};
	sort(vec.begin(),vec.end());
	printf("%d\n",vec[1]);
    return 0;
}