//Casting: ép kiểu
//wide casting: lới rộng kiểu byte - short - int - long - float - double
//ép kiểu không tường minh
public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 200;
		float floatValue = intValue;
		System.out.println("float " + floatValue);
		System.out.println("int " + intValue);
		// narrow casting: co hep ep kieu// ÉP KIỂU TƯỜNG MINH
		float floatValue2 = 10.8f;
		int intValue2 = (int)floatValue2;
		System.out.println("float " + floatValue2 + "ep sang int "+ intValue2);

	}

}
