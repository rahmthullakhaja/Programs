import java.util.*;
public class Maps {
	public static void  countries(HashMap<Integer,String> s)
	{
	//HashSet sets=new HashSet<>();
	s.put(1,"india");
	s.put(2,"srilanka");
	s.put(3,"Australia");
	s.put(4,"indonesia");
	s.put(5,"southAfrica");
	s.put(6,"USA");
	
	}
public static void main(String[] args) {
	HashMap<Integer,String> s1=new HashMap<Integer,String>();
	countries(s1);
Set<Integer> m=s1.keySet();
    for(Integer key:m)
{
System.out.println(key+" "+m.get(key));
}

}
}
