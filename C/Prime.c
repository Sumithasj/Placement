#include<stdio.h>
void main()
{
    long n;
    int i,fact;
    //printf("enter no");
    scanf("%d",&n);
    for(i=2;i<=n;i++)
    {
        fact=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                fact++;
            }
        }
        if(fact==2)
        {
        printf("%d",i);
        }
    }
}
