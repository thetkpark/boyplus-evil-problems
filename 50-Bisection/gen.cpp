#include <cstdio>
#include <ctime>
#include <cstdlib>
#include <iostream>
using namespace std;
int main(){
	srand(time(NULL));
	int a = -1000000,b=1000000;
	printf("%d %d ",a,b);
	int c1 = rand()%200+1;
	int c2 = rand()%200+1;
	printf("%d %d ",c1,c2);
	double tol = 0.001;
	cout << tol << "\n";
    return 0;
}