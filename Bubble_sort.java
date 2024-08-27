import java.sql.SQLOutput;

public class Bubble_sort {
    public static void bubble_sort(int A[]){
        //this is showing number of turns taken to swap all element
        for(int i=0;i<A.length-1;i++){
            //this for loop will swap the element
            for(int j=0;j<A.length-1;j++){
                if(A[j]>A[j+1]) {//to check weather current element is greater than next element or not
                    //swaping element
                    int temp = A[j];
                    A[j]=A[j + 1];
                    A[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int A[]){

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int A[]={8,4,2,6,1};
        System.out.println("Before sorting");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        bubble_sort(A);
        System.out.println("After sorting");
        printArr(A);
    }
}
