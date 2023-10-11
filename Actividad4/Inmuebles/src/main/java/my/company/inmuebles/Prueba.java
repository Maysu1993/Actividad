package my.company.inmuebles;
public class Prueba {
   
public static void main(String args[]) {
    System.out.println("Maylen Echavez\n");
    ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
    System.out.println("Datos apartamento");
    apto1.calcularPrecioVenta(ApartamentoFamiliar.valorArea);
    apto1.imprimir();
    System.out.println("Datos apartamento");
    Apartaestudio aptestudio1 = new
    Apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
    aptestudio1.calcularPrecioVenta(Apartaestudio.valorArea);
    aptestudio1.imprimir();
}
    
}
