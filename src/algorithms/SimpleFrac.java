package algorithms;
// Java program to find
// repeating sequence
// in a fraction
import java.util.*;
import java.util.Map.Entry;
class SimpleFrac {

	public static void main(String[] args) {
		System.out.println(fractionToDecimal(11, 18));
	}

	public static String fractionToDecimal(int numerator, int denominator) {
		String result="";
		int resl = numerator/denominator;
		String res1=String.valueOf(resl)+".";
		int rem = numerator%denominator;
		if(rem == 0) {
			return String.valueOf(resl);
		}
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.clear();		
		while (rem !=0 && (!mp.containsKey(rem)))  {
			for(Entry<Integer, Integer>  entry: mp.entrySet()) {
				System.out.println("Key : "+entry.getKey()+"  -> Value : "+entry.getValue());
			}
			mp.put(rem, result.length());
			rem=rem*10;
			result=result.concat(String.valueOf(rem/denominator));
            rem = rem % denominator;
		}
		if (mp.containsKey(rem))
			return res1+result.substring(0,mp.get(rem))+"("+result.substring(mp.get(rem))+")";
		else
			return res1+result;
	}
}
 
// This code is contributed by gauravrajput1