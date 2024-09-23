package Heaps_Codes;
//array wala haap
// Descending order se kara hai mtlb minHeap wala logic use krna h 

public class heapSort2 {
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;

        if(left< size && arr[minIdx]>arr[left]){
            minIdx=left;
        }

        if(right<size && arr[minIdx]>arr[right]){
            minIdx=right;
        }

        if(minIdx != i){
            //swap
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

            heapify(arr, minIdx, size);
        }
    }

    public static void heap_Sort(int arr[]){
        //Build minHeap
        int n=arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr,i,n);
        }

        //Push smallest at end
        for(int i=n-1; i>0; i--){
            //swap  -- smallest aur first ka swap and smallest then heap se bahar means arr ka size kam krna
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,3};

        heap_Sort(arr);

        //print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
