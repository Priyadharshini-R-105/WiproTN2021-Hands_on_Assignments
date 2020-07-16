import java.util.*;
class PositiveNegativeZero
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a==0)
{
System.out.println("Zero");
}
else if(a>=1)
{
System.out.println("Positive");
}
else
{
System.out.println("Negative");
}
}

// 5 ---> Output:Positive
// 0 ---> Output: Zero
// -2 ---> Output:Negative
