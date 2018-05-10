import com.sun.jndi.toolkit.ctx.Continuation;

/*
 * 
 * 
 * 
 * 
 */
public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ví dụ về lệnh breack: ");
		int a= 1;
		while(a<15)
		{
			System.out.println("---------------------------");
			System.out.println("a = "+ a);
			
			a++;
			if(a%5==0) 
			{
			  continue;
			}
		
			System.out.println("sau khi tang : "+ a);
		
	}
	}
}
