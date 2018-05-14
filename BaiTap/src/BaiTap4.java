import java.util.Scanner;

public class BaiTap4 {
	public static void Nhap4() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập n:");
		n=  sc.nextInt();
		for(int i = 1; i <= n; i++)
		{
			if(i == 1) 
			
			   System.out.printf(" **** ");
			
			else if(i == n/2)
			
					System.out.printf("******");
			
			else
			{
				
				System.out.printf("*    *");
			}
			System.out.println(" ");
				
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nhap4();

	}

}
