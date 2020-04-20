#include <stdio.h>
int gcd(int a,int b);
int main() {
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  int res=gcd(a,b);
  printf("%d",gcd(res,c));
	return 0;
}
int gcd(int a,int b)
{
  int min=0,gcd=0;
  if(a<b)
  {
    min=a;
  }
  else{
    min=b;
  }
  while(min>1)
  {
    if((a%min==0)&&(b%min==0))
    {
      gcd=min;
      break;
    }
  }
  return gcd;
}