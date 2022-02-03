import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiploEspecial {
	public static void main(String[] args) {
	
		int value = 7;
		System.out.println(getSpecialMultiply(value));
	}
	public static int getSpecialMultiply(int value) {
		int multiplySpecial = 0;
		String regex = "^([90]+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("");
		int i = 0;
		while (!matcher.find()) {
			i++;
			multiplySpecial = i*9;
			if (multiplySpecial % value == 0) {
				matcher = pattern.matcher(String.valueOf(multiplySpecial));			
			}			 
		}
		return multiplySpecial;
		
	}
	
}
