//In insertion sort we directly choose the smallest element from the array and place it to the
//first postion of the array. similarly will do the same by creating a max element for comparing.
public class Selection_Sort {
    public static void selection_sort(int[] A){
        //this for loop is for to check the no of turns
        for(int i=0;i<A.length-1;i++){
            int min_pos=i;
            //this for loop for comparing the element
            for(int j=i+1;j<A.length;j++){
                if(A[min_pos]>A[j]){
                    min_pos=j;
                }
            }
            //here we will swap
            int temp=A[min_pos];
            A[min_pos]=A[i];
            A[i]=temp;
        }
    }
    public static void PrintArr(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] Args){
        int A[]={1,8,12,7,3};
        selection_sort(A);
        PrintArr(A);
    }
}

