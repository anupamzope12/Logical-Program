package leetecodeString;

public class Reformat_phone_number {

    public static void main(String[] args) {
        String number = "1-23-45 6";
        String newnumber = "";
      
        StringBuilder sb = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) sb.append(c);
        }
        int i = 0;
        while(i < sb.length()-4) {
            sb.insert(i+3, '-');
            i+=4;
        }
        
        if (sb.length() - i == 4) {
            sb.insert(i+2, '-');
        }
        System.out.println(sb.toString());
   }
}