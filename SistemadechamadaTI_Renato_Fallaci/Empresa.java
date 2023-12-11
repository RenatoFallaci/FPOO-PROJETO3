package SistemadechamadaTI_Renato_Fallaci;

//import java.util.List;
	//atributos
public class Empresa{
public String nome;
public String endereco;
public int telefone;
//composcao
public Cliente clientes ;
//agregacao
public Tecnico tecnicos;



//construtor padrao
Empresa (){//2
}//2

//construtor com parametro
Empresa (String nm, String ende,int telf) {
	this.nome = nm;
	this.endereco=ende;
	this.telefone=telf;
}
//get e setter
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public int getTelefone() {
	return telefone;
}

public void setTelefone(int telefone) {
	telefone = telefone;
}

}








