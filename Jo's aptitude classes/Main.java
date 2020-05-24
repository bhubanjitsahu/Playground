#include<iostream>
using namespace std;
int main()
{
int x,y,z,a;
  std::cin>>x>>y>>z>>a;
  int small=0;
  int gcd=0;
  if(x<y<z)
    small=x;
  else if (y<x<z)
    small =y;
  else 
    small=z;
  while(small>=1)
  {
  if(x%small==0 && y%small==0 && z%small==0)
  {
    gcd=small;
    break;
  }
    small--;
  }
  if(gcd==a)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
return 0;

}