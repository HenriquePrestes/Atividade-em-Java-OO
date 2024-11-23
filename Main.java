

// Classe abstrata Veiculo com os atributos solicitados, marca, modelo e ano privado.

abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    
    //this para ter acesso ao contexto do objeto, facilitando a inicialização de atributos e chamada de métodos.

    public Veiculo(String marca, String modelo, int ano) {   
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Métodos de acesso para o atributo privado "ano"
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método abstrato
    public abstract String informacoesVeiculo();
}

// Classe Carro que herda de Veiculo
class Carro extends Veiculo {
    public int numeroPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    //Override para sobrescrever outro método
    @Override
    public String informacoesVeiculo() {
        return "Carro: Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + getAno() + ", Número de Portas=" + numeroPortas;
    }
}

// Classe Moto que herda de Veiculo
class Moto extends Veiculo {
    private int cilindrada;

    // Construtor
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto: Marca=" + marca + ", Modelo=" + modelo + ", Ano=" + getAno() + ", Cilindrada=" + cilindrada + "cc";
    }

    // Acesso para o atributo privado cilindrada
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

// Uma classe publica para testar o objeto carro e moto
public class Main {
    public static void main(String[] args) {

                Carro carro = new Carro("Fiat", "Palio", 2013, 4);
                Moto moto = new Moto("BMW", "R18", 2024, 1800);

    //Printando na tela o resultado
        System.out.println(carro.informacoesVeiculo());
        System.out.println(moto.informacoesVeiculo());
    }
}
