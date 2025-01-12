/*
ABCDE
 ABCD
  ABC
   AB
    A
    */
    import java.util.Scanner;

    public class Q55 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of row -: ");
            int row = sc.nextInt();
            for(int i = row ; i >0 ; i--){
                char ch = 65;
                for(int j = 0 ; j<row-i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <=i ; k++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
    