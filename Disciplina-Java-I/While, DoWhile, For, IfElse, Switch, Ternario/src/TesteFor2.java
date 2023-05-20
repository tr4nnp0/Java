
public class TesteFor2 {

	public static void main(String[] args) {
		int x =12;
		if (x<=1||x>10)
			System.out.println("Número fora do intervalo permitido");
		else
			for (int num=1; num<=10;num++)
				System.out.println("A tabuada de "+x+" por "+num+" é "+(num*x));
	}

}
