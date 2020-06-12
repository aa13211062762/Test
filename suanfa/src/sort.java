import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int [] arr={10,9,1,2,6,4,5};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int []arr,int left,int right){
        int l=left;
        int r=right;
        int pre=arr[left];
        int temp=0;

        while(l<r){
            while(arr[l]<pre){
                l++;
            }

            while(arr[r]>pre){
                r--;
            }

            if(l==r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

        }

        if(l==r){
            r--;
            l++;
        }


        if(left<r){
            quickSort(arr, 0, r);
        }

        if(right>l){
            quickSort(arr, l, right);
        }
    }


}
