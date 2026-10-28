class Trial {
  public static void main(String[] args) {
    int temperature = 25;

    if (temperature >= 30) {
      System.out.println("It is too hot");
    } else if (temperature <= 20) {
      System.out.println("It is too cold");
    } else {
      System.out.println("The temperature is just right");
    }
  }
}

public class Practice {
  public static void main(String[] args) {
    // Use of operators with if statements
    int x, y;
    x = 10;
    y = 20;

    if (x < y) {
      System.out.println("x is less than y");
    }
    x = x * 2;
    if (x == y) {
      System.out.println("x is equal to y");
    }
    x = x * 2;
    if (x > y) {
      System.out.println("x is greater than y");
    }
    if (x == y) {
      System.out.println("you will not see this message");
    }
    // Using a long data type to store a large value
    int lightspeed;
    long days;
    long seconds;
    long distance;

    lightspeed = 186000;
    days = 1000;
    seconds = days * 24 * 60 * 60;
    distance = lightspeed * seconds;

    System.out.print("In " + days);
    System.out.print(" days light will travel about ");
    System.out.println(distance + " miles.");

    // Use of char
    char ch1, ch2;
    ch1 = 88; // code for X
    ch2 = 'Y';
    System.out.print("ch1 and ch2; ");
    System.out.println(ch1 + " " + ch2);
    ch1++; // increment ch1
    System.out.print("ch1 is now ");
    System.out.println(ch1);
  }
}