import java.util.*;
public class LastDidit
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int unit_digit_of_a=a%10;
int unit_digit_of_b=b%10;
if(unit_digit_of_a == unit_digit_of_b);
{
System.out.println("True");
}
else
{
System.out.println("False");
}
}

// a=7 b= 17
  ouput: True
  
 // a=6 b=7
  ouput: False
