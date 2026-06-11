public class Exercise6{
    public static void main(String[] args) {
        //Q1
        /* float [] marks = {23.3f, 34.3f, 45.4f, 67.5f, 89.6f};
         float sum = 0;
         for(float element:marks){
            sum =sum + element;
            System.out.println(sum);
         }
        */
      //Q2
      /*int [] arr = {23,34,56,54,32,51};
      int num =45;
      boolean isInArray = false;
      for(int element:arr){
        if(num==element){
          isInArray =true;
          break;
        }
      }
      if(isInArray){
        System.out.println("the value is present in the array");
      }
      else{
                System.out.println("the value is  not present in the array");
      }
      */
     //Q3
     /*float [] marks = {23.3f, 34.3f, 45.4f, 67.5f, 89.6f};
         float sum = 0;
         for(float element:marks){
            sum =sum + element;
            
         }
             System.out.println("the value of average marks is" + sum/marks.length);
     */
    
       //Q4
      /* int[][] mat1 = {{2, 3, 4},
                   {5, 6, 7}};
       int mat2[][] ={{8, 9, 1},
                 {12, 11, 10}};
        int [][] result ={{0, 0, 0},
                          {0, 0, 0}};
        for(int i=0;i<mat1.length;i++){
          for (int j=0;j<mat1[i].length;j++){
               System.out.format("Setting value for i=%d and j=%d\n",i,j);
               result[i][j] = mat1[i][j] + mat2[i][j];
          }
        }
        for(int i=0;i<mat1.length;i++){
          for (int j=0;j<mat1[i].length;j++){
               System.out.print(result[i][j] + " ");
               result[i][j] = mat1[i][j] + mat2[i][j];
          }
          System.out.println("");
        }
      */
      // Q5
     /* int [] arr ={1, 2, 3, 4, 5, 6};
      int l =arr.length;
      int n = Math.floorDiv(l,2);
      int temp;
      for(int i=0; i<n; i++){
           //swap a[i] and a[l-1-i]
          temp =arr[i];
          arr[i] = arr[l-1-i];
          arr[l-1-i] = temp;
      } 
      for(int element: arr){
        System.out.println(element);
      }
      */
     //Q6
    /* int[] arr={23,34,56,54,32,51};
     int max = arr[0] ;
     for(int i=1;i<arr.length;i++){
      if (arr[i]>max){
        max= arr[i];
      }
     } 
     System.out.println("the maximum element in the aeeay is:" + max);
     */
     //Q7
     /*int[] arr={23,34,56,54,32,51};
     int min = arr[0] ;
     for(int i=1;i<arr.length;i++){
      if (arr[i]<min){
        min= arr[i];
      }
     } 
     System.out.println("the minimum element in the aeeay is:" + min);
     */
      //Q8
         boolean isSorted = true;
         int [] arr={23,34,56,54,32,51};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
              isSorted = false;
              break;
            }
         }
         if(isSorted){
          System.out.println("the array is sorted");
         }
         else{
          System.out.println("the array is not sorted");
         }
    }
}