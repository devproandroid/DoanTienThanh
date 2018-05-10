import java.util.Scanner;

public class Bai2 {
	private int month;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Nhap vao mot thang trong nam: ");
		int month = s.nextInt();
		if(month>12)
			System.out.println("Sai tháng, xin hãy nhập lại");
		else {
		if(month == 2) {
			System.out.println("Nam nay co phai nam nhuan k: ");
			String asw = s.next();
			if (asw.equals("Y")) 
			{
				System.out.println("Thang "+ month +" nam nhuan co 29 ngay");
				}
			else {
				System.out.println("Thang "+ month +" co 28 ngay");}
				}
	else if(month ==1|| month ==3|| month ==5|| month ==7|| month ==8|| month ==10|| month ==12 )
					{ System.out.println("Thang "+ month +" co 31 ngay");}
				else if(month ==4|| month ==2|| month ==6|| month ==9|| month ==11|| month ==9 )
						System.out.println("Thang "+ month +" co 30 ngay");			

	
	}
  }

}
