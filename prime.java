class Main
{
   public static void main(String[] args)
   {
      int i, j, ch;
      
      System.out.println("Prime Numbers from 1 to 10::");
      for(i=2; i<=10; i++)
      {
         ch = 0;
         for(j=2; j<i-1; j++)
         {
            if(i%j==0)
            {
               ch++;
               break;
            }
         }
         if(ch==0)
            System.out.println(i);
      }
   }
}