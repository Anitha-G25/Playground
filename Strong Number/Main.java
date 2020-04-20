#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int temp=n;
  int sum=0;
  while(n!=0)
  {
    int r=n%10;
    int s=1;
    for(int i=1;i<=r;i++)
    {
      s=s*i;
    }
    sum=sum+s;
    n=n/10;
  }
  if(sum==temp)
    printf("Yes");
  else
    printf("No");
	return 0;
}