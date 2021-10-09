package sep21;

public class Panagram {
	
	public static void main(String args[]) {
		
		String n="Pack my box with five dozen liquor jugs";
		String m=n.toLowerCase();                                    // converting every character to lowercase
		int len=m.length();
		System.out.println(len);
		char[] arr=new char[len];
		for(int i=0;i<len;i++) {
			arr[i]=m.charAt(i);
		}
		char k='a';
		int j=0;
		boolean bool=false;
		int fl=1;
		for(k='a';k<='z';k++){
			for(j=0;j<arr.length;j++) {
				if(arr[j]==k) {
					bool=true;
					break;
					
				}
				else {
					bool=bool && false;
				}
				
				
				
			}
			if(bool==false) {
				System.out.println("Not a palindrome");
				fl=0;
				break;
			}
			
			
				
		}
		if(fl==1) {
			System.out.println("Palindrome");
		}
		
		
	}

}
