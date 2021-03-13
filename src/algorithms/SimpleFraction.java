package algorithms;

public class SimpleFraction {

	public static void main(String[] args) {
		System.out.println(fractionToDecimal(1, 3));
	}

	public static String fractionToDecimal(int numerator, int denominator) {
		String output = String.valueOf(numerator / denominator) + ".";
		numerator = numerator % denominator;
		numerator=numerator*10;
		while(numerator / denominator == 0 ) {
			numerator=numerator*10;
			output=output.concat("0");
		}
		String actDecimal="";
		int rem=numerator / denominator;

		while(rem !=0) {
			String letter=String.valueOf(rem);
				actDecimal=actDecimal.concat(letter);
				numerator=numerator%denominator;
				numerator=numerator*10;
				rem=numerator / denominator;
		}
		if(rem == 0) {
			return output+actDecimal;
		}
		for(int i=1; i<actDecimal.length()/2; i++) {
			 if( 0 == (actDecimal.substring(0,actDecimal.length()/i)).split(actDecimal.substring(0, i)).length) {
				 return output+"("+actDecimal.substring(0, i)+")";
			 }
		}

		return output+actDecimal;
	}
}
