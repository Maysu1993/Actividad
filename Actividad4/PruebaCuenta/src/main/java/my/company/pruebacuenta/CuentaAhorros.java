/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.pruebacuenta;

/**
 *
 * @author maylen
 */
public class CuentaAhorros extends Cuenta {
    private boolean activa;

public CuentaAhorros(float saldo, float tasa) {
super(saldo, tasa);
if (saldo < 10000) 
activa = false; else
activa = true; }
   
public void retirar(float cantidad) {
if (activa) 
super.retirar(cantidad); }
public void consignar(float cantidad) {
if (activa) 
super.consignar(cantidad); 
}

 public void imprimir() {
     System.out.println("Saldo = $ " + saldo);
     System.out.println("Comisión mensual = $ " + comisiónMensual);
      System.out.println("Número de transacciones = " +(númeroConsignaciones + númeroRetiros));
      System.out.println();
    }

}
