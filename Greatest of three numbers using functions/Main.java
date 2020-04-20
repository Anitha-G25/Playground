#include <stdio.h>
int x(int a,int b);
int main(){
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int g=x(a,b);
  printf("%d",x(g,c));
  	return 0;
}
int x(int a,int b)
{
  int max=0;
  if(a>b)
  {
    max=a;
  }
  else
  {
    max=b;
  }
  return max;
}