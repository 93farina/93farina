import java.util.Scanner;

public class CalculadoraIMC {

    public static void main (String[] args) {

        // calcular IMC
        // se tiver IMC IMC = Peso ÷ (Altura × Altura)
        
        /*/Magreza	< 18.5	< 56.7 Kg
         Normal	18.5 a 24.9	56.7 a 76.3 Kg
         Sobrepeso	24.9 a 30	76.3 a 91.9 Kg
        Obesidade	> 30 */


        Scanner entrada = new Scanner (System.in);

        double peso;    
        double altura;
        double IMC;

        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();

        IMC = peso/(altura*altura);

        if (IMC<18.5) {
            System.out.printf("Seu IMC resultou em %.2f kg/m2, voce esta abaixo do peso.",IMC);
        } else if (IMC>18.5 && IMC<=24.9) {
            System.out.printf("Seu IMC resultou em %.2f kg/m2, voce esta dentro do peso ideal.",IMC);
        } else if (IMC>24.9 && IMC<=30) {
            System.out.printf("Seu IMC resultou em %.2f kg/m2, voce esta com sobrepeso.",IMC);
        } else { // IMC maior que 30
            System.out.printf("Seu IMC resultou em %.2f kg/m2, voce esta obeso.",IMC);
        }


    }
}