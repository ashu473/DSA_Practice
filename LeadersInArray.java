public class LeadersInArray {
    public static void leaders(int[] arr){
        int n=arr.length;
        System.out.print(arr[n-1]+" ");
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,10,6,5,2};
        int[] arr1={10,20,30};
        int[] arr2={30,20,10};
        int[] arr3={4};
        leaders(arr);
        System.out.println();
        leaders(arr1);
        System.out.println();
        leaders(arr2);
        System.out.println();
        leaders(arr3);
    }
}
