import java.util.Scanner;

class Stringbuff
{
	public static void main(String args[])
	{
		StringBuffer s = new StringBuffer("Assam");

		int p = s.length();
		System.out.println("Length = "+p);

		int q = s.capacity();
		System.out.println("Capacity = "+q);

		s.setLength(5);
      System.out.println("After setLength = " +s);

        s.append(" State");
        System.out.println("After append State = " + s);

         s.ensureCapacity(10);
         System.out.println("New Capacity = " + s.capacity());

         s.ensureCapacity(60);
         System.out.println("New Capacity = " + s.capacity());

         s.setCharAt(3, 'L');
         System.out.println("After Set, string = " +s);

          s.insert(6, " 123 ");
          System.out.println("After inserting 123 at 6 - " +s);

          s.reverse();
          System.out.println("reverse = "+s);

          String str = "This is java practical";
      String substr = "";


      substr = str.substring(7, 17);
      System.out.println("substring = " + substr);


      substr = str.substring(0, 7);
      System.out.println("substring = " + substr);



      String Str1 = new String("Welcome");
      char[] Str2 = new char[7];
       try
       {
         Str1.getChars(0, 5, Str2, 0);
         System.out.print("Copied Value = " );
         System.out.println(Str2 );
      }
      catch ( Exception ex)
      {
         System.out.println("Raised exception...");
      }




	}
}
