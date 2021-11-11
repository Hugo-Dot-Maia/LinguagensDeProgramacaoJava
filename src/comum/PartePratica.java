package comum;
import java.util.Scanner;
import interfaceDemo.Quadrado;

public class PartePratica {

    public static boolean decideRepete(){
        Scanner sc = new Scanner(System.in);
        int decisao;
        System.out.print("Deseja ver um exemplo?: ");
        decisao = sc.nextInt();

        sc.close();
        return decisao == 1;
    }

    //Menu
    public static void decideExemplo(){
        Scanner sc = new Scanner(System.in);
        int decisao;

        System.out.print("Escolha o exemplo: ");
        decisao = sc.nextInt();

        switch (decisao) {
            case 1 -> {
                MetodoBolha bolha = new MetodoBolha();
                bolha.defineTamanhoArray();
                bolha.iniciaArray();
                bolha.ordena();
                bolha.exibe();
            }
            case 2 -> {
                Quadrado quadrado = new Quadrado();
                System.out.println(quadrado.getNomeFigura());
            }
            default -> System.out.print("Não foi escolhido um exemplo valido");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repete;

        System.out.println("Parte prática da apresentação de Java!");

        do{
            repete = decideRepete();
            if(repete) decideExemplo();
        }while (repete);

        System.out.println("Obrigado pela atenção!");

        sc.close();
    }
}
