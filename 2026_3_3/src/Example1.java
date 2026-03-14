public class Example1 {
    public static void main(String[] args){
        int[] arr1 = {1,12,3,11,23,2,37,12,1,52,23,122};
        int temp;
        for (int i = 1; i < arr1.length; i++){
            for (int j = 0; j < arr1.length - i; j++){
                if (arr1[j] > arr1[j + 1]){
                    temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
