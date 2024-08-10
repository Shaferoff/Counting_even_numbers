import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, count=0;
        for (int i = 0; i <= 10; i++) {
            x = (int)(90*Math.random()+10);
            System.out.println(x+"  ");
            if (x%2==0)
                count++;

        }
        System.out.println("Число чётных чисел в серии= "+count);

    }

}