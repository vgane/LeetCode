package problemset1;

public class reverseNumber {

	public static void main(String[] args) {
		int x=-1200, reversed=0;
		
		while((x%10)==0) {
			x=x/10;
		}
		while(x != 0) {
            int digit = x% 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
		System.out.println(reversed);

	}

}
