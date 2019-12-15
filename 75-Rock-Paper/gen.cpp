#include <cstdio>
#include <algorithm>
#include <vector>
#include <stdlib.h>
#include <time.h>
using namespace std;
int main(){
	srand(time(NULL));
	char in[10][20] = {"rock","RoCk","rocK","papEr","paper","Scissors","scissors","SciSSors","ScissOrs","paPER"};
	int x = rand()%10;
	printf("%s\n",in[x]);
	x = rand()%10;
	printf("%s\n",in[x]);
    return 0;
}