
public class runnable implements Runnable{
public  void run()
{
for(int i=0;i<10;i++)
{
System.out.println(i);
}
}
public static void main(String args[])
{

runnable d=new runnable();
Thread t1=new Thread(d);
t1.start();
}
}

