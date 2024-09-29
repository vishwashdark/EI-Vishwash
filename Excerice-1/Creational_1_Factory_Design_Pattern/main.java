import java.util.Scanner;
public class main {
    public static void main(String a[]){
        System.out.println("enter your fruit name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        fruits f = new fruits();
        fruitbasket b = f.getInstance(str);
        b.spec();
        sc.close();
    }

}
