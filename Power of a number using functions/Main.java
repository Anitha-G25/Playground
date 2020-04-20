#include<stdio.h>
int power(int base,int expo);
int main(){
   int base,expo;
  scanf("%d%d",&base,&expo);
  printf("%d",power(base,expo));
  	return 0;
}
int power(int base,int expo)
{
  int power=1;
  while(expo>=1)
  {
    power=power*base;
    expo--;}
  return power;
}