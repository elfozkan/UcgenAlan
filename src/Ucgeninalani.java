import java.util.Scanner;

public class Ucgeninalani {
    public static void main(String[] args) {
        int a,b,c, u,Alan;
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen üçgenin birinci kenarını giriniz: ");
        a = klavye.nextInt();
        System.out.print("Lütfen üçgenin ikinci kenarını giriniz: ");
        b = klavye.nextInt();
        System.out.print("Lütfen üçgenin ücüncü kenarını giriniz: ");
        c = klavye.nextInt();

        u= (a+b+c)/2;
        Alan = (u*(u-a)*(u-b)*(u-c))^(1/2);

        System.out.println("u: "+u);
        System.out.println("Ucgenin alani: "+Alan);






    }
}
