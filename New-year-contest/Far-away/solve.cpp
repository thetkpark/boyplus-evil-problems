#include <cstdio>
#include <algorithm>
#include <vector>
#include <queue>
using namespace std;
int n,m;
int const maxn = 35,maxm = 35;
int const inf = (int)1e9+7;
char str[maxn][maxm];
int dp[maxn][maxm];
int cy[4] = {0,0,1,-1};
int cx[4] = {1,-1,0,0};
class grid{
public:
	int y,x,cnt;
	grid(int y,int x,int cnt){
		this->y = y;
		this->x = x;
		this->cnt = cnt;
	}
};
int main(){
	scanf("%d %d",&n,&m);
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			scanf(" %c",&str[i][j]);
			dp[i][j] = inf;
		}
	}
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(str[i][j] == 'H'){
				int table[maxn][maxm] = {0};
				bool visited[maxn][maxm] = {false};
				for(int y=1;y<=n;y++){
					for(int x=1;x<=m;x++){
						table[y][x] = inf;
					}
				}
				queue<grid> q;
				q.push(grid(i,j,1));
				while(!q.empty()){
					int y = q.front().y;
					int x = q.front().x;
					int cnt = q.front().cnt;
					for(int k=0;k<4;k++){
						int yy = y+cy[k];
						int xx = x+cx[k];
						if(str[yy][xx] == 'G' && visited[yy][xx] == false){
							visited[yy][xx] = true;
							table[yy][xx] = cnt;
							dp[yy][xx] = min(dp[yy][xx],table[yy][xx]);
							q.push(grid(yy,xx,cnt+1));
						}
					}
					q.pop();
				}
			}
		}
	}
	int mx = 0;
	vector<pair<int,int>> ans;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=m;j++){
			if(dp[i][j] > mx && dp[i][j] != inf){
				mx = dp[i][j];
				ans.clear();
			}
			if(dp[i][j] == mx && dp[i][j] != inf){
				ans.push_back({i,j});
			}
		}
	}
	printf("%d %d\n",mx,(int)ans.size());
	for(int i=0;i<ans.size();i++){
		printf("(%d,%d)\n",ans[i].first,ans[i].second);
	}
}