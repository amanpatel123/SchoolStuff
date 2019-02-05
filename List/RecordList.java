import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class RecordList {

	ArrayList<Record> records = new ArrayList<>();
	Scanner sc = null;
	
	
	public RecordList(String FILENAME)
	{
		try {
			sc = new Scanner(new FileInputStream(FILENAME));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error");
			System.exit(1);
		}
		
		String line;
		while(sc.hasNextLine()) {
		line = sc.nextLine();
		
		records.add(new Record(line));
		}
	}
	
	public void addRecord(String FILENAME)
	{
		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter the entry");
		String line = sn.nextLine();
		PrintWriter stream=null;
		try {
			stream = new PrintWriter(new FileOutputStream(FILENAME, true));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error 1");
		}
		line="\n"+line;
		stream.printf("\n"+line);
		stream.close();
		System.out.println("Succesfull");
	}
	
	public void displayRecord()
	{
		Iterator<Record> itr = records.iterator();
		//int i=0;
		while(itr.hasNext())
		{
			Record R = itr.next();
			System.out.println(R.toString());
			
		}
	
	}
	
}
