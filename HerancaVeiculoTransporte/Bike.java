
import java.time.LocalDate;

public class Bike extends VeiculoTransporte {// bike vai herdar métodos da classe veiculo de transporte
    private int total_marchas;
    private float tamanho;

    public Bike(String cor, LocalDate data_fabricacao, int total_marchas, float tamanho) {
        super.setCor("Vermelha");
        super.setData_fabricacao(LocalDate.MIN);// super vai "puxar" os sets da classe veiculo de transporte
        
        this.total_marchas = total_marchas;
        this.tamanho = tamanho;
    }
                         
    public int getTotal_marchas() {
        return total_marchas;
    }

    public void setTotal_marchas(int total_marchas) {
        this.total_marchas = total_marchas;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

        public void frear(){
        System.out.println("Freiando classe bike");
    }  
    
    public void empinar(){
        System.out.println("Empinando classe bike");
    } 

    @Override
    public String toString() {
        return super.toString() + 
                "Bike{" + "total_marchas=" + total_marchas + ", tamanho=" + tamanho + '}';
    }      
}