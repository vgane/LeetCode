package problemset1;

public class TenMinWalk{
		  public static boolean isValid(char[] walk) {
		    int sum=0;
		   for(int i=0;i<walk.length;i++){
		    if (walk[i]=='s'){sum=sum+3;}
		    if (walk[i]=='e'){sum++;}
		    if (walk[i]=='w'){sum=sum+4;}
		    }

		 
		   if(sum==15||sum==17||sum==19||sum==21||sum==23||sum==25)
		    return true;
		    else
		    return false;
		  }
		
}
