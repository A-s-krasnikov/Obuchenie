import java.sql.SQLOutput;

public class Break_Continue {
     public static void main(String[] args) {
        for(int i = 0; i<=15; i++){
            if(i%2==0){
                continue; // только когла вводимое число четное
            }
            System.out.println("Это нечетное число"+i);
         }
     }
}
