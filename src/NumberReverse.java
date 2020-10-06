
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberReverse {

	public static void main(String[] args) {
		exam2();

	}
	
	public static void exam1()
	{
		Scanner scn = new Scanner(System.in);	
		//	int number = scn.nextInt();
		String text = "3 4 5 6";
		StringTokenizer st = new StringTokenizer(text," ");
		int ct = st.countTokens();
		
		for(int i=0;i<ct;i++)
		{
			String token = st.nextToken();
			System.out.println(token);
		}		
	}
	
	public static void exam2()
	{
		Scanner scn = new Scanner(System.in);	
		int num = 0;
		
//		String slist[] = {"3","4","5","6","7","8"};
		System.out.println("숫자 입력시 띄어쓰기");
		String text = scn.nextLine();
		String slist[] = text.split(" ");
		
		
        int i;
        for (i = 0; i < slist.length; i++){
            System.out.print(slist[i]);
        }
        System.out.println();
        for (i = slist.length-1 ; 0 <= i ; i--) {
            System.out.print(slist[i]);
            num=num + Integer.parseInt(slist[i]);
        }
        System.out.println();
        System.out.print("각 자리수의 합 : "+num);
        
	}

}