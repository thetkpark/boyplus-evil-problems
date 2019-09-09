#include <cstdio>
#include <algorithm>
#include <vector>
#include <math.h>
using namespace std;
bool check(int x){
	int temp = sqrt(x);
	for(int i=2;i<=temp;i++){
		if(x%i == 0){
			return false;
		}
	}
	return true;
}
int main(){
	vector<int> vec;
	for(int i=2;i<=1000;i++){
		if(check(i)){
			vec.push_back(i);
		}
	}
	int now = 1;
	for(int i=0;i<vec.size();i++){
		printf("%d ",vec[i]);
	}
	printf("\n");
	printf("%d\n",now);
	return 0;
}