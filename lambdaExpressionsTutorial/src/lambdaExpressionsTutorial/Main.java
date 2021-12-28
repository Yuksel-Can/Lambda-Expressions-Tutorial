package lambdaExpressionsTutorial;

public class Main {
	
	public static void main(String[] args) {
	
	Merhaba merhaba = () -> "Merhaba";
	
	System.out.println(merhaba.selam());
	
	/*************With Parameters*******************/
	Merhaba2 merhaba2 = (s) -> "Merhaba " + s ;		//��kt�s�n� temsil eder
	System.out.println(merhaba2.selam("Can"));	//buradada metod �a��r�l�r

	/*************With Parameters2*******************/
	Topla topla = (x,y) -> x + y ;
	System.out.println(topla.topla(10, 20));
	}
}
