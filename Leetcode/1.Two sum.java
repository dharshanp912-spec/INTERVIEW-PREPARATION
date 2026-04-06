class Solution{
    public int[] twoSum(int n[],int t){
        int arr[]=new int[2];
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]+n[j]==t){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}