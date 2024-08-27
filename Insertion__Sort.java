public class Insertion__Sort {
    public static void insertion_sort(int A[]){
        //for comparing the element
        for(int i=1;i<A.length;i++){
            int temp=A[i];
            int j=i-1;
            //this for loop is for insertion of element into right place in ascending order
            while(j>=0 && A[j]>temp){
                A[j+1]=A[j];
                j--;
            }
            //insertion of element.
            A[j+1]=temp;
        }
    }
    public static void printArr(int A[]){
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int A[]={10,1,44,23,4};
        insertion_sort(A);
        printArr(A);
    }
}
