
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        VeiculoTransporte veiculoTransporte = new  VeiculoTransporte();
        veiculoTransporte.acelerar();
        veiculoTransporte.freiar();
        
        System.out.println(veiculoTransporte.toString());
        
        LocalDate data_fabricacao = LocalDate.of(2020, 2,2);
        
        Bike bike = new Bike("verde",data_fabricacao,5,1);
        bike.acelerar(); // método que não existe na bike, mas que é executado
        // herança pela classe veiculo de transporte.
        bike.frear();
        bike.empinar();
        System.out.println(bike.toString());
    }
}
