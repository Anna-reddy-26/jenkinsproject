public class GCD{
	public static in find GCD(int a,int b){
		if(b==0)
		{
			return a;
		}
		return find GCD(b,a%b);
	}
	public static void main(String[]args){
		int num 1=10;
		int num 2=20;
		int gcd=find GCD(num 1,num 2)
			System.out.println("the GCD of",+num1+"and" +num2+"is",+gcd);
	}
}

