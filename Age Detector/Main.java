#include<iostream>
using namespace std;
int main()
{
 int b,c,b1,c1;
 cin>>b>>c;
 if(b>c)
 {
   b1=b+1900;
   c1=c+2000;
   cout<<c1-b1;
 }
  else
  {
    b1=b+2000;
    c1=c+2000;
    cout<<c1-b1;
  }

}