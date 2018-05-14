
public class ChuyenDoiDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//chuyen doi tu String sang so nguyen
		 String str = "100";
		 int converInt = Integer.parseInt(str);
		 int testInt= 200;
		 int temp = testInt + converInt;
		 System.out.println("...: " + temp);
//chuyen doi tu nguyen thuy sang string
		 int intValue1 = 200;
		 String convertString = String.valueOf(intValue1);
		 String testString = "50";
		 System.out.println(convertString + testString);
//String - WRapper
		 String stringValue = "300";
		 int intValue2 = 300;
		 Integer convertObj = Integer.valueOf(stringValue);
//Wrapper obj - string 
		 int intValue3 = 400;
		 Integer  convertWRapper = Integer.valueOf(intValue3);
		 String converString2 = convertWRapper.toString(intValue3);
		 System.out.println("300" + converString2);
		 
	}

}
