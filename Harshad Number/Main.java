#include<iostream>
using namespace std;
int main()
{
int x,count=0,r,temp;
cin>>x;
temp=x;
while(x>0)
{
r=x%10;  
count=count+r;  
x=x/10;
}
  if(temp%count==0){
  cout<<"Harshad Number";}
  else {
  cout<<"Not Harshad Number";}
}