	class Solution {
		public boolean isSubsequence(String s, String t) {
			int sLen = s.length(), tLen = t.length();
			if(sLen > tLen) return false;
			else if(sLen == 0) return true;
			int index1 = 0, index2 = 0;
			while(index1 < sLen && index2 < tLen){
				if(s.charAt(index1) == t.charAt(index2)){
					index1++;
					index2++;
				}else{
					index2++;
				}
			}
			return index1 == sLen;
		}
	}