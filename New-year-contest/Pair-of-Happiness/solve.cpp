#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
vector<int> vec;
int bsearch(int x){
	int left = 0,right = vec.size()-1;
	while(left <= right){
		int mid = (left+right)/2;
		if(vec[mid] == x)
			return mid;
		else if(vec[mid] > x)
			right = mid-1;
		else
			left = mid+1;
	}
	return -1;
}
int main(){
	int n,q,num,x;
	scanf("%d %d",&n,&q);
	for(int i=0;i<n;i++){
		scanf("%d",&num);
		vec.push_back(num);
	}
	sort(vec.begin(),vec.end());
	while(q--){
		bool chk = false;
		scanf("%d",&x);
		for(int i=0;i<vec.size();i++){
			int want = x - vec[i];
			if(want < 0)
				continue;
			int idx = bsearch(want);
			if(idx != -1 && idx != i){
				chk = true;
				break;
			}
		}
		printf("%s\n",chk==true? "Yes":"No");
	}
    return 0;
}