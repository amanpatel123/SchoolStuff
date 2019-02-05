package assignment1;

import java.util.*;
import java.io.*;
import java.util.regex.*;

public class A12 {

	public static void main(String[] args) {
		
		BufferedReader br= null;
		BufferedWriter bw= null;
		ArrayList<String> keyword = new ArrayList<>(Arrays.asList("WRITE", "READ", "IF", "ELSE", "RETURN", "BEGIN", "END", "MAIN", "STRING", "INT", "REAL"));
		ArrayList<String> ID = new ArrayList<>();
		
		String pattern = "(?:\"[^\"]*\"|([a-zA-Z])([a-zA-Z0-9])*)";
		String line = null;
		
		try {
		 br = new BufferedReader(new FileReader("C:\\Users\\admin\\eclipse-workspace\\cs214\\src\\assignment1\\A1.tiny"));
		 bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\eclipse-workspace\\cs214\\src\\assignment1\\A1.output")); 
			while((line = br.readLine()) != null)
			{
				 Pattern r = Pattern.compile(pattern);
				 Matcher m = r.matcher(line);
				 while(m.find())
				 {
					 String str= m.group().toString();
					 if(!(keyword.contains(str)) && (str.charAt(0)!='"'))
						{
							if(!ID.contains(str))
								ID.add(str);
						}
					 
				 }
				 System.out.println(ID);
				
				}
			
				bw.write("Identifiers: "+ ID.size());
				br.close();
				bw.close();
				
		}
		catch(FileNotFoundException e )
		{
			System.out.println("Error");
		}
		catch(IOException e)
		{
			System.out.println("IO exception");
		}
	}

}
