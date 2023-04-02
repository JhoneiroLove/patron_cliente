


import java.util.Scanner;

public class EstrategiaDescuentoDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDOS A LA OFERTA DE LA SEMANA");
        System.out.print("Ingrese el precio: ");
        int precio = sc.nextInt();
        EstrategiaCliente context = new EstrategiaCliente(precio);
        System.out.println("Ingrese el numero del mes del 1 al 12: ");
        int mes = sc.nextInt();
         System.out.println("Mes ="+mes);
         EstrategiaDescuento estrategia = context.getEstrategia(mes);
         context.aplicarEstrategia(estrategia);
    }
}
