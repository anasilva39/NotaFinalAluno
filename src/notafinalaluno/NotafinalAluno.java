
package notafinalaluno;

import java.util.Scanner;


public class NotafinalAluno {

    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2, nota3, media;
        
        System.out.println("Digite a 1ª nota: ");
        nota1 = entrada.nextFloat();
        
        System.out.println("Digite a 2ª nota: ");
        nota2 = entrada.nextFloat();
        
        System.out.println("Digite a 3ª nota: ");
        nota3 = entrada.nextFloat();
        
        media = (nota1 + nota2 + nota3) /3;
        System.out.println("A média do Auno é: "+media);
        
        if(media >= 7){
            System.out.println("Aprovado");
        }else if(media >= 5){
            System.out.println("Recuperação");
        }else if(media < 5){
            System.out.println("Reprovado");
        }
    }
    
}
