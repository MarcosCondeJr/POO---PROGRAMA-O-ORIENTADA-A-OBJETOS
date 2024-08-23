package construtor;

public class Carros {
    String nome;
    String marca;
    String modelo;
    int ano;
    double preco;

    Carros (String n,String mar,String m,int ano,double p){
        this.nome = n;
        this.marca = mar;
        this.modelo = m;
        this.ano = ano;
        this.preco = p;
    }

    public void exibirCarro (){
        System.out.println("Carro: "+nome);
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
        System.out.println("Valor: "+preco+"\n");
    }
}

