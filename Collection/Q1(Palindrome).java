//

import java.util.*;
class HelloWorld {
    static List list=new ArrayList();
    static boolean isPalindrome(int x)
    {
        int t=x;
        int sum=0;
        while(x!=0)
        {
            int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(sum==t)
        return true;
        return false;

        
    }
   public static void  main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt(),m=sc.nextInt();
     int sum=0;
     for(int i=n;i<=m;i++)
     {
         if(isPalindrome(i))
         {
             list.add(i);
             sum=sum+i;
         }
     }
    // System.out.println(list);
     System.out.println(sum);
     
   }
   }