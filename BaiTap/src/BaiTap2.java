import java.util.Scanner;

public class BaiTap2{
	
	private static void baitoan2() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao so phan tu n");
		int n = sc.nextInt();
		for (int i= 0; i<n; i++)
		{
			for( int j= 0; j<=i; j++)
			{
				System.out.printf("* ");	
			}
			  System.out.println("");
		}
		
	    for (int i= n; i>0; i--) {
		
			for(int k= i; k>0; k--)
			{
				System.out.printf("* ");
		    }
			System.out.println("");
			
		}	
	}
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Kết quả bài toán 2 là: ");
			baitoan2();
			
	
	}

}
