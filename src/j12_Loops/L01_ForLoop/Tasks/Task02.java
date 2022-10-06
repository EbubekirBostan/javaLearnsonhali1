package j12_Loops.L01_ForLoop.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Girilen ifadenin polindrome olmasını control eden method create ediniz
        polindrome= Her iki yönde okunduğunda eşit olan ifadeler
        ör:"Ey Edip Adana da Pide ye"
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir İfade Giriniz");
        String str=sc.nextLine();
        polindrome(str);





    }

    private static void polindrome(String str) {
        String tersStr="";//boş bir string kutu
        for(int i=str.length()-1 ; i>=0 ; i--){
            tersStr+=str.charAt(i);// str nin i.ci harfleri tersStrye concat eder
        }
        System.out.println("girilen ifadenin tersi :"+tersStr);
        if (str.equalsIgnoreCase(tersStr)){
            System.out.println("girilen ifade POLİNDROME ");
        }else System.out.println("girilen ifade polindrome değil");
    }
}
