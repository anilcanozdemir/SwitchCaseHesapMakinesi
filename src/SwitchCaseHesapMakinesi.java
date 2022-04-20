import java.util.Scanner;

/**
 * @author ANIL CAN ÖZDEMİR
 * Ödev
 * Videodaki hesap makinesini switch-case kullanarak yapınız.
 */


public class SwitchCaseHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input =new Scanner(System.in);
        System.out.println("Islem yapilacak iki sayiyi sirasiyla giriniz:");
        n1=input.nextInt();
        n2=input.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.println("Seciminiz:");
        select=input.nextInt();
        switch (select)
        {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if(n2==0)
                {
                    System.out.println("bir sayi sifira bölünemez");
                    break;
                }
                System.out.println(n1/n2);
                break;
        }
    }


}
