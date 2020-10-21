#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
int n,m;
const int maxn = 101,maxm = 101;
char str[maxn][maxm];
int mp[maxn][maxm];
void print(){
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			printf("%d ",mp[i][j]);
		}
		printf("\n");
	}
}
int main(){
	scanf("%d %d",&n,&m);
	for(int i=0;i<n;i++){
		scanf("%s",str[i]);
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			if(str[i][j] == 'S'){
				mp[i][j]++;
				int y = i-1;
				while(y >= 0 && str[y][j] != 'X')
					mp[y--][j]++;
				y = i+1;
				while(y < n && str[y][j] != 'X'){
					mp[y++][j]++;
				}
				int x = j-1;
				while(x >= 0 && str[i][x] != 'X')
					mp[i][x--]++;
				x = j+1;
				while(x<m && str[i][x] != 'X')
					mp[i][x++]++;	
			}
		}
	}
	print();
    return 0;
}
/*
5 4
Sooo
ooXo
oooo
XoSo
oooo

6 5
ooooo
ooooo
ooSoo
oXooS
ooXoo
ooooo
*/