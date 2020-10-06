package assignment;

public class test {

	public static void main(String[] args) {
//		exam1();
//		exam2();
//		exam3();
//		exam4();
//		exam5();
		exam6();

	}
	
	public static void exam1() {
		int top =5;
		int bot =10;
		int hei=7;
		double area = (double)(top+bot)*hei/2;
		double area2 = ((top+bot)/2.0)*hei;
		System.out.println(area);
		System.out.println(area2);
	}

	public static void exam2() {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static void exam3() {		
		while(true)
		{
			int num1 = (int) (Math.random()*6+1);
			int num2 = (int) (Math.random()*6+1);
			System.out.println("("+num1+","+num2+")");
			if((num1+num2)==5)
				break;
		}
		System.out.println();
	}
	
	public static void exam4() {
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}
	
 	public static void exam5() {
 		byte byteValue=10;
		byte result = (byte) (byteValue+byteValue);
		System.out.println(result);
	}
 	
	public static void exam6() {
		int max=0;
		int[] array= {1,5,3,8,2};
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i])
				max=array[i];
		}
		
		System.out.println("max : "+max);
	}
	
}

/*
 	public static void exam4() {
		
	}
 */