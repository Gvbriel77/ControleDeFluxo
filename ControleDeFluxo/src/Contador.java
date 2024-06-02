import java.util.Scanner;


public class Contador {
    public static void main(String[] args)  {
        Scanner sc = new Scanner (System.in);
         
            System.out.println(" Digite o primeiro parametro: ");
            int num1 = sc.nextInt();
            System.out.println(" Digite o segundo parametro: ");
            int num2 = sc.nextInt();

            try {
                contar(num1, num2);
            }catch (Excecao e){
                System.err.println(e.getMessage());
            }

          } 

                static void contar (int num1 , int num2) {
                    if (num1 > num2){
                    throw new Excecao(" O segundo parametro deve ser maior que o primeiro!! ");
                    
                }

                for (int i = num1 +1; i <= num2; i++){
                    System.out.println("Imprimindo o numero " + (i - num1));
                }

        }

        
           



}


    

