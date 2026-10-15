package PetaNedelja;


public class slovakojanamseponavljaju {
	
	
	public static void main(String[] args) {
		
		String test = "oooo";
		
		for(int i = 0; i< test.length() - 1 ; i++) {
			char c = test.charAt(i);
			char b = test.charAt(i + 1);
			if(c==b) {
				System.out.println("slova koje se ponavlaju su :" + c );
			}
			
		}
	}
        
}
