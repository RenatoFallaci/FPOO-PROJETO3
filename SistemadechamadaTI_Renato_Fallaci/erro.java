package SistemadechamadaTI_Renato_Fallaci;

public class erro {






//CLIENTE
Scanner entrada= new Scanner (System.in);
System.out.println("\n T1 PEDRO, COM QUEM FALO   ");
entrada.nextLine();
System.out.println("\n QUAL CIDADE O SENHOR FALA   ");
entrada.nextLine();
System.out.println("\n QUAL O PROBLEMA DO SENHOR    ");
entrada.nextLine();
System.out.println("\n CERTO SENHOR SEU PROBLEMA E DE REDE EM SOBRECARGA DESLIGUE O ROTEADOR E ESPERE 30 segundos  E LIGUE NOVAMENTE    ");
entrada.nextLine();
System.out.println("\n ASSIM QUE LIGAR ME DIZ SE VOLTOU     ");
entrada.nextLine();
System.out.println("\n OTIMO QUE DEU CERTO TI TURBO AGRADECE A CONFIANCA    ");
System.out.println("-------------------------------------------------------------------------------------------  ");

//site	
System.out.println("BEM VINDO AO TI TURBO SITE");
System.out.println("QUAL O NOME DO SENHOR()A");
entrada.nextLine();
System.out.println("QUAL CIDADE");
entrada.nextLine();

//SWITCH1
System.out.println("QUAL SEU PROBLEMA : \n  1-VIRUS    2-LENTIDAO      3 -PROBLEMAS COM O PROCESSADOR       4-SOBREAQUECIMENTO");
int escolha = entrada.nextInt();
switch (escolha) {
case 1:
System.out.println("ABAIXE UM ANTIVIRUS NO SEU COMPUTADOR ");	
break;//Usado para interromper a execução de um dos laços de iteração vistos acima ou de um comando switch.
case 2:
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
System.out.println("PODERIA DAR UM RESPWAN SOBRE NOSSO TRABALHO");
System.out.println("1-OTIMO      2- BOM       3-PODERIA MELHORAR ");

int escolha3 = entrada.nextInt();
switch (escolha3) {
case 1:
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