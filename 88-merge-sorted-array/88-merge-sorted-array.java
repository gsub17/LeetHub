class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - n;
        int i = 0;
        while(index < nums1.length){
            nums1[index] = nums2[i];
            index++;
            i++;
        }
        Arrays.sort(nums1);
    }
}