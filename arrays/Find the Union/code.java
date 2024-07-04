class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        Set<Integer> map = new TreeSet<>();
        for(int i=0;i<n;i++){
            map.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            map.add(arr2[i]);
        }
        
        ArrayList<Integer> arr=new ArrayList<>(map);
        return arr;
    }
}
