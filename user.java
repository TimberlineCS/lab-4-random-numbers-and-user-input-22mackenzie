import java.io.*;
import java.util.*;
public class user{
 public static void main (String args[]){
 //challenge 1
   Scanner number = new Scanner(System.in);
   System.out.println("give me a negaitve number");
   int neg = number.nextInt();
    System.out.println("give me a postive number greater than 5");
    int pos = number.nextInt();
    double num1 = Math.round(Math.random()*pos+neg);
    int num1a = (int) num1;
     double num2 = Math.round(Math.random()*pos+neg);
     int num2a = (int) num2;
System.out.println("you got "+num1a +" and " +num2a);
//challenge 2
Scanner madlib = new Scanner(System.in);
System.out.println("give me a whole number");
int firstnum = madlib.nextInt();
System.out.println("give me a whole number");
int firstnuma = madlib.nextInt();
System.out.println(" give me a decimal greater than 1");
double secondnum = madlib.nextDouble();
Scanner madlib2 = new Scanner(System.in);
System.out.println("Give me an emotion");
String emotion1 = madlib2.nextLine();
System.out.println("Give me a body part");
String body1 = madlib2.next();
Scanner madlib3 = new Scanner(System.in);
System.out.println("Give me a name.");
String name1 = madlib3.nextLine();
System.out.println("give me an activity to do at the lake");
String act1 = madlib3.nextLine();
Scanner madlib4 = new Scanner(System.in);
System.out.println("Give me a action/verb");
String action1 = madlib4.nextLine();
System.out.println("Give me a word describing how something would taste.");
String des1 = madlib4.nextLine();
System.out.println("My family was going on a camping trip and I was so " + emotion1 +". It has been " + firstnum + "since the last camping trip. This time I was allowed to bring a friend. I brought my best friend " + name1+". The first thing we did was go on a " + secondnum +" mile "+ action1+". We then went to the lake to " + act1+". WHile we were "+ act1+" my best friend " +name1 +" had an accident and broke their " + body1+". We took my friend to the hosbital and they gave them " +firstnuma+" stiches.But later that day we were able to roast smore's and they were " + des1+". I hope that me and my friend are able to go on another camping trip sometime in the future."); 
 }}