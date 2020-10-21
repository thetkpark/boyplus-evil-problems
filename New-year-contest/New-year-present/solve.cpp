#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
class honey{
public:
	int value,id;
	honey(int value,int id){
		this->value = value;
		this->id = id;
	}
};
class answer{
public:
	int x,y,z;
	answer(int x,int y,int z){
		this->x = x;
		this->y = y;
		this->z = z;
	}
};
bool cmpHoney(honey const& left,honey const& right){
	if(left.value == right.value)
		return left.id < right.id;
	return left.value < right.value;
}
bool cmpAnswer(answer const& left,answer const& right){
	if(left.x == right.x){
		if(left.y == right.y)
			return left.z < right.z;
		return left.y < right.y;
	}
	return left.x < right.x;
}
int main(){
	int n,x;
	scanf("%d",&n);
	vector<honey> vec;
	vector<answer> ans;
	for(int i=0;i<n;i++){
		scanf("%d",&x);
		vec.push_back(honey(x,i+1));
	}
	sort(vec.begin(),vec.end(),cmpHoney);
	int mn = vec[2].value - vec[0].value;
	for(int i=2;i<n;i++){
		if(vec[i].value - vec[i-2].value < mn)
			mn = vec[i].value - vec[i-2].value;
	}
	for(int i=2;i<n;i++){
		if(vec[i].value - vec[i-2].value == mn){
			int temp[3] = {vec[i].id,vec[i-1].id,vec[i-2].id};
			sort(temp,temp+3);
			ans.push_back(answer(temp[0],temp[1],temp[2]));
		}
	}
	printf("%d %d\n",mn,(int)ans.size());
	sort(ans.begin(),ans.end(),cmpAnswer);
	for(int i=0;i<(int)ans.size();i++)
		printf("%d %d %d\n",ans[i].x,ans[i].y,ans[i].z);
    return 0;
}