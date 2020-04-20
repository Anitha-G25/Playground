#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int x=n;
  for(int r=1;r<=n;r++)
  {
    for(int col=x;col>=1;col--)
    {
      printf("%d",col);
    }
    x--;
    printf("\n");
  }return 0;
}
    