package SistemadechamadaTI_Renato_Fallaci;

public class Site {//1
	private static final String String = null;
//atributos
public 	String nome;
public  String instrucao;



//metodo especial
public String toStringnome() {
	return "Voce chamou o metodo da SuperClasse";
}


//construtor padrao
Site(){//2
}//2

//construtor com parametro
Site (String nme,String inst){
this.nome = nme;
this.instrucao=inst;
}
//get setter


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getInstrucao() {
	return instrucao;
}


public void setInstrucao(String instrucao) {
	this.instrucao = instrucao;
}


public static String getString() {
	return String;
}


}
