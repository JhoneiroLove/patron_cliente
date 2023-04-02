
import java.util.*;
public class EstrategiaCliente {
    
    double precio;
    Map<String,EstrategiaDescuento> clientes = new HashMap<String,EstrategiaDescuento>();
    
   EstrategiaCliente(double precio){

   this.precio = precio;
   clientes.put(EstrategiaNoDescuento.class.getName(),new EstrategiaNoDescuento());
   clientes.put(EstrategiaCuartoDescuento.class.getName(),new EstrategiaCuartoDescuento());
   clientes.put(EstrategiaMedioDescuento.class.getName(),new EstrategiaMedioDescuento());

}
   public void aplicarEstrategia(EstrategiaDescuento estrategia){
   
    System.out.println("Precio antes de la oferta: "+precio);
   double precioFinal = precio - (precio*estrategia.getPorcentajeDescuento()/100);
   System.out.println("Precio después de la oferta: "+precioFinal);
   }
   
   public EstrategiaDescuento getEstrategia(int nMes){
   
    if (nMes >=1 && nMes<=6){
      return clientes.get(EstrategiaNoDescuento.class.getName());}
    if(nMes>=7 && nMes<=9){ 
     return clientes.get(EstrategiaCuartoDescuento.class.getName());
    } else{
      return clientes.get(EstrategiaMedioDescuento.class.getName());
    }
    }
   }
   
