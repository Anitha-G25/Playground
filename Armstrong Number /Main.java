#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int temp=n;
  int sum=0;
  while(n!=0)
  {
    int r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
  }
  if(sum==temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}