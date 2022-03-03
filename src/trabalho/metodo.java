
package trabalho;


public class metodo {
   private String nome;
   private double idade;
   private double peso;

public String getNome(){
    return nome;
}
public String setNome(String nome){
    return this.nome=nome;
}
public double getIdade (){
    return idade;
}
public double setIdade(double idade){
    return this.idade=idade;
}
public double getPeso(){
    return peso;
}
public double setPeso(double peso){
    return this.peso=peso;
}
public String verificarIdade(){
    if (this.idade >= 18) {
        return "maior de idade.";
        } else {
        return "menor de idade";
}
}
@Override
public String toString(){
    return "\nNome: "+nome+
    "\nIdade: "+idade+
    "\nPeso: "+peso+
    "\nResultado: "+verificarIdade();
    
}
}



