package ornek;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		int sayi =12;
		String mesaj="elma değerleri: ";
		System.out.println(mesaj +sayi);
		
		int sayi2=15;
		if (sayi2%2==0) {
			System.out.println(sayi2+"çifttir.");
		}
		else {
			System.out.println(sayi2+" sayisi tektir.");
		}
		
		int number1,number2,number3,enbuyuk;
		number1=15;
		number2=12345;
		number3=134;
		enbuyuk=number1;
		
		if(enbuyuk<number2) {
			enbuyuk=number2;
		}
		else if(enbuyuk<number3) {
			enbuyuk=number3;
		}
		else {
			enbuyuk=number1;
		}
		
		System.out.println("en buyuk sayi:"+ enbuyuk);
		
	char grade='s';
	switch(grade) {
		case 'A':
			System.out.println("Tebrikler geçtiniz");
			break;
		case 'B':
			System.out.println("güzel aferin");
			break;
		default:
			System.out.println("Allahın cezası geçerli not girsene ");
			break;
	}
		
	for(int i=1;i<=10;i+=2) {
		System.out.println(i);
	}
	System.out.println("For Döngüsü bitti");
		
	int i=1;
	while(i<=10) {
		System.out.println(i);
		i++;
	}
	System.out.println("While Döngüsü bitti");	
	
	do{
		System.out.println(i);
		i++;
	}while(i<10);
    
	System.out.println("do-while döngüsü bitti");
		
		
	}

}
