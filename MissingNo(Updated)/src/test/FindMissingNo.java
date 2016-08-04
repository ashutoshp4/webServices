package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/*@Author Ashutosh Pathak
 * @Version 1.0 */
public class FindMissingNo {
	
	/* public static void main(String[] args) { ArrayList<Integer> list = new
	 ArrayList<Integer>(Arrays.asList(2, 2, 3, 3, 4, 6, 7, 8, 9, 10, 11, 12,
	  13, 14, 15, 18, 20, 21, 23, 24)); int a[]={1,1,2,3,4,5,6,6,7,8,9,10};
	  MissingNo missing = new MissingNo(); missing.findMissingNumber(list);
	 // missing.duplicateNummber(a); 
	  String s="abcdef";
	  reverse(s);
	 }*/
	
	
	 
/*
 * method to find missing number of given collection */ 
	
	public int[] findMissingNumber(ArrayList<Integer> arrayList) {
		ArrayList<Integer> set = new ArrayList<Integer>(arrayList);
		int i;
		Date date = new Date();
		
		
		int a[] = new int[6];
		int j = 0;
		long startTime = date.getTime();
		for (i = 0; i < arrayList.size(); i++) {

			if (!set.contains(i)) {
				a[j] = i;
				j++;
				System.out.println(i);
			}
		String s="";
	
		}
		long endTime = date.getTime();
		System.out.println("Time Required="+ (endTime - startTime));
		return a;
	}

	/*Method to find duplicate number  */
	
	public int[] duplicateNumber(int[] array) {

		HashSet<Integer> set = new HashSet<Integer>();
		int[] a  = new int[2];
		int index=0;
		for (int i = 0; i < array.length; i++) {
			if (set.add(array[i]) == false) {
				a[index++] =array[i]; 
				System.out.println("Duplicate element is:" + array[i]);
			}
		}
		return a;
	}
	/* Method to find reverse String of given collection */
	
	public static String reverse(String s) {
		List<String> tempArray = new ArrayList<String>(s.length());
		for (int i = 0; i < s.length(); i++) {
		tempArray.add(s.substring(i, i+1));
		}
		StringBuilder reversedString = new StringBuilder(s.length());
		for (int i = tempArray.size() -1; i >= 0; i--) {
		reversedString.append(tempArray.get(i));
		}
		System.out.println(reversedString);
		return reversedString.toString();
		}


}
