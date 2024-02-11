package leetecodeInteger;
//
//public class GoalParserInterpretation {
//	public static void main(String[] args) {
//		String str="G()()(al)";
//		System.out.println(interpret(str));;
//	}
//	public static String interpret(String command) {
//		StringBuffer bf=new StringBuffer();
//		for(int i=1;i<command.length();i++)
//		{
//			if(command.charAt(i)=='G') {
//				bf.append("G");
//			}
//			if((command.charAt(i)==')')&(command.charAt(i-1)=='l') ) {
//				bf.append("al");
//			}
//			else if(command.charAt(i)==')') {
//				bf.append("o");
//			}			
//		}
//		return bf.toString();
//    }
//}
public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str = "G()()(al)";
        System.out.println(interpret(str));
    }

    public static String interpret(String command) {
        StringBuilder bf = new StringBuilder();
        for (int i =1 ; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                bf.append("G");
            } else if (command.charAt(i) == ')' && i > 0 && command.charAt(i - 1) == '(') {
                bf.append("o");
            } else if (command.charAt(i) == ')' && i > 1 && command.charAt(i - 1) == 'l' && command.charAt(i - 2) == 'a') {
                bf.append("al");
            }
        }
        return bf.toString();
    }
}
