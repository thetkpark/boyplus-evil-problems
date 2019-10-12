#include <cstdio>
#include <string>
#include <iostream>
#include <stack>
using namespace std;
string s1,s2;
char ans[10000000] = "";
stack<int> st;
int main(){
	int idx = 0;
	cin >> s1 >> s2;
	if(s2.length() > s1.length()){
		string temp = s2;
		s2 = s1;
		s1 = temp;
	}
	int i = s1.length()-1,j=s2.length()-1;
	int tod = 0;
	while(i >= 0 && j >= 0){
		int now = (s1[i]-48)+(s2[j]-48)+tod;
		st.push(now%10);
		tod = now/10;
		i--;
		j--;
	}
	while(i>=0){
		int now = (s1[i]-48)+tod;
		st.push(now%10);
		tod = now/10;
		i--;
	}
	if(tod != 0){
		st.push(tod);
	}
	while(!st.empty()){
		ans[idx++] = st.top()+48;
		st.pop();
	}
	cout << ans << "\n";
	return 0;
}