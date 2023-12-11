package SistemadechamadaTI_Renato_Fallaci;


public class Cliente {//1
   //atributos
private String nome;
private String sobrenome;
private String cidade;
private String problema;
private String comentario;

public static void main (String [] args) {

}

//construtor padrao
Cliente (){//2
}//2

//construtor com parametro
Cliente (String nm, String sbnm,String cid,String prob,String cmt){
	this.nome = nm;
	this.sobrenome=sbnm;
	this.cidade=cid;
	this.problema=prob;
	this.comentario=cmt;
}
//get e setter

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getSobrenome() {
	return sobrenome;
}

public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getProblema() {
	return problema;
}

public void setProblema(String problema) {
	this.problema = problema;
}

public String getComentario() {
	return comentario;
}

public void setComentario(String comentario) {
	this.comentario = comentario;
}


}//1

