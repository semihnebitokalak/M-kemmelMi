import java.util.Scanner;

// Verilen sayının mükemmel sayı olup olmadığını ekrana yazdıran programı yazalım.
// Mükemmel sayı kendisi hariç bölenlerinin toplamı kendisine eşit olan sayılardır.
// Örneğin 6 = 1,2,3 bölenlerine sahip ve bunların toplamı da 6 dır.
// 0 sayısı mükemmel bir sayı olarak kabul edilmez. Mükemmel sayılar, pozitif tam sayılar içinde özel bir tanıma sahip olup,
// kendisi hariç pozitif bölenlerinin toplamı kendisine eşit olan sayılardır.
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //int sayi = 28;
        System.out.printf("Lütfen bir sayi giriniz > ");
        int sayi = input.nextInt();
        if (sayi == 0){
            System.out.println("0 istisna bir sayidir ve mükemmel sayi değildir.");
            System.exit(0);
        }
        int i;
        int sum = 0;
        for (i = 1; i < sayi; i++){
            if (sayi % i == 0)
                sum += i;
        }
        if (sayi == sum){
            System.out.println("Verilen sayi mukemmel sayidir.");
        }else{
            System.out.println("Verilen sayi mukemmel sayi değildir.");
        }
    }
}