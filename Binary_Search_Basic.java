import java.util.*;
public class Binary_Search_Basic {
    public static int binary_search(int A[],int key){
        int start_ele=0;//starting element
        int end_ele=A.length-1;//end element

            while (start_ele <= end_ele) {

                int mid_ele = (start_ele + end_ele) / 2;
                //comparison
                if (A[mid_ele] == key) {
                    return mid_ele;//element found as mid element.
                }
                if (A[mid_ele] < key) {
                    start_ele = mid_ele + 1;//sifting the stating element 1 place right i.e next to mid element.
                }
                else{
                    end_ele = mid_ele - 1;//sifting the end element 1 place left i.e before to mid element.
                }
            }
        return -1;
    }
    public static void main(String[] args){
        int B[]={1,3,6,8,12,15,16,18,20};
        int key=16;
        System.out.println("index for the key is "+binary_search(B,key));
    }
}
