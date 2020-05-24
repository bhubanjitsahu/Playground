#include<iostream>
using namespace std;
int main()
{
  int u,c;
  cin>>u;
if(u<=200)
  c=0.5*u;
else if(u<=400)
  c=0.65*u+100;
else if(u<=600)
  c=0.80*u+200;
else if(u>=600)
  c=1.25*u+425;
cout<<"Rs."<<c;

}