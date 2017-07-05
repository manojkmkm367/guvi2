import java.io.IOException;
import java.util.*;


public class Main {
		public static void main(String[] args)throws IOException{
			Scanner in=new Scanner(System.in);
			System.out.println("ENTER THE STRING");
			String a=in.nextLine();
			int n=a.length();
			int i,j,count,len1=1;
			TreeMap<Integer,String> hm=new TreeMap<Integer,String>();  
			for(i=0;i<n;i++)
			{
				count=0;
				for(j=i;j<n;j++)
				{
					//System.out.println(i+"..."+j);
					if((a.substring(i,i+1) ).equals(a.substring(j,j+1)))
					{
						count++;
					}
					hm.put(count,(a.substring(i,i+1)));
				}
			}
			
			for(Map.Entry<Integer, String> obj: hm.entrySet())
			{
				if(len1==hm.size())
				System.out.println(obj.getValue()+" is greater letter of repeted at the string & it's repeted time of "+obj.getKey());
				len1++;
			}
			
			
		}

}
