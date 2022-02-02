
import java.time.LocalDate;

public class VeiculoTransporte {
      public LocalDate data_fabricacao;
      public String cor;

    public VeiculoTransporte() {
    }

    public LocalDate getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(LocalDate data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
      
    public void acelerar(){
        System.out.println("Acelerando classe veiculo de transporte!");
    }  
    
    public void freiar(){
        System.out.println("Freiando classe veiculo de transporte!");
    }  

    @Override
    public String toString() {
        return "VeiculoTransporte{" + "data_fabricacao=" + data_fabricacao + ", cor=" + cor + '}';
    }
}
