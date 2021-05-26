import java.util.*;
class StringPrinter
{
public static void printString(String a,String b)
{
 System.out.println(a+" "+b);
}
}
class PrinterThread implements Runnable
{
String a, b;
public PrinterThread (String a,String b)
{
this.a=a;
this.b=b;
}

 public void  run()
{
System.out.println(a+" "+b);
}
}

class Main
{
public static void main(String args[])
{
 PrinterThread t1=new  PrinterThread("Hello","There");

 PrinterThread t2=new  PrinterThread("How ","are you");

 PrinterThread t3=new  PrinterThread("Thankyou ","verymuch");
Thread s1=new Thread(t1);
Thread s2=new Thread(t2);
Thread s3=new Thread(t3);

s1.start();
 try{  
  s1.join();  
 }catch(Exception e){System.out.println(e);}  
s2.start();
s3.start();

}
}
