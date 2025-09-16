public class MergeSortArray {
    public static void mergeSortArray(int[] num1, int[] num2, int m, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0){
            if(i >= 0 && num1[i] > num2[j]){
                num1[k] = num1[i];
                k--;
                i--;
            } else{
                num1[k] = num2[j];
                k--;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] num1 = {2, 5, 7, 0, 0, 0};
        int[] num2 = {4, 8, 9};
        int m = 3;
        int n = 3;
        mergeSortArray(num1, num2, m, n);
        for(int i = 0; i<m+n; i++){
            System.out.println(num1[i]);
        }
    }
}