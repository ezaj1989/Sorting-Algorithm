import java.util.*;
public class Linear_search_basic {
    public static int  searching(int A[],int k){
        //ele=elements
        for(int i=0;i<A.length;i++){
            if(A[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element:");
        int key=sc.nextInt();
        int A[]={30,90,50,70,10};
        int index=searching(A,key);
        if(index==-1) {
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index "+index);
        }
    }
}
