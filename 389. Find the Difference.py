class Solution:
    def findTheDifference(self, A: str, B: str) -> str:
        res = 0
        for i in range(0,len(A)) :
            res =res ^ (ord)(A[i])
        for i in range(0,len(B)) :
            res = res ^ (ord)(B[i])
        return ((chr)(res));
        