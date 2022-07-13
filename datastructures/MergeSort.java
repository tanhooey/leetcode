public class MergeSort {
    public static void main(String[] args)
    {
        System.out.println("");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copyOfnums1 = nums1.clone();
        int second = 0;
        int first = 0;
        int i = 0;
        if(n != 0) 
        {
            while(first !=  m && second != n) 
            {
                if (copyOfnums1[first] > nums2[second])
                {
                    nums1[i] = nums2[second];
                    second++;
                }
                else 
                {
                    nums1[i] = copyOfnums1[first];
                    first++;
                }
                i++;
            }
            if (second != n) 
            {
                for (int j = i; j < n + m; j++)
                {
                    nums1[j] = nums2[second];
                    second++;
                }   
            }
            if (first != m) 
            {
                for (int j = i; j < n + m; j++)
                {
                    nums1[j] = copyOfnums1[first];
                    first++;
                }
            }
        }
        
    }
    
}
