package test_29_june;

public class TestJune {

    //write a code to check any number between 7 to 190 is divisible by 7 and it should not be odd number
  public void divby7(){
      System.out.println("printing number between 7 to 190 is divisible by 7 and it should not be odd number:");
      for (int i=7;i<=190;i++)
          if (i%7==0&&i%2==0)
          System.out.println(+i);
          }
   //write a code to print square of number between 1 to 10
    //like  1 , 4, 9, 16 ,25 ....100
   public void square(){
       System.out.println("printing square of number between 1 to 10:");
      for (int i=1; i<=10;i++)
          System.out.println(i*i);
   }
   //write a code to check any number number between 3 to 160 is divisible by 9 and it should not be odd number
    public void divby9(){
        System.out.println("printing number between 3 to 160 is divisible by 9 and it should not be odd number :");
        for (int i=3; i<=160; i++)
        if (i%9==0&&i%2==0)
            System.out.println(i);
    }
    //write a code to print cube of number starting from 1 to 10
    //like 1, 8 , 27, 64 ....1000
    public void cube(){
        System.out.println("printing cube of number between 1 to 10 :");
        for (int i=1;i<=10;i++)
            System.out.println(i*i*i);
    }
    //write a code to check any number number between 8 to 160 is divisible by 11 and it should not be odd number
    public void divby11(){
        System.out.println("printing number between 8 to 160 is divisible by 11 and it should not be odd number ");
      for (int i=8;i<=160;i++)
          if (i%11==0&&i%2==0)
          System.out.println(i);
    }
    //write a code to check prime number between 1 to 10
    public void primecheaker(){
        System.out.println("Prime numbers between 1 and 10 are:");

    }
    //write a code to check any number number between 180 to 1 is divisible by 11 and it should not be odd number
    public void divideby11(){
        System.out.println("printing number between 180 to 1 is divisible by 11 and it should not be odd number ");
        for (int i=180;i>=1;i--)
            if (i%11==0&&i%2==0)
                System.out.println(i);
    }
    //write a code to check prime number between 10to20
    public void primechecker2(){
        System.out.println("Prime numbers between 1 and 20 are:");
    }


    public static void main(String[] args) {

        TestJune obj=new TestJune();
        obj.divby7 ();
        obj.square();
        obj.divby9();
        obj.cube();
        obj.divby11();
        obj.primecheaker();
        obj.divideby11();
        obj.primechecker2();
    }
  }


