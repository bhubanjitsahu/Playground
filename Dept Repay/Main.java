#include<iostream>
using namespace std;
int main() 
{ 
  int p,r,t; 
  float interest,amount,discount,settlement;
  cin>>p>>r>>t; 
  interest=(p*r*t)/100;
  amount=p+interest;
  discount=0.02*interest; 
  settlement=amount-discount;
  cout<<interest<<"\n"<<amount<<"\n"<<discount<<"\n"<<settlement<<"\n";
  return 0; 
}

