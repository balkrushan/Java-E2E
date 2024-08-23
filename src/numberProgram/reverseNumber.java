package numberProgram;

public class reverseNumber {
	
	public static void revNumber(int num)
	{
		int temp=0;
		
		while(num!=0)
		{
			int divident=num%10;
			temp=temp*10+divident;
			num=num/10;
			}
		
		System.out.println(temp);
		}
	
	public static void main(String[]args) {
		
		revNumber(1206);
		
		}
}
