package array;

public class ValidAnagram {
	
	public boolean isAnagram(String s, String t) {
		if(s == null || t == null) {
			return true;
		}
		
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] arr = new int[26];
		
		for(int i = 0 ; i < s.length(); i++) {
			arr[s.charAt(i) - 'a']++;
			arr[t.charAt(i) - 'a']--;
		}
		
		for(Integer i : arr) {
			if(i != 0) {
				return false;
			}
		}
    
		return true;
	}

}
