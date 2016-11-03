
public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "asd zx qwe";
		char ch = 'h';
		int pos = 3;
		String[] arrayStr = str.split(" ");
		for (int i = 0; i < arrayStr.length; i++) {
			char[] charArray = arrayStr[i].toCharArray();
			if(charArray.length < pos){
				System.out.println(charArray);
				continue;
			}
			charArray[pos - 1] = ch;
			String newStr = new String(charArray);
			System.out.println(newStr);
		} 
	}

}
