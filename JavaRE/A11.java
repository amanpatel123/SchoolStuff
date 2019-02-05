package assignment1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A11 {
	
	public static void main(String[] args) 
	{
		BufferedReader br= null;
		BufferedWriter bw= null;

		String line;
		String t;
		ArrayList<String> keyword = new ArrayList<>(Arrays.asList("WRITE", "READ", "IF", "ELSE", "RETURN", "BEGIN", "END", "MAIN", "STRING", "INT", "REAL"));
		ArrayList<String> check = new ArrayList<>();

		try {
			 br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\cs214\\src\\assignment1\\A1.tiny"));
			 bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\eclipse-workspace\\cs214\\src\\assignment1\\A1.output")); 
			
			 while((line = br.readLine()) != null)
			{
	
				StringTokenizer st = new StringTokenizer(line, " ;,()+-*/:!=#&%_");
				while(st.hasMoreTokens()) 
				{
					t = st.nextToken();
					System.out.println(t);
					System.out.println(t.length());
					if(t.contains("½")) {
						System.out.println("Index: "+t.indexOf('½'));
						if(t.indexOf('½') == t.length())
							t = t.substring(t.indexOf('½'));
						else
						t = t.substring(t.indexOf('½'));
					}
					
						
					if(( t.charAt((t.length())-1)!='"') && !(keyword.contains(t)) && isLetterOrDigit(t.charAt(0)) )
					{
		
						if(!check.contains(t))
							check.add(t);
					}
				}
				System.out.println(check);
				
			}
			bw.write("Identifiers: "+ check.size());
			System.out.println("Identifiers : "+check.size());
			br.close();
			bw.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error");
		}
		catch(IOException e)
		{
			System.out.println("IOexceoption");
		}
		
		
		
	}

	private static boolean isLetterOrDigit(char c) {
	    return (c >= 'a' && c <= 'z') ||
	           (c >= 'A' && c <= 'Z') ||
	           (c >= '0' && c <= '9');
	}
}
