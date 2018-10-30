package problems;

import java.util.ArrayList;

public class LongestCommomPrefix {
	public static String longestCommonPrefix(String[] strs) {
		
		
		ArrayList<Character> x= new ArrayList<>();
		//choose the smallest length
		if(strs[0].charAt(0)==strs[1].charAt(0)&&strs[1].charAt(0)==strs[2].charAt(0)) {//check if there is nothing in common
			for(int i=0;i<LongestCommomPrefix.smallest(strs).length(); ) {//if common, continue
				if(strs[0].charAt(i)==strs[1].charAt(i)&&strs[1].charAt(i)==strs[2].charAt(i)) { 
					x.add(strs[0].charAt(i));
					i++;
				}
				else {
					break;
				}
			}
		}
			
		else {
			x.isEmpty();
		}
	return x.toString();
    }
    public static String smallest(String SA[]) {
        String first = SA[0];
        for (int i = 1 ; i < SA.length ; i++) {
            if ((SA[i].compareTo(first)) < 0) {
                first = SA[i];
            } // if
        } // for
        return first;
    }// smallest
	public static void main(String[] args) {
		String [] strs={"flower","flow","floght"};
		String ans=LongestCommomPrefix.longestCommonPrefix(strs);
		System.out.println(ans);

	}

}
