#include<iostream>
using namespace std;
int main()
{ 
  int n;
  float x=0.5,sum=0; 
  cin>>n;
  if(n==1)
    cout<<0.5;
  else if(n>1)
 { cout<<0.5<<" ";
   for(int i=1;i<n;i++)
  	 { 
     sum= x*2 + x;
     cout<<sum<<" ";
     x=sum;
   	}
 }
}