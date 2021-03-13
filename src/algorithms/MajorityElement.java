package algorithms;

import java.util.HashMap;

public class MajorityElement {
	static int[] array = { 1, 2, 2, 3,3 ,1,2};

	public static void main(String[] args) {
		System.out.println(getMajorityElement());
		System.out.println("abcdefghabcdefgh".indexOf("gf"));
		System.out.println(new MajorityElement());
	}

	private static int getMajorityElement() {
		HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int size= (int)Math.floor(array.length/2);
		for(int i:array) {
			if(countMap.get(i) == null) {
				countMap.put(i, 1);
			}else {
				int existingCount = countMap.get(i);
				if(existingCount == size-1) {
					return i;
				}else {
					countMap.put(i,existingCount+1);					
				}
			}
		}
		System.out.println(countMap);
		return 0;
	}

}
