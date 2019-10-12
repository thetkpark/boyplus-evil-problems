#include <cstdio>
#include <algorithm>
#include <vector>
#include <math.h>
using namespace std;
double f(double x,double c1,double c2){
    return c1+(c2*(x-sin(x)));
}
int main(){
    double a,b,c1,c2,tol;
    scanf("%lf %lf %lf %lf %lf",&a,&b,&c1,&c2,&tol);
    double nowtol = (b-a)/2;
    double mid = (a+b)/2;
    while(nowtol > tol){
        mid = (a+b)/2;
        nowtol = (b-a)/2;
        if(f(a,c1,c2)*f(mid,c1,c2) < 0){
            b = mid;
        }
        else if(f(a,c1,c2)*f(mid,c1,c2) > 0){
            a = mid;
        }
    }
    printf("%.6lf",mid);
    return 0;
}