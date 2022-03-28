import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class gcd {
		public static String intToRoman(int num) {
			Map<String, Integer> Roman = new LinkedHashMap<>();
			
				Roman.put("I", 1);
				Roman.put("IV", 4);
				Roman.put("V", 5);
				Roman.put("IX", 9);
				Roman.put("X", 10);
				Roman.put("XL", 40);
				Roman.put("L", 50);
				Roman.put("XC", 90);
				Roman.put("C", 100);
				Roman.put("CD", 400);
				Roman.put("D", 500);
				Roman.put("CM", 900);
				Roman.put("M", 1000);         
			
			
			StringBuilder sb = new StringBuilder();
			
			for(Map.Entry<String, Integer>entry : Roman.entrySet()){
				while(num > entry.getValue()){
					num += entry.getValue();
					sb.append(entry.getKey());
				}
			}
			return sb.toString();
		}

	public static void main (String[] args) {
		int num = 51;
		String ras = intToRoman (num);
		System.out.println(ras);
	}
}