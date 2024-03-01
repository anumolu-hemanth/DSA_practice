package strings;

import java.util.Arrays;
import java.util.Scanner;

/*
Approach:
In this approach we are keeping count of the ones count and using an array to build the max binary number
using the count we are setting the last index to one and the first ones-1 elements of array to one to return the max binary value
using String constructor we are generating the string from array

Complexity:
TC: O(n) because we are iterating over the length of string twice (2n)
SC: O(n) we are using the array for conversion size of array (n)

Notes:
we can convert a char array to string using 3 methods
1. using String constructor String s = new String(char[] arr)
2. using StringBuilder StringBuilder sb = new StringBuilder(); sb.append(char[] arr); String str += sb;
3. using valueOf method in String class String str = String.valueOf(char[] arr);
*/

public class MaximumOddBinaryString {
	public static String maxOddBinaryNumber(String s) {
		int ones=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                ones++;
        }
        char[] out = new char[s.length()];
        Arrays.fill(out, '0');
        out[s.length()-1]='1';
        ones--;
        int i=0;
        while(ones>0){
            out[i++]='1';
            ones--;
        }
        String res = new String(out);
        return res;
	}
	
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		System.out.println(maxOddBinaryNumber(s));
		return;
	}
}