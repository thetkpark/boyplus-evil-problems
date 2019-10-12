#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
const int maxn = 200;
int A[maxn][maxn];
int mp(int x){
	if(x%2) return -1;
	return 1;
}
int det(int A[maxn][maxn],int n){
	if(n == 1)
		return A[1][1];
	if(n == 2)
		return (A[1][1]*A[2][2])-(A[1][2]*A[2][1]);
	int sum = 0;
	for(int j=1;j<=n;j++){
		int B[maxn][maxn] = {{0}};
		int r=1,c=1;
		for(int a=1;a<=n;a++){
			for(int b=1;b<=n;b++){
				if(a == 1 || b == j){

				}
				else{
					B[r][c] = A[a][b];
					c++;
					if(c == n){
						c = 1;
						r++;
					}
				}
			}
		}
		sum = sum + (mp(1+j)*A[1][j]*det(B,n-1));
	}
	return sum;
}
int main(){
	int n;
	scanf("%d",&n);	
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			scanf("%d",&A[i][j]);
		}
	}
	int ans = det(A,n);
	printf("%d\n",ans);
    return 0;
}