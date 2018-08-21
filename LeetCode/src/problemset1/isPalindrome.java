package problemset1;

public class isPalindrome {

	public static void main(String[] args) {
		int x = -1221, reversed = 0;
		int num;
		num=x;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
		if((x!=reversed||x<0)){
		    System.out.println("false");
		 }
		else{
			System.out.println("true");
		}
        System.out.println("Reversed Number: " + reversed);
        
        
    }
}

	

