
import java.util.*;
class map1
{
public static void main(String args[])
{
HashMap<Integer,String>m=new HashMap<Integer,String>();
studentdetails(m);
Set<Integer> s=m.keySet();
for(Integer key:s)
   System.out.println(key+" "+m.get(key));
}
public void studentdetails(Map<Integer,String> m)
{
      m.put(1,"india"); 
       m.put(2,"Australia");   
       m.put(3,"canada"); 
       m.put(4,"china"); 
}
}
