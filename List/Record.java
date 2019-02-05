import java.util.StringTokenizer;

public class Record  {

	String First; 
	String Last;
	String DOB;

	Record(String line)
	{
		StringTokenizer st = new StringTokenizer(line, ",");
		String f = st.nextToken();
		String l = st.nextToken();
		String DOB= st.nextToken();
		
		First= f;
		Last = l;
		this.DOB = DOB;
	}
	
	public void changeFirst(String str)
	{
		First = str;
	}
	
	public void changeLast(String str)
	{
		Last = str;
	}
	
	public void changeDOB(String str)
	{
		DOB = str;
	}
	
	public String getFirst()
	{
		return First;
	}
	
	public String getLast()
	{
		return Last;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	public String toString()
	{
		return "First Name:"+getFirst()+"  Last Name:"+getLast()+"  Dob:"+getDOB();
	}
	
	
}
