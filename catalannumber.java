import java.util.*;
class catalannumber
{
    Scanner ob=new Scanner(System.in);
int fact(int n)//recursive function to calculate factorial of 'n'
{
    if(n==0)
    return 1;
    else
    return(n*fact(n-1));
}
void main()
{
    int ctr;//stores the count of numbers to be generated
    System.out.print("\n Enter the count of catalan numbers to be generated:");
    ctr=ob.nextInt();
    System.out.println("\n The first "+ctr+" Catalan Numbers are...\n");
    for(int i=0;i<ctr;i++)
    {
        int term1=fact(2*i);//stores the value of(2n)!
        int term2=fact(i+1);//stores the value of (n+1)!
        int term3=fact(i);//stores the value of n!
        int finalterm=(int)term1/(term2*term3);//gives final term=catalan number at i'th position
        System.out.print(finalterm+"  ");
    }
}
}