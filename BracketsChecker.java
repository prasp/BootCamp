import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;



public class BracketsChecker{
	
	public static void main(String[] args) throws IOException {
		
		//Read the file 
		FileReader F1 = new FileReader("Code.txt");
		BufferedReader BF = new BufferedReader(F1);
		String ReadLine="";
		
		
		String getbrackets = "";
		while ((ReadLine = BF.readLine()) != null) {
		
			String  st= ReadLine.replaceAll("[A-Z]|[a-z]|[0-9]*", "");
			getbrackets = getbrackets + st;
				
			}
			
		String removewhitespaces = getbrackets.replaceAll("\\s","");
		System.out.println(removewhitespaces);
		
		boolean checkcode = BracketsChecker.checkCode(removewhitespaces);
		
		if(checkcode == true){
			System.out.println("Code is valid");
		}else{
			System.out.println("Code is Invalid");
		}
		
		

		BF.close();
		
		
	}
	
	public static boolean checkCode(String code){
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('{', '}');
		map.put('[', ']');
		map.put('(', ')');
		
		Stack<Character> characterstack = new Stack<Character>();
		
		char[] charArray = code.toCharArray();
		for(Character c :charArray){
			if(map.keySet().contains(c)){
				characterstack.push(c);
			}else{
				if(map.values().contains(c)){
					if(!characterstack.isEmpty() && map.get(characterstack.peek()) == c){
						characterstack.pop();
					}
					else
						return false;
				
				}
		}
			
		}
		return characterstack.isEmpty();
	}
	
	
	
}