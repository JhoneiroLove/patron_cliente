

public class EstrategiaCuartoDescuento implements EstrategiaDescuento {

    @Override
    public String getNombre() {
        return this.getClass().getName(); 
    }

    @Override
    public float getPorcentajeDescuento() {
        return 25;
    }
    
    
}
