
import java.time.LocalDate;

public class Carro extends VeiculoTransporte {
    private int capacidade;
    private float velocidade_final;

    public Carro(String cor, LocalDate dataFabricacao, int capacidade,float velocidadeFinal) {
        super.setCor(cor);
        super.setData_fabricacao(data_fabricacao);
        this.capacidade = capacidade;
        this.velocidade_final = velocidadeFinal;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public float getVelocidade_final() {
        return velocidade_final;
    }

    public void setVelocidade_final(float velocidade_final) {
        this.velocidade_final = velocidade_final;
    }
    
    @Override
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void pagar_imposto(){
        
    }
   
    @Override
    public String toString() {
        return "Carro{" + "capacidade=" + capacidade + ", velocidade_final=" + velocidade_final + '}';
    }
}