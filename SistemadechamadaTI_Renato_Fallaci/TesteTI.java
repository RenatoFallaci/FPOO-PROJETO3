package SistemadechamadaTI_Renato_Fallaci;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteTI {

	public static void main(String[] args) {//1
		
	// instanciar obj 
		
		Empresa E1 = new Empresa ();
		Tecnico t1 = new Tecnico ();
		Tecnico t2 = new Tecnico();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Site s1 = new Site ();
		Scanner entrada = new Scanner (System.in);
		
		
		Scanner entrada1= new Scanner (System.in);
		System.out.println("SOMOS UMA EMPRESA QUE RESOLVE RAPIDO SEUS PROBLEMAS SOBRE COMPUTAÇÃO\rRUA ANTONIO BANDEIRA\rEMDERECO 333\rOU ACESSE NOSSO SITE www.ti turbo S.com.br");
		
		System.out.println("\n TI TURBO  T3 PEDRO ,COM QUEM FALO \n    ");
		entrada.nextLine();
		System.out.println("\n DE QUAL CIDADE O SENHOR/A FALA");
	    c2.setCidade(entrada.next());
	    System.out.println("\n QUAL O PROBLEMA DO SENHOR ");
	    c2.setProblema(entrada.next());
	    System.out.println("\nCERTO SENHOR SEU PROBLEMA E DE REDE EM SOBRECARGA DESLIGUE O ROTEADOR E ESPERE 30 segundos  E LIGUE NOVAMENTE    ");
	    c2.setProblema(entrada.next());

        System.out.println("\rASSIM QUE LIGAR ME DIGA SE DEU CERTO, PODERIA DEIXAR UM RESPAWN SOBRE NOSSO TRABALHO  ");
        c2.setComentario(entrada.next());
        System.out.println("TI TURBO AGRADECE SEU COMENTARIO  ");
        System.out.println("---------------------------------------------------------------  ");

        
        
        
       //SITE 
      //SWITCH1
        System.out.println("TI TURBO S");
        s1.setInstrucao("QUAL SEU PROBLEMA");
        
        System.out.println("QUAL SEU PROBLEMA : \n  1-VIRUS    2-LENTIDAO      3 -PROBLEMAS COM O PROCESSADOR       4-SOBREAQUECIMENTO");
        int escolha = entrada.nextInt();
        switch (escolha) {
       case 1:
    	   s1.setInstrucao("");
    	   System.out.println("ABAIXE UM ANTIVIRUS NO SEU COMPUTADOR ");	
        break;//Usado para interromper a execução de um dos laços de iteração vistos acima ou de um comando switch.
        case 2:
        	 s1.setInstrucao("");
        	System.out.println("FORMATE SEU PC");
        	break;


        	case 3:
        	System.out.println("EXCLUA ALGUMAS FOTOS E COISAS QUE VOCE NAO USA MAS E RENICIE");
        	break;
        	

        	case 4:
        	System.out.println("1 ATUALIZE A VENTOINHA DA CPU\n"
        			+ "2 DE MAIS ESPACO AO COMPUTADOR \n"
        			+ "3 FECHE O GABINETE\n"
        			+ "4 LIMPE AS VENTOINHAS");
        	break;
        	}
      //AVALIAÇÃO

        System.out.println("SE DEU CERTO SELECIONE 1        SE NAO DEU CERTO SELECIONE 2");
        int escolha2 = entrada.nextInt();
        switch (escolha2) {
        case 1:
        System.out.println("1 FUNCIONOU");

        break;

        case 2:
        System.out.println(" 2 LIGUE PARA NOSSO TELEFONE 3583 3333");

        break;
        }
        c3.getComentario();
        System.out.println("PODERIA DAR UM RESPWAN SOBRE NOSSO TRABALHO");
        System.out.println("1-OTIMO      2- BOM       3-PODERIA MELHORAR ");

        int escolha3 = entrada.nextInt();
        switch (escolha3) {
        case 1:
        c3.getComentario();
        System.out.println("QUE BOM QUE GOSTOU DOS NOSSO SERVICOS DEIXE ABAIXO UM COMENTARIO");
        break;
        case 2:
        System.out.println("OBRIGADO POR NOS AVALIAR VAMOS SEMPRE TENTAR ESTAR MELHORANDO");
        break;
        case 3:
        System.out.println("QUE PENA DEIXE ABAIXO UM COMENTARIO DO QUE PODERIAMOS MELHORAR");
        break;
        }
        System.out.println("\n COMENTARIO   ");
        entrada.next();
        System.out.println("\n TI TURBO AGRADECE SEU COMENTARIO   ");
        System.out.println("----------------------------------------------------------------------------------------------------");
}
}