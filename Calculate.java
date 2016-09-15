
public class Calculate {
	
	public static void main (String[] args){

		if (args[0]. contains(".") || args[1]. contains(".")){
			double first = Double.valueOf(args[0]);
			double second = Double.valueOf(args[1]);
			
			double sum = first+second;
			double diff = first-second;
			double mult = first*second;
			double div = first/second;
			double exp = Math.pow(first,second);
			
			System.out.println("Sum = " + sum);
			System.out.println("Dif = " + diff);
			System.out.println("Mult = " + mult);
			System.out.println("Div = " + div);
			System.out.println("Exp = " + exp);
		}
		else
		{
			int first = Integer.valueOf(args[0]);
			int second = Integer.valueOf(args[1]);
			
			int sum = first+second;
			int diff = first-second;
			int mult = first*second;
			double div = first;
			div = div/second;
			double exp = Math.pow(first,second);
			
			System.out.println("Sum = " + sum);
			System.out.println("Dif = " + diff);
			System.out.println("Mult = " + mult);
			System.out.println("Div = " + div);
			System.out.println("Exp = " + exp);
		}
				
		
	}
	
}