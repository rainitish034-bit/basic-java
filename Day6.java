public class Day6{
    public static void main(String[] args) {
        int [][] flats;
        flats = new int [3][4];
        flats[0][0] =120 ;
        flats[0][1] =121;
        flats[0][2] =122;
        flats[0][3] =123;
        flats[1][0] =124;
        flats[1][1] =125;
        flats[1][2] =126;
        flats[1][3] =127;
           //Displaying the 2-D Array (for loop)
          System.out.println("printing  a 2-d array using for loops");
         for(int i=0;i<flats.length;i++){
          for(int j=0;j<flats[i].length;j++){
             System.out.print(flats[i][j]);
               System.out.print(" ");
            }
         System.out.println("");
         }
    }
}