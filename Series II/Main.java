#include<iostream>
#include<math.h>
using namespace std;
int main()
{
int n,sum;
  cin>>n;
  cout<<"121"<<" ";
  for(int i=1;i<n;i++)
  {
    sum=pow((11+4*i),2);
    cout<<sum<<" ";
  }

}