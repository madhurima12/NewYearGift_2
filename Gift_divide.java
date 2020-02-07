import java.util.*;
import newyeargift.GulabJamun;
import newyeargift.Ladoo;
import newyeargift.Candy;
import newyeargift.Wafer;

public class Gift_divide
{
public static void main(String args[])
{
int z;
 int total_weight=0;
Scanner sc=new Scanner(System.in);
int price,weight;
String name;
GulabJamun[] obj1=new GulabJamun[10];
Ladoo[] obj2=new Ladoo[10];
Candy[] obj3=new Candy[10];
Wafer[] obj4=new Wafer[10];
int x=1,i=0,j=0,k=0,l=0;
while(x!=0)
{
System.out.println("1:Sweets");
System.out.println("2:Chocolate");
System.out.println("3:Show");
System.out.println("Enter your choice");
z=sc.nextInt();
if(z==1)
{
System.out.println("Enter the sweet's name");
name=sc.next();
System.out.println("Enter the sweet's weight");
weight=sc.nextInt();
System.out.println("Enter the sweet's price");
price=sc.nextInt();
if(name.equals("GulabJamun"))
{
obj1[i++]=new GulabJamun(price,weight);
total_weight=total_weight+weight;
}
else if(name.equals("Ladoo"))
{
obj2[j++]=new Ladoo(price,weight);
total_weight=total_weight+weight;
}
else
{
System.out.println("Sweet not present");
}
}
else if(z==2)
{
System.out.println("Enter the chocolate's type");
name=sc.next();
System.out.println("Enter the chocolate's weight");
weight=sc.nextInt();
System.out.println("Enter the chocolate's price");
price=sc.nextInt();
if(name.equals("Candy"))
{
obj3[k++]=new Candy(price,weight);
total_weight=total_weight+weight;
}
else if(name.equals("Wafer"))
{
obj4[l++]=new Wafer(price,weight);
total_weight=total_weight+weight;
}
else
{
System.out.println("Chocolate not present");
}
}
else if(z==3)
{
int index;
String input,input1;
System.out.println("Do you want to see Sweets or Chocolate");
input=sc.next();
if(input.equals("Sweets"))
{
System.out.println("Enter which sweet you want to see");
input1=sc.next();
if(input1.equals("GulabJamun"))
{
System.out.println("Enter the index");
index=sc.nextInt();
System.out.println("Gulab Jamun price and weight");
System.out.println(obj1[index].getPrice());
System.out.println(obj1[index].getWeight());
}
else if(input1.equals("Ladoo"))
{

System.out.println("Enter the index");
index=sc.nextInt();
System.out.println("Ladoo price and weight");
System.out.println(obj2[index].getPrice());
System.out.println(obj2[index].getWeight());
}
else
{
System.out.println("Wrong sweet input");
}
}
else if(input.equals("Chocolate"))
{
System.out.println("Enter which chocolate you want to see");
input1=sc.next();
if(input1.equals("Candy")) 
{
System.out.println("Enter the index");
index=sc.nextInt();
System.out.println("Candy price and weight");
System.out.println(obj3[index].getPrice());
System.out.println(obj3[index].getWeight());
}
else if(input1.equals("Wafer"))
{
System.out.println("Enter the index");
index=sc.nextInt();
System.out.println("Wafer price and weight ");
System.out.println(obj4[index].getPrice());
System.out.println(obj4[index].getWeight());
}
else
{
System.out.println("Wrong chocolate input");
}
}
}
else
{
System.out.println("Total weight is "+total_weight);
x=0;
}
}
}
}



