#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 500,maxm = 500;
int arr[maxn+2][maxm+2];
int maxRow[maxn+2],maxCol[maxm+2];
int main(){
	int n,m,cnt=0;
	scanf("%d %d",&n,&m);	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			scanf("%d",&arr[i][j]);
			maxRow[i] = arr[i][1];
			maxCol[j] = arr[1][j];
		}
	}

	//find max in every row
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(arr[i][j] > maxRow[i]){
				maxRow[i] = arr[i][j];
			}
		}
	}
	//find max in every column
	for(int i=1;i<=m;i++){
		for(int j=1;j<=n;j++){
			if(arr[j][i] > maxCol[i]){
				maxCol[i] = arr[j][i];
			}
		}
	}

	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(arr[i][j] == maxRow[i] && arr[i][j] == maxCol[j]){
				cnt++;
			}
		}
	}
	printf("%d\n",cnt);
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(arr[i][j] == maxRow[i] && arr[i][j] == maxCol[j]){
				printf("%d %d\n",i,j);
			}
		}
	}
    return 0;
}
/*
5 4
9 8 1 9
8 8 3 4
1 6 9 2
6 3 1 3
6 2 5 4

3 4
4 9 2 7
7 6 1 1
3 3 5 1


*/