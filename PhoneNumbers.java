import java.util.*;
import java.util.regex.Matcher;
class PhoneNumbers
{
   public static void main(String[] args)
   {
       String[] names = new String[30];
       names[0] = "Gina";    names[1] = "Marcia";
       names[2] = "Rita";    names[3] = "Jennifer";
       names[4] = "Fred";    names[5] = "Neil";
       names[6] = "Judy";    names[7] = "Arlene";
       names[8] = "LaWanda";
       names[9] = "Deepak";

       String numbers[] = new String[30];
       numbers[0] = "(847) 341-0912";
       numbers[1] = "(847) 341-2392";
       numbers[2] = "(847) 354-0654";
       numbers[3] = "(414) 234-0912";
       numbers[4] = "(414) 435-6567";
       numbers[5] = "(608) 123-0904";
       numbers[6] = "(608) 435-0434";
       numbers[7] = "(608) 123-0312";
       numbers[8] = "(920) 787-9813";
       numbers[9] = "(930) 412-0991";

       String entryName;
       String entryPhone;
       String regex = "^(\\d{3}\\)\\d{3}-\\d{4}";

       int x;
	   int highest = 10;

       boolean isFound = false;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter name to look up. Type 'quit' to quit.");
       entryName = input.next();

       while (highest < 30 && !entryName.equalsIgnoreCase("quit"))
       {
          for(x = 0; x < highest; ++ x)
             if(entryName.equalsIgnoreCase(names[x]))
             {
                isFound = true;
                System.out.println(names[x] + "'s phone number is " + numbers[x]);
                x = highest;
             }
          if(!isFound)
          {
              System.out.println("Enter phone number for " + entryName);
              input.nextLine();
              entryPhone = input.nextLine();
             names[highest] = entryName;
             numbers[highest] = entryPhone;
             ++highest;
          }
		else
        {
            System.out.println("Enter name to look up. Type 'quit' to quit.");
            entryName = input.next();
          isFound = false;
		}
      }
   }
}