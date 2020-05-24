#include<iostream>
using namespace std;
int main()
{ 
int x1,y1,x2,y2,x3,y3;
  
cin>>x1>>y1>>x2>>y2>>x3>>y3;
  
float a=x1+x2+x3;
  a/=3;
float b=y1+y2+y3;
  b/=3;
cout<<a<<"\n"<<b<<"\n";
}