
class Compute {
    
    public int largest(int arr[], int n)
    {
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    return(arr[n-1]);
    }
}