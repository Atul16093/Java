/*
*  *  *  *  *  *  *  *  *  *  *  
*                             *
*  *  *  *  *  *  *  *  *  *  *
*                             *
*  *  *  *  *  *  *  *  *  *  *
*                             *
*  *  *  *  *  *  *  *  *  *  *
**
**
**
**
**
**
**
**
**
 */
public class FlagPattern{
    public static void main(String[]args){
        int row  = 15;
        int half = row/2;
        int f = half+3;
        for(int i = 0 ; i <=row;i++){
            if(i<7){
                for(int j = 0 ; j <=f ; j++){
                    if(i%2==0){
                        System.out.print("*  ");
                    }else if(j==0|| j==f){
                        System.out.print("*  ");
                    }else{
                        System.out.print("   ");
                    }
                }
            }else{
                System.out.print("**");
            }
            System.out.println();
        }
    }
}