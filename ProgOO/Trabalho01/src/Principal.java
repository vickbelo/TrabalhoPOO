import corejava.Console;
import java.util.ArrayList;

public class Principal 
	{	
		public static void main (String args[])
		{
			final int TAM = Console.readInt('\n' + "Informe o tamanho da lista: ");
			
			ArrayList <Cliente> listaDeClientes = new ArrayList <Cliente> (TAM);
			
			boolean continua = true;
			
			while(continua)
			{
				System.out.println('\n' + "O que voc� deseja fazer?");
				System.out.println('\n' + "1. Cadastrar um cliente.");
				System.out.println("2. Alterar um empregado.");
				System.out.println("3. Remover um empregado.");
				System.out.println("4. Listar rela��o de empregados.");
				System.out.println("5. Sair.");
				
				int operacao = Console.readInt('\n' + "Informe a op��o desejada: ");
				
				switch(operacao)
				{
					case 1:
				}
			}
		}
	}
