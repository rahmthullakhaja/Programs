import java.util.ArrayList;
import java.util.*;
public class Main {

	public static void main(String args[])
	{

		Main c=new Main();
		System.out.println(Main.countries());
	    System.out.println(c.numbers());
	    System.out.println(c.Totalnumbers());
	    // System.out.println(c.Totalnumbers());
	}
	
	public 	static  List countries()
	{
		ArrayList list=new ArrayList<>();
		list.add("india");
		list.add("china");
		list.add("Australia");
		list.add("Newzeland");
		list.add("philipness");
		return list;
	}
	
	public static List numbers()
	{
		ArrayList list1=new ArrayList<>();
		for(int i=0;i<=10;i++)
		{
			list1.add(i);
			
		}
	   return list1;
	}
	public static List Totalnumbers()	{
		ArrayList list2=new ArrayList<>();
		for(int i=11;i<=15;i++)
		{
          list2.addAll(list2);
			list2.add(i);
			
		}
	   return list2;
	}
}