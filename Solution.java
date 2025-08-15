class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0,k=0;
        double med;
        int l1=nums1.length,l2=nums2.length;
        int[] r=new int[l1+l2];
        while(i<l1 && j<l2)
        {
            if(nums1[i]<=nums2[j])
            {
                r[k]=nums1[i];
                i++;
            }
            else{
                r[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<l1)
        {
            r[k]=nums1[i];
            i++;
            k++;
        }
        while(j<l2)
        {
            r[k]=nums2[j];
            j++; 
            k++;
        }
        int a=r.length;
        if (a % 2 != 0)
        {
            med = r[(a - 1) / 2];
        }
        else
        {
            med = (r[(a - 1) / 2] + r[a / 2]) / 2.0;
        }

        return med;    
    }
}
