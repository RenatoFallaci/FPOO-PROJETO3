package SistemadechamadaTI_Renato_Fallaci;

public class Tecnico {
	//atributos
public Empresa emp;
public String nome;
public String função;

//construtor padrao
Tecnico (){//2
}//2

//construtor com parametro
Tecnico (Empresa emp,String nme,String func){
	this.emp = emp;
	this.nome=nme ;
	this.função= func ;

}
//get e setter// ctrl 3 ggas ou enter

public Empresa getEmp() {
	return emp;
}

public void setEmp(Empresa emp) {
	this.emp = emp;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getFunção() {
	return função;
}

public void setFunção(String função) {
	this.função = função;
}

}
