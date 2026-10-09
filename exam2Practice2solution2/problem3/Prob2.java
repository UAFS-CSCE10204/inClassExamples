package problem3;

public class Prob2 {

	public static void main(String[] args) {
		
		String str = reverseWords("Hello World Again");
		System.out.println(str);
	}
	
	public static String reverseWords(String str) {
		String[] words;
		int index;
		int wordIndex=0;
		char ch;
		String newStr="";
		int count=0;
		
		
		for(index=0;index<str.length();index++) {	
			ch = str.charAt(index);
			if(ch==' ') {
				count++;
			}
		}
		words = new String[count+1];
		words[0]="";
		
		for(index=0;index<str.length();index++) {
			ch = str.charAt(index);
			if(ch==' ') {
				wordIndex++;
				words[wordIndex]="";
			}else {
				words[wordIndex] = words[wordIndex] + ch;
			}
		}
		
		for(index=words.length-1;index>=0;index--) {
			if(index!=words.length-1) {
				newStr = newStr + " ";
			}
			newStr = newStr + words[index];
		}
		return newStr;
		
	}

}
