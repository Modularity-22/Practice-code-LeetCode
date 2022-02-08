class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int first = 0, second = 0;
        int[] merge = new int[len1 + len2];
        int count = 0;
        while(first < len1 || second < len2){
            if(first < len1 && second < len2)
                merge[count++] = nums1[first] <= nums2[second] ? nums1[first++]: nums2[second++];
            else if(first < len1)
                merge[count++] = nums1[first++];
            else
                merge[count++] = nums2[second++];
        }
        return (len1 + len2) % 2 != 0 ?
            (double)merge[(len1 + len2) / 2] :
        ((double)merge[(len1 + len2) / 2] + (double)merge[(len1 + len2) / 2 - 1]) / 2;
    }
}