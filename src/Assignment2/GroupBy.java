package Assignment2;

public class GroupBy {
	public static void main(String args[])
	{
		String str="select season,winner,player_match  from ipl.csv where season > 2014 and city ='Bangalore' or date > '31-12-2014' group by win_by_runs;";
		String str1=str.replace(";","");
		String str2=str1.replaceAll("\\s+", " ");
		String strArr[]=str2.split("[, ]");
		//System.out.print(strArr[1]);
		int j;
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].equals("group"))
			{
				System.out.println(strArr[i+2]);
			}
		}
	}

}
