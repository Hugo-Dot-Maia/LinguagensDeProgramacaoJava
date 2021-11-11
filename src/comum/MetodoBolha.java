package comum;
import java.util.Scanner;

public class MetodoBolha {
    int[] intArray;

    public void exibe(){
        int tamanho = intArray.length;
        for(int i = 0; i < tamanho; i++)
            System.out.print(intArray[i] + ", ");
        System.out.println("");
    }

    public void ordena() {
        int n = intArray.length;
         for (int i = (n - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j + 1]) {

                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;

                }
            }
         }
    }

    public void defineTamanhoArray(){
        int tamanho;
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tamanho do Array?: ");
        tamanho = sc.nextInt();

        intArray = new int[tamanho];
    }

    public void iniciaArray(){
        int tamanho = intArray.length;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < tamanho; i++){
            System.out.print("Insira um número: ");
            intArray[i] = sc.nextInt();
        }
        sc.close();
    }
}
