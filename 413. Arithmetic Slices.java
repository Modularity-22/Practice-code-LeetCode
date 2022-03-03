	class Solution {
		public int numberOfArithmeticSlices(int[] A) {
			if(A == null || A.length < 3) return 0;
			int res = 0;
			int slow = 0, fast = 1;
			int diff = A[fast] - A[slow];
			fast++; // fast = 2 now.
			for(; fast < A.length; fast++){
				if(A[fast] - A[fast - 1] == diff){
					if(fast - slow + 1 >= 3){
						res += fast - 2 - slow + 1;
					}
					continue;
				}else{   // diff changes
					slow = fast - 1;
					diff = A[fast] - A[fast - 1];
				}
			}
			return res;
		}
	}