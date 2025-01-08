/*
    1
   212
  32123
 4321234
543212345
*/
public class Q78{
    public static void main(String[] args){
        int row = 5;
        int half = row/2;
        int a = 1;
        for(int i = 1 ; i <=row ; i++){
        int num = i;
        int num1 = i;
            for(int j = 1 ; j <=(row+1)-i ; j++){
                System.out.print(" ");
            }
        for(int k = 0 ; k <a ; k++){
            if(k==(a/2)||k<(a/2)){
                System.out.print(num);
                num--;
            }else {
                System.out.print(num1);
                num1++;
            }
        }
        a = a+2;
        System.out.println();
        }
    }
}