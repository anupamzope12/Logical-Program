package leetecodeInteger;

import java.util.Arrays;

//
//public class Plus_One {
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4};
//		Plus_One p=new Plus_One();
//		System.out.println(p.pulsone(arr));;
//	}
//	public int pulsone(int [] arr) {
//		int num=0;
//		for(int i=0; i<arr.length; i++)
//		{
//			num=arr[i]+num;
//		}
//		return num+1;
//	}
//}

//public class Plus_One {
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5};
//		Plus_One p=new Plus_One();
//		System.out.println(p.plusone(arr));;
//	}
//	public int [] plusone(int []arr) {
//		StringBuilder sb=new StringBuilder();
//		for(int num:arr) {
//			sb.append(num);
//		}
//		String l=sb.toString();
//		int concat=Integer.parseInt(l);
//		
//		String concatStr=String.valueOf(concat);
//		int [] result=new int [concatStr.length()];
//		for(int i=0;i<result.length;i++) {
//			result[i]=Character.getNumericValue(concatStr.charAt(i));
//		}
//		String concatcStr = String.valueOf(concat);
//        int[] result = new int[concatcStr.length()];
//        for (int i = 0; i < concatcStr.length(); i++) {
//            result[i] = Character.getNumericValue(concatcStr.charAt(i));
//        }
//
//		int [] m=Arrays.toString(result);
//		return Arrays.toString(result);
//		for(int i=0;i<result.length;i++) {
//			
//		}
//		System.out.println(Arrays.toString(result));
//		return result;
//	}
//}
//class Plus_One {
//	public static void main(String[] args) {
//		int arr[]= {1,2,3,8,5};
//		Plus_One p=new Plus_One();
//		System.out.println(p.plusOne(arr));;
//		
//	}
//    public int[] plusOne(int[] digits) {
//        
//        // Reverse iteration of the array
//        for (int i = digits.length - 1; i >= 0; i--) {
//
//            if (digits[i] < 9) {
//                digits[i]++;
//                return digits;
//            }
//            else
//                digits[i] = 0;
//        }
//
//        // The array has only '9'
//        int[] newDigits = new int[digits.length + 1];
//        newDigits[0] = 1;
//
//        return newDigits;
//    }
//}
class Plus_One {
	public static void main(String[] args) {
		int arr[]= {1,2,3,8,0};
		Plus_One p=new Plus_One();
		System.out.println(p.pulsOne(arr));
//		System.out.println(p.plusOne(arr));;
	}
	public int[] pulsOne(int [] digit) {
		StringBuilder sb=new StringBuilder();
		for(int num:digit) {
			sb.append(num);
		}
		String sbs=sb.toString();
		int integerparse=Integer.parseInt(sbs);
		int [] intArray=new int[] {integerparse+1};
		return intArray;
	}
}