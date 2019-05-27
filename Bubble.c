#include<stdio.h>
void main()
{
    int n,number[20],temp,i,j;
    printf("enter total number");
    scanf("%d",&n);
    for(int i=0;i<=n;i++)
        scanf("%d",&number[i]);
    for(i=1;i<=n;++i)
        for(j=0;j<=i;++j)
            if(number[j]>number[j+1])
            {
                temp=number[j];
                number[j]=number[j+1];
                number[j+1]=temp;
            }
    printf("sorting array");
    for(i=0;i<n;++i)
        printf("%d",number[i]);
    return 0;
}


