import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
      String age = scanner.nextLine();
      switch(age){
          case "null" :
              System.out.println("Ты родился");
              break;
          case "seven" :
              System.out.println("Ты пошел в школу");
              break;
          case "vosemnadcat" :
              System.out.println("Ты закончил школу");
              break;

      }
    }
}
