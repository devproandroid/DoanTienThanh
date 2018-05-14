import java.util.Scanner;

public class BaiTap3 {
	 
	 public static void Nhap() {
		 String s;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Hãy nhập vào chuỗi kí tự");
		 s= sc.nextLine();
		 System.out.println("Hãy nhập vào kí tự bạn cần tìm :");
		 char c;
		  c= sc.next().charAt(0);
		  int count = 0;
		  
		  for( int i = 0; i<s.length(); i ++)
		  {
			  if(s.charAt(i) == c)
			  
				  count++;
				 
			
		  }
		  if(count == 0)
			  System.out.println("Kí tự"+ c + " không có trong chuỗi");
		  else
			  System.out.println("Số lần xuất hiện của kí tự "+ c + " là: " + count+ " lần");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kết quả bài toán 3 là : ");
		Nhap();

	}

}
