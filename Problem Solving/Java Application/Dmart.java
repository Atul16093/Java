import java.util.Scanner;

public class Dmart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Grab Customber Name
        
        System.out.print("Enter your name -: ");
        String name = sc.nextLine();
        System.out.print("Enter your gender (Male/Female) -: ");
        String gender = sc.nextLine();
        // I'm asking date from the user cause i cann't use calendar API
        System.out.print("Enter Current Date -: ");
        String Date = sc.nextLine();
        System.out.println("Do you need Carry Bag -: YES or NO");
        String carry_bag  = sc.nextLine();
        System.out.print("Tell me the name of your product -: \n");

        String[] productName = new String[10];
        int quantity[] = new int[10];
        int price[] = new int[10];
        int Total[] = new int[10];
        float dis[] = new float[10];
        float Total_Amount =0.0f;
        float DP =0.0f;
        float GST = 0.0f;
        float final_Amount = 0.0f;
        float discountable = 0.0f;
        for (int i = 0; i <=1; i++) {
            productName[i] = sc.next();
            System.out.println("Enter product quantity -: ");
            quantity[i] = sc.nextInt();
            System.out.println("Enter product price -: ");
            price[i] = sc.nextInt();
            Total[i] = quantity[i] * price[i];
            // if first product quantity is greater then 4
            if (i == 0 && quantity[i] >= 3) {
                dis[i] = (Total[i] * 5) / 100.0f;
                System.out.println(dis);
            } else if (i == 4) {
                dis[i] = (Total[i] * 10) / 100.0f;
            } else if (i == 9) {
                dis[i] = (Total[i] * 15) / 100.0f;
            }

            Total_Amount +=Total[i];
          
             //total amount discount 
             if(Total_Amount>=10000){
               DP = (Total_Amount*15)/100.0f;
               discountable = Total_Amount-DP;
             }else{
                DP = (Total_Amount*10)/100.0f;
                discountable = Total_Amount-DP;
             }
             float carryBagCost = carry_bag.equalsIgnoreCase("Yes")?10.0f:0.0f;
             //GST 10%
              GST=(discountable*10)/100.0f;
             final_Amount = discountable+GST;
            sc.nextLine();
        }
        String gift = gender.equalsIgnoreCase("male")? "Leadger Ballet" : "Cadeberry";
        System.out.println("\t\t\t\t\t\tD-Mart\t\t\t\t");
        System.out.print("Name - " + name + "\t\t\t\t\t\t\t\t\t Date-:" + Date + "\n");
        System.out.print(
                "-----------------------------------------------------------------------------------------------\n");
        System.out.print("Item-Name\t\tQuantity\t\tPrice\t\tTotal-Price\t\tDiscount\n");
        for (int i = 0; i <= 9; i++) {
            System.out.println(productName[i] + "\t\t\t " + quantity[i] + " \t\t\t " + price[i] + "\t\t   " + Total[i]+ " \t\t\t" + dis[i]);
        }
        System.out.print(
                "-----------------------------------------------------------------------------------------------\n");
                System.out.println("\t\t\t\t\t\t\t\t  A.P\t\t\tD.P");
                for(int i=0;i<=1;i++){
                    System.out.println("\t\t\t\t\t\t\t\t"+Total_Amount+"\t\t\t"+discountable);
                }
                System.out.println("Your gift is -: "+ gift );
                if(carry_bag.equalsIgnoreCase("yes")){
                System.out.println("Carry Bag : yes " +"\t\t\t"+carry_bag);
                }else{
                    System.out.println("carry bag : no");
                }
                System.out.println("GST(10%)\t\t\t\t\t\t\t"+GST+"\t\t\t"+GST);
                System.out.print(  "-----------------------------------------------------------------------------------------------\n");
                System.out.println("Final amount you want to pay -: \t\t\t\t\t\t"+final_Amount);
                System.out.println("\t\t\t\t\t\tThanks \t\t\t\t");
                System.out.println("\t\t\t\t\t\tto -visit\t\t\t\t");
                System.out.println("\t\t\t\t\t\tD-Mart\t\t\t\t");
                System.out.print(  "-----------------------------------------------------------------------------------------------\n");
    }
}
