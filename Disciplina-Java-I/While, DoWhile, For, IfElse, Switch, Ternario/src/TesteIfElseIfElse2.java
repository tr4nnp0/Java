
public class TesteIfElseIfElse2 {

	public static void main(String[] args) {
		double salario = 4800;
		System.out.println("O salário base é de = " + salario);
		double impostodeRenda;
		if (salario>=4664.68)
			impostodeRenda = (salario*0.275 - 869.36);
		else if (salario>=3751.06) 
			impostodeRenda = (salario*0.225 - 636.13);
		else if (salario>=2826.66) 
			impostodeRenda = salario*0.15 - 354.80;
		else
			impostodeRenda = 0;
			System.out.println("Você está isento do imposto de renda");
		System.out.println("O valor a pagar de imposto de renda é = "+ impostodeRenda);
		double salario_liquido = (salario - impostodeRenda);
		System.out.println("O valor do seu salário líquido é = " +salario_liquido);
		System.out.println(salario_liquido >= 20000? "Salário de burguês" : "Salário de trabalhador");
	}
}
