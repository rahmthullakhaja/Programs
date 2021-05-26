import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class BuffereadStream {
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int roll=sc.nextInt();
		FileOutputStream fout=new FileOutputStream("../.newfile.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		byte[] arr=("Welcome "+s+"your emp id"+roll).getBytes();
		bout.write(arr);
		bout.close();
		fout.close();
		System.out.println("successfully ended");
	
	}

}
