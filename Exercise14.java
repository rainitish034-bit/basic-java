import java.util.Calendar;
//import java.text.SimpleDateFormat; ps2
//import java.util.Date;ps2

      //import java.util.ArrayList;  ps1

      public class Exercise14{
      public static void main(String[] args) {
      //ps 1
       /*  ArrayList <String> st = new ArrayList();
      int [] student =new int[12];
      st.add("nitish");  
      st.add("shivam yadav");  
      st.add("shivam singh");  
      st.add("ritik gupta");  
      st.add("harsh");  
      st.add("karen");  
      st.add(" khishan");  
      st.add("adersh dubey");  
      st.add("vinay");  
      st.add("nityanand");  
      st.add("adersh");  
      for(Object o:st){
        System.out.println(o);
      }
      */
     //ps2
    /* Date d =new Date();
     SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
     System.out.println(sdf.format(d));
     */
    //ps3
      Calendar c = Calendar.getInstance();
      int hour = c.get(Calendar.HOUR_OF_DAY);
      int minute = c.get(Calendar.MINUTE);
      int second = c.get(Calendar.SECOND);
      System.out.printf("%02d:%02d:%02d\n" , hour,minute,second);
    }
}