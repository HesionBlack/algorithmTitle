class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	    // 先将数组1复制一个。保留合并前的结果
		    int [] nums1_copy = new int[m];
		    System.arraycopy(nums1, 0, nums1_copy, 0, m);
	        //双指针法 因为数组有序，所以大的肯定在后面
	        //定义三个指针
	    	// 定义指向num1和num2尾部的指针
	        int p1=m-;
	        int p2=n-1;
	        // 定义一个记录储存位置的指针
	        int p = m+n-1;
	        //开始循环工作 循环结束条件 只要一个数组先被遍历结束
	        while((p1>=0)&&(p2>=0)){
	        	if(nums2[p2] > nums1_copy[p1]){
	        		nums1[p++]=nums2[p2++];
	        	}else{
	        		nums1[p++]=nums1_copy[p1++];
	        	}
	        }
    }
}