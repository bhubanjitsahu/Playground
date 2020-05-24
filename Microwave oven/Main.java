#include<iostream>
using namespace std;
int main()
{
int items;
float time;
cin>>items>>time;
if(items==2){
	time=time+0.5*time;
	cout<<time;}
else if (items==3){
	time=time*2;
  	cout<<time;}
  else {
  cout<<"Number of items is more";}
}