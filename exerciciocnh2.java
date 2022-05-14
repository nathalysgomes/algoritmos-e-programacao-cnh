import java.util.Scanner;

class exerciciocnh
{
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
    
		int numero1, numero2, numero3;
        // Declarado 3 variaveis para fazer a leitura de 3 if.
    
        System.out.print("Ola!! Para saber se voce pode solicitar sua carteira nacional de habilitacao, precisamos fazer algumas perguntas =)\nVoce foi aprovado no exame psicotecnico? Se sim digite 1, se nao, digite 2.");
        // System.out.print para exibir a mensagem "Ola!! Para saber se voce pode solicitar sua carteira nacional de habilitacao, precisamos fazer algumas perguntas =)\nVoce foi aprovado no exame psicotecnico? Se sim digite 1, se nao, digite 2." "/n" para fazer quebra de linha.
       
        numero1 = ler.nextInt();
         // ler.next.Int para ler o primeiro valor.
		if(numero1==1)
        {
            System.out.print("Ok. Proxima pergunta: Voce foi aprovado no exame de legislacao? Se sim, digite 1. Se nao, digite 2.");
            // Se o usuario digitar o numero 1, vai realizar a leitura e exibir a mensagem na tela do usuario "Ok. Proxima pergunta: Voce foi aprovado no exame de legislacao? Se sim, digite 1. Se nao, digite 2."
            numero2 = ler.nextInt();
            // ler.next.Int para ler o segundo valor
            if (numero2==1)
            {
                System.out.print("Ultima pergunta: Voce foi aprovado no exame de direçao? Se sim, digite 1, se nao digite 2.");
                // Se o usuario digitar o numero 1, vai realizar a leitura e exibir a mensagem na tela do usuario "Ultima pergunta: Voce foi aprovado no exame de direçao? Se sim, digite 1, se nao digite 2."
                numero3 = ler.nextInt();
                // ler.next.Int para ler o terceiro valor
                if (numero3==1) 
                {
                    System.out.print("Voce pode solicitar sua carteira nacional de habilitacao!");
                    // Se o usuario digitar o numero 1, vai realizar a leitura e exibir a mensagem na tela do usuario "Voce pode solicitar sua carteira nacional de habilitacao!"
                }
                else
                {
                    System.out.print("Voce nao pode solicitar sua carteira nacional de habilitacao");
                    // Se o usuario nao digitar 1 no primeiro if, vai exibir a mensagem "Voce nao pode solicitar sua carteira nacional de habilitacao"
                }
        
            }
            else
                {
                    System.out.print("Voce nao pode solicitar sua carteira nacional de habilitacao");
                    // Se o usuario nao digitar 1 no segundo if, vai exibir a mensagem "Voce nao pode solicitar sua carteira nacional de habilitacao"
                }
        } 
        else
        {
            System.out.print("Voce nao pode solicitar sua carteira nacional de habilitacao");
            // Se o usuario nao digitar 1 no terceiro if, vai exibir a mensagem "Voce nao pode solicitar sua carteira nacional de habilitacao"
        }
    }
}