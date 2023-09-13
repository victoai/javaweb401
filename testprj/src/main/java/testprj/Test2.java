package testprj;

import java.util.Arrays;

public  class Test2 {
	
	
	//m= 3  2 , n = 3  2   
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	                                           //  0 1 2
        int i = m-1;                               // {1,2,3,3,5,6}     i 
        int j = n-1;                                //{2,5,6}           j
        
        
     
    	   for(int k = m + n - 1; k >= 0; k--){      // 5 4 3 2 1 0       i=2  , j=2    		   
    		   
    		   if( i>=0  && j>= 0) {
	               if(nums2[j]>nums1[i]  ||  nums2[j]==nums1[i]){    // 
	                   nums1[k] = nums2[j];	                   
	                       j--;
	                    
	               }
	               else if(nums1[i]>=nums2[j]){
	   	            nums1[k] = nums1[i];	   	           
	   	                i--;
	   	                
	   	             
	   	         }
	               
	             
           
    	   }else {    		   
    		   if( i<0 ) {
    			    nums1[k] = nums2[j];
    			    j--;
    		   }else {
    			   nums1[k] = nums1[i];
   			       i--;
    		   }
    		   
    		   
    	   }
    	} 
    	   
           
           System.out.println(  Arrays.toString(nums1));
           System.out.println(  Arrays.toString(nums2));
        
      
    }
    
    
    public static void main(String[] args) {
    	Test2 t = new Test2();
    	 int[] nums1 = {1,2,3,0,0,0}   ;
    	 int m=3  ;
    	 int[] nums2 ={2,5,6} ;
    	 int n=3 ;
    	 t.merge(nums1, m, nums2, n);
	}
}