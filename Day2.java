class Solution {
  public boolean isSubsequence(String s1, String s2) {
        if(s1.isEmpty()) {
            return true;
        }
        if (s1.length() > s2.length()) {
			return false;
		}
		int j = 0;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.charAt(j) == s2.charAt(i)) {
				j++;
			}
			if (j == s1.length()) {
				return true;
			}
		}
		return false;
	}
}
