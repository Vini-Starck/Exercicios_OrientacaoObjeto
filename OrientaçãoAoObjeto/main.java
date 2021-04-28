package OrientaçãoAoObjeto;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Geladeira Gel = new Geladeira();
        
        System.out.println("Digite a quantidade em litros da geladeira:");
        int l = leitor.nextInt();
        Gel.ajustarLitros(l);
        
        System.out.println("Defina a tensão elétrica da geladeira:");
        int t = leitor.nextInt();
        Gel.ajustarTensão(t);
        
        System.out.println("Em qual temperatura deseja colocar a geladeira?");
        int temp = leitor.nextInt();
        Gel.ajustarTemperatura(temp);
        
        System.out.println("Deseja colocar a geladeira em modo de degelo(limpeza)?\n"
                + "Sim = true\n"
                + "Não = false");
        boolean degelo = leitor.nextBoolean();
        Gel.Degelo(degelo);
        
        Gel.mostrarPainel();
        
        
    }
    
}
