package Array_String;

public class single {
    public static int find(int arr[])
    {
        //Write code here
        int array_sum=0;
        for(int i=0;i<arr.length;i++){
            array_sum+=arr[i];
        }
        int digit_sum=0,r;
        while(array_sum>0){
            r=array_sum%10;
            array_sum/=10;
            digit_sum+=r;
        }
        return digit_sum;
    }
    public static void main(String[] args) {
        int [] arr={1,7,8,5,9};
        System.out.println(find(arr));
    }
}
