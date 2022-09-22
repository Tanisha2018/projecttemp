package practice1;

public class maximum_occuringcharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc12def34";
		char a[]=s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					
					
				}
				
				
				
			}
			
			
			
		}
		
		
		
	}

}
