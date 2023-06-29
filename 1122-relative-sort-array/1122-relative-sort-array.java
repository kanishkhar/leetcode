class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         int p=0; 
        for(int i:arr1)
        p=(i>p)?i:p;   
        int arr3[]= new int[p+1], ans[]= new int[arr1.length+arr2.length];
        for(int i:arr1)
        arr3[i]++;

        int count=0;
        for(int i=0;i<arr2.length;i++){
            while(arr3[arr2[i]]>0){
                ans[count++]=arr2[i];
                arr3[arr2[i]]--;
            }
        }
        for(int i=0;i<arr3.length;i++){
            while(arr3[i]>0){
                ans[count++]=i;
                arr3[i]--;
            }
        }

        return Arrays.copyOfRange(ans, 0, count);
    }
}