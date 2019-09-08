#include <cstdio>
#include <algorithm>
#include <vector>
#include <ctime>
#include <cstdlib>
using namespace std;
int main(){
	srand(time(NULL));
	int length = rand()%10000+1;
	for(int i=0;i<length;i++){
		int temp = rand()%6;
		int c = 65;
		if(temp == 0 == temp == 1){
			//small
			c = rand()%(122-97+1)+97;
		}
		else if(temp == 2 || temp == 3){
			//big
			c = rand()%(90-65+1)+65;
		}
		else if(temp == 4){
			//space
			c = ' ';
		}
		else{
			//special
			c = rand()%(125-32+1)+32;
		}
		printf("%c",c);
	}
	printf("\n");
}