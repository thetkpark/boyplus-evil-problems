#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
class mp{
public:
	int a,b;
	mp(int a,int b){
		this->a = a;
		this->b = b;
	}
};
bool cmp(mp x,mp y){
	if(x.a == y.a){
		return x.b < y.b;
	}
	return x.a < y.a;
}
vector<mp> vec;
int main(){
	int n,x;
	scanf("%d",&n);	
	for(int i=0;i<n;i++){
		scanf("%d",&x);
		vec.push_back(mp(x,i+1));
	}
	sort(vec.begin(),vec.end(),cmp);
	for(int i=0;i<vec.size();i++){
		printf("%d ",vec[i].b);
	}
	printf("\n");
    return 0;
}