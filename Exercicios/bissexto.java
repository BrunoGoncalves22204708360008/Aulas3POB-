import java.util.Scanner;

public class bissexto
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = entrada.nextInt;
        if(ano%4 == 0 || (ano%100 == 0 && ano%400 == 0))
        {
            System.out.print("Ano Bissexto! ");
        }
        System.out.print("NAO bissexto!");
        entrada.close();
        
    }
}