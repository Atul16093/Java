/*
 111111
  22222
   3333
    444
     55
      6
 */
    import java.util.Scanner;

    public class Q56 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of row -: ");
            int row = sc.nextInt();
            int var = 1;
            for(int i = row ; i >0 ; i--){
                for(int j = 0 ; j<row-i ; j++){
                    System.out.print(" ");
                }
                for(int k = 1 ; k <=i ; k++){
                   System.out.print(var);
                }
                var++;
                System.out.println();
            }
        }
    }
    