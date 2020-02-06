package www.rachana.new_yeargifts;
import java.util.*;
abstract class Newyear_Gift
{
abstract public void menu(); //abstract method extended in chocolates and sweets
}
class Chocolates extends Newyear_Gift //abstract methods can be implemeted in child class using concept of inheritance
{
public void menu() //chocolates menu
{
System.out.println("MENU");
System.out.println("Chocolates Menu:");
System.out.println("1.candy(age=1 to 5) \n2.milkbar(age=6 to 10) \n3.darkbar(age=11 to 20) \n4.beerbar(age=21 to 100) \n");
}
int sort(int age,int n) //sort method for chocolates
{
int weight_c=0; //weight_c=weight of chocolates
if(age>=1 && age<=5)
{
weight_c=50*n;  //50 is weight of candy
}
else if(age>=6 && age<=10)
{
weight_c=150*n; //150 is weight of milky bar
}
else if(age>=11 && age<=20)
{
weight_c=200*n; //200 is weight of darkbar
}
else if(age>=21 && age<=100)
{
weight_c=250*n; //250 is weight of beerbar
}
else //worst case
{
System.out.println("INVALID AGE please enter correct age during next compilation");
}
return weight_c; //returning value from function sort of chocolates
}
}
class sweets extends Newyear_Gift
{
public void menu() //menu of sweets
{
System.out.println("MENU");
System.out.println("Sweets Menu(any age group can choose any of sweets below):");
System.out.println("1.kajuSweets \n2.BadamSweets \n3.Dryfruitsweets \n4.carrotsweets");
}
int sort(int s_no,int p) //sort method of sweets.If observed polymorphism is found between sort of chocolates and sweets it uses method overriding concepts
{
int weight_s=0; //sweet weight intinally 0
if(s_no==1)
{
weight_s=50*p; //weight of kajusweet is 50
}
else if(s_no==2)
{
weight_s=150*p; //weight of badamsweet is 150
}
else if(s_no==3)
{
weight_s=200*p; //weight of dryfruitsweet is 200
}
else if(s_no==4)
{
weight_s=250*p; //weight of carrotsweet is 250
}
else //worst case
{
System.out.println("Invalid sweet selection please refer menu and select during next compilation");
}
return weight_s; //returning value of sweet weight
}
}
public class gifts
{
public static void main(String[] args)throws Exception
{
Scanner sc=new Scanner(System.in); 
Chocolates c=new Chocolates(); //object to chocolate
c.menu(); //meu of chocolates
System.out.println("enter your age:");
int age=sc.nextInt(); //age of person
System.out.println("enter number of chocolate pieces:");
int n=sc.nextInt(); //n is number of chocolates
c.sort(age,n); // sort method of chocolates
sweets s=new sweets();  //object to sweet
s.menu();       //menu of sweets
System.out.println("enter the serial number of sweet you want to choose:");
int s_no=sc.nextInt(); //serial no of sweet in menu
System.out.println("enter number of sweets:");
int p=sc.nextInt(); //number of sweets
s.sort(s_no,p); //sort method of sweets
int c_wt=c.sort(age,n); //storing return value of sort method of chocolate in c_wt
int s_wt=s.sort(s_no,p); //storing return value of sort method of sweet in s_wt
System.out.println("Total weight of chocolates in gift:"+ c_wt);
System.out.println("Total weight of sweets in gift:"+ s_wt);
System.out.println("Total weight of Gift of each Student collected:"+ (c_wt+s_wt));
System.out.println("Total number of Chocolates and Sweets in Gift:"+ (n+p));
}
} //end of code








