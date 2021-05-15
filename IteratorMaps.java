import java.util.*;
class IteratorMaps
{
public static void main(String args[])
{
Map<Integer,String> hm= new HashMap<Integer,String>();
add(hm);
for(Integer s:hm.keySet())
{
System.out.println(s+" "+hm.get(s));
}
}
public static void add(Map<Integer,String> ms)
{
ms.put(1,"srihari");
ms.put(2,"khaja");
ms.put(3,"rahmthulla");
ms.put(4,"ravi");
ms.put(5,"revanth");

}
}
