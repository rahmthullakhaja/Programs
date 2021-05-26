import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class HashmapAverage{
     public static void main(String[] args) {
 HashMap<Integer,Integer> in = new HashMap<Integer,Integer>();
         in.put(2, 24);
         in.put(3, 22);
         in.put(5, 44);
         in.put(6, 46);
         int count =0;
         int sum= 0;
     
         Iterator<Map.Entry<Integer,Integer>> itr = in.entrySet().iterator();
         while(itr.hasNext()) {
             Map.Entry<Integer, Integer> go = itr.next();
             if(go.getKey()%2 !=0) {
                 sum= sum+ go.getValue();
                 count++;
                 
             }
         }
         
//System.out.println(count);
//System.out.println(sum);
         System.out.println(sum/count + " The average" );
    
    }
}
 