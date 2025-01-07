import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter toatal Amount -: ");
        int amount = sc.nextInt();
        System.out.print("Which note do you have Enter in number -: ");
       int note =sc.nextInt();
       //Creating a container variable who store calculate number of note
       int total = 0;
       boolean validNote = true;
        if(note ==10){
            total = amount/10;
        }else if(note ==20){
            total = amount/20;
        }else if(note == 50){
            total = amount/50;
        }else if(note == 100){
            total = amount/100;
        }else if(note==500){
            total = amount/500;
        }else{
            System.out.println("Invalid Input that type of note doesn't exist");
            validNote =false;
        }
        if(validNote ){
        System.out.println("The total number of note is -: "+total);
        }
    }
}
