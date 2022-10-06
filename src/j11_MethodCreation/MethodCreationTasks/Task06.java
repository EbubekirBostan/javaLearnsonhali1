package j11_MethodCreation.MethodCreationTasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir Kenar Uzunluğu Seçiniz");
		int kenarA=scan.nextInt();
		System.out.println("Ikinci Bir Kenar Uzunluğu Seçiniz");
		int kenarB=scan.nextInt();
		System.out.println("ParalelKenar, Dikdörtgen, Ücgen Seçiniz");
		String secim= String.valueOf(scan.next().toUpperCase().charAt(0));

		switch (secim){
			case "P":
				System.out.println("Yüksekliği Giriniz");
				int h=scan.nextInt();
				System.out.println("Paralelkenar Alanı: "+ palan(kenarA,h));
				System.out.println("Paralelkenar Çevresi: "+pcevre(kenarA, kenarB));
				break;
			case "D":
				System.out.println("Dikdörtgen Alanı: "+dikdortgenal(kenarA, kenarB));
				System.out.println("Dikdortcevresi = " + dikdortcevre(kenarA, kenarB));
				break;
			case"Ü":
				System.out.println("Yüksekliği Giriniz");
				int yuk=scan.nextInt();
				System.out.println("Taban uzunluğunu Giriniz");
				int kenarC=scan.nextInt();
				System.out.println("Ücgenin alani = " + ucgalan(kenarC, yuk));
				System.out.println("Ücgenin cevresi = " + ucgcevre(kenarA, kenarB, kenarC));
				break;
			default:
				System.out.println("Yanlış karakter Girdiniz");
		}
	}

	private static int ucgcevre(int kenarA, int kenarB, int kenarC) {
		int ucgncevre=kenarA+kenarB+kenarC;
		return ucgncevre;
	}

	private static int ucgalan(int kenarA, int yuk) {
		int ucgenAlan=(kenarA*yuk)/2;
		return ucgenAlan;
	}

	private static int dikdortcevre(int kenarA, int kenarB) {
		int dikdortcev=(2*kenarA)+(2*kenarB);
		return dikdortcev;
	}

	private static int dikdortgenal(int kenarA, int kenarB) {
		int dAlan=kenarA*kenarB;
		return dAlan;
	}

	private static int pcevre(int kenarA, int kenarB) {
		int pcevresi=(2*kenarA)+(2*kenarB);
		return pcevresi;
	}

	private static int palan(int kenarA, int h) {
		int planhes=(kenarA*h)/2;
		return planhes;
	}

}
