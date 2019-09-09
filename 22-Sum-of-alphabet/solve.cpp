#include <cstdio>
#include <algorithm>
#include <vector>
#include <cstring>
#include <iostream>
#include <string>
using namespace std;
int main(){
	string str;
	getline(cin,str);
	long long length = str.length(),ans=0;
	for(int i=0;i<length;i++){
		if(str[i] >= 'a' && str[i] <= 'z')
			ans = ans + (str[i]-'a'-i+1);
		else if(str[i] >= 'A' && str[i] <= 'Z')
			ans = ans + (str[i]-'A'-i+1);
	}
	printf("%lld\n",ans);
}
/*
python
mAdAgasGa
TAs are handsome!
*/