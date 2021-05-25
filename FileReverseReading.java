
import java.util.*;
import java.io.*;
Public class FileReverseReading
{
	Public static void main (String [] args)throws IOException;
	{		
                FileReaderfr = new FileReader(“d:/file.txt”);
		BufferedReaderbr = new BufferedReader(fr);
		String data;  
		While ((data = br.readLine()) != null){
		    String[] words = data.split("");
		    For(String a: words)
		    {
		StringBuilder builder=new StringBuilder(a);
		System.out.print(builder.reverse().toString()+"");
		    }  
            }
	}
     }
