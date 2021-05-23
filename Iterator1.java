import java.util.*;
public class Iterator1 {
	public static void  countries(HashSet s)
	{
	//HashSet sets=new HashSet<>();
	s.add("india");
	s.add("srilanka");
	s.add("Australia");
	s.add("indonesia");
	s.add("southAfrica");
	s.add("USA");
	
	}
public static void main(String[] args) {
	HashSet s1=new HashSet<>();
	countries(s1);

	for(Object obj:s1)
	{
		System.out.println(obj);
	}
	
}
}
