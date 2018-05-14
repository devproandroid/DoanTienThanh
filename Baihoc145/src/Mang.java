import java.lang.reflect.Array;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntArrayData;

/**
 * @author ThanhIT
 *
 *Mảng trong java
 *tìm giá trị max min
 *sao chép mảng
 *chuyển 1 mảng về String
 *sắp xếp mảng
 *Điền giá trị cho mảng
 *Điền giá trị cho mảng
 *So sánh 2 mảng

 */
public class Mang {
	
	public static int[] removeElement(int[] array, int removedIndex ) {
		int newArray[] = new int[array.length - 1];
		for( int i = removedIndex;i <array.length -1; i++ )
		{
			newArray[i] = array[i];
		}
		for( int i = 0;i <array.length -1; i++ )
		{
			newArray[i] = array[i];
		}
		return newArray;
		
		
	}
	
	// co ban ve enum
	public enum DayOfWeek{
		monday, tuesday, wednesday, thurday, friday, saturday, sunday; 
	}

	// dung enum với instance variable
	public enum web {
		google("google.com"),facebook("facebook.com"),youtube("youtube.com");
		
		private String mUrl;
		 web(String url){
			 this.mUrl = url;
			 

		}
	}
	public String url() {
		return url();
		
	}
	
	public enum Operation{
		plu, mul, div, sub;
		
		double calcaulate(double x, double y) {
			switch (this) {
			case plu:return x+y; 
			case mul:return x-y; 
			case div:return x*y; 
			case sub:return x/y; 
			default:
				throw new AssertionError("Phep toan loi");
			}
			
	
		}
		
	}
	
	public enum Season {
		Xuan("Xuân","Spring"),ha("hạ","summer");
		private String vietnamese;
		private String english;
	    Season(String Vietnamese, String English) {
	    	this.vietnamese = Vietnamese;
	    	this.english = English;	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(removeElement(intArray, 0)));
		System.out.println(DayOfWeek.monday);
		System.out.println(web.google.mUrl);
		
		for(DayOfWeek day: DayOfWeek.values()) {
			System.out.println(day);
		}
		
		double result = Operation.sub.calcaulate(4, 0);
		System.out.println(result);
		
		System.out.println(Season.Xuan);
		
	}

}
