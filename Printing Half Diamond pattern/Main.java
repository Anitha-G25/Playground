#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int r=1;r<=n;r++)
  {
    for(int space=1;space<=n-r;space++)
    {
      printf(" ");
    }
    for(int col=1;col<=2*r-1;col++)
    {
      printf("*");
    }
    printf("\n");
  }
	return 0;
}