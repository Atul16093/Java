import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2,4,8,6,4 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("Enter nth for the largest number   -: ");
        int largest = sc.nextInt();
        int original_lar = largest;
        System.out.println("Enter nth for the smallest number ");
        int smallest = sc.nextInt();
        int original_small = smallest;
        largest -=1;
        smallest -=1;
        System.out.println("The "+original_lar+"th largest number is "+arr[arr.length-1-largest]);
        System.out.println("The "+original_small+"th largest number is "+arr[smallest]);

    }
}
