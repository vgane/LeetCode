package problemset1;

public class RomanToInt {
	public static void main(String[] args) {
		int a=0,b=0,c=0, d=0;
		String x="MCMXCIV";
		int I=1;
		int V=5;
		int X=10;
		int L=50;
		int C=100;
		int D= 500;
		int M= 1000;
		
		if((x.length()%2)==0) {
		
				if((x.indexOf("V"))>(x.indexOf("I"))){ //if I is before V
					 a=4;}
				if((x.indexOf("V"))<(x.indexOf("I"))){ //if V is before I
					a=6;}
				if((x.indexOf("C"))<(x.indexOf("X"))){ //if C is before X
					b=90;}
				if((x.indexOf("C"))>(x.indexOf("X"))){ //if  X before C
					 b=110;}
				if((x.indexOf("D"))>(x.indexOf("C"))){//if C is before D
					c=400;}
				if((x.indexOf("D"))<(x.indexOf("C"))){//if D is before C
					c=600;}
				if((x.indexOf("M"))>(x.indexOf("C"))){//if C is before M
					c=900;}
				if((x.indexOf("M"))<(x.indexOf("C"))){//if M is before C
					c=1100;}
					
			}
				else{
					if((x.indexOf("V"))>(x.indexOf("I"))){ //if I is before V
						 a=4;}
					if((x.indexOf("V"))<(x.indexOf("I"))){ //if V is before I
						a=6;}
					if((x.indexOf("C"))<(x.indexOf("X"))){ //if C is before X
						b=90;}
					if((x.indexOf("C"))>(x.indexOf("X"))){ //if  X before C
						 b=110;}
					if((x.indexOf("D"))>(x.indexOf("C"))){//if C is before D
						c=400;}
					if((x.indexOf("D"))<(x.indexOf("C"))){//if D is before C
						c=600;}
					if((x.indexOf("M"))>(x.indexOf("C"))){//if C is before M
						c=900;}
					if((x.indexOf("M"))<(x.indexOf("C"))){//if M is before C
						c=1100;}
					d=x.charAt(0);
				}
				System.out.println(a+b+c);
		}
		}			
	
		

	

