


public class EstrategiaMedioDescuento implements EstrategiaDescuento {
    
    @Override
    public String getNombre() {
        return this.getClass().getName(); 
    }

    @Override
    public float getPorcentajeDescuento() {
        return 50;
    }
}
