/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;

/**
 *
 * @author afern
 */
public class Usuario {
    private String Nombre;
    private String Apellido;
    private String DNI;
    private String Pin;
    private CuentaBanco Cuenta;

    public Usuario(String Nombre, String Apellido, String DNI, String Pin, CuentaBanco Cuenta) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.Pin = Pin;
        this.Cuenta = Cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public CuentaBanco getCuenta() {
        return Cuenta;
    }

    public void setCuenta(CuentaBanco Cuenta) {
        this.Cuenta = Cuenta;
    }

    public boolean ValidarPin(String pinIngresado) {
        return this.Pin.equals(pinIngresado);
    }

    public double consultarSaldo() {
        return Cuenta.getSaldo();
    }

    @Override
    public String toString() {
        return "Usuario: " + Nombre + " " + Apellido + ", DNI: " + DNI;
    }

}
