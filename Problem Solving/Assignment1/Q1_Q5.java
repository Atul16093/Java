public class Q1_Q5 {
	public static void main(String[] args) {
		/*int perimeter = 230;
		int l = 70;
		// breadth of the parameter
		int b = perimeter / 2 - l;
		System.out.println("The breadth of  the rectangle is  " + b);
      */
      /*
		// Queston no 2
		int Area = 96;
		int b = 8;
		int length = Area / b;
		int perimeter = 2 * (length + b);
		System.out.println("The Length and the perimeter of the rectangle is " + length + " & " + perimeter);
         */
	  /*
		// Question no 3

		int tilesL = 13;
		int tilesB = 7;
		int rectangulerL = 520;
		int rectangulerB = 140;
		int Area_Of_Region = rectangulerL * rectangulerB;
		int Area_Of_Tiles = tilesL * tilesB;
		int tiles_Needed = Area_Of_Region / Area_Of_Tiles;
		System.out.println("We needed the tiles is -: " + tiles_Needed);
		*/
		// Question no 4 Find the cost of tilling
		int p_length = 300;
		int p_with = 150;
		int Total_Area = p_length * p_with;
		System.out.println("The square meter is -: " + Total_Area);
		int Cost_Of_Tilling = Total_Area / 100;
		int Final_Cost = Cost_Of_Tilling * 6;
		System.out.println("The final cost of the tilling is -:" + Final_Cost + " dollar");
        //Question no 5 Find the breadth , perimeter and area of the park
	  double length = 20;
	  double area  = 1600/25;
	  double breadth = area/length;
	  double parameter = 2*(length+breadth);
	  System.out.println("The parameter , breadth and the area of the park is -:"+parameter +" "+breadth+" "+area);

	}
}