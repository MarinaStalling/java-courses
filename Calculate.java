public class Calculate {
	
	public static void main (String[] args){

		if (args[0].contains(".") || args[1].contains(",")){
			double first = Double.valueOf(args[0].replace(",", "."));
			double second = Double.valueOf(args[1].replace(",", "."));
			System.out.println("Sum = " + getSum(first, second));
			System.out.println("Dif = " + getDiff(first, second));
			System.out.println("Mult = " + getMult(first, second));
			System.out.println("Div = " + getDiv(first, second));
			System.out.println("Exp = " + getExp(first, second));
		}
		else
		{
			int first = Integer.valueOf(args[0]);
			int second = Integer.valueOf(args[1]);
			System.out.println("Sum = " + getSum(first, second));
			System.out.println("Dif = " + getDiff(first, second));
			System.out.println("Mult = " + getMult(first, second));
			System.out.println("Div = " + getDiv(first, second));
			System.out.println("Exp = " + getExp(first, second));
		}
				
		
	}
	
	static int getSum(int first, int second){
	    return first+second;
	}
	static double getSum(double first, double second){	         
	    return first+second;
	}
	
	static int getDiff(int first, int second){
	    return first-second;
	}
	static double getDiff(double first, double second){	         
	    return first-second;
	    
	}
	static int getMult(int first, int second){
	    return first*second;
	}
	static double getMult(double first, double second){	         
	    return first*second;
	}
	
	static int getDiv(int first, int second){
	    return first/second;
	}
	static double getDiv(double first, double second){	         
	    return first/second;
	}
	
	static int getExp(double first, double second){
	    return Math.getExponent(Math.pow(first, second));
	}
	static double getExp(int first, int second){	         
	    return Math.pow(first,second);
	}
}