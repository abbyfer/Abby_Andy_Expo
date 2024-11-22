/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajeroautomatico;

/**
 *
 * @author DELL
 */
class CuentaBanco {
    private String NumeroCuenta;
    private double Saldo;
    private String TipoCuenta;
    private double LimiteRetiro;

    public CuentaBanco(String NumeroCuenta, double Saldo, String TipoCuenta, double LimiteRetiro) {
        this.NumeroCuenta = NumeroCuenta;
        this.Saldo = Saldo;
        this.LimiteRetiro = LimiteRetiro;

        if (esTipoCuentaValido(TipoCuenta)) {
            this.TipoCuenta = TipoCuenta;
        } else {
            System.out.println("Tipo de cuenta incorrecto. Se asignara 'Ahorros' como predeterminado");
            this.TipoCuenta = "Ahorro";
        }
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        if (esTipoCuentaValido(TipoCuenta)) {
            this.TipoCuenta = TipoCuenta;
        } else {
            System.out.println("Tipo de cuenta incorrecto. No se realizaron cambios.");
        }
    }

    public double getLimiteRetiro() {
        return LimiteRetiro;
    }

    public void setLimiteRetiro(double LimiteRetiro) {
        this.LimiteRetiro = LimiteRetiro;
    }

    public boolean Retiro(double Monto) {
        if (Monto > Saldo) {
            System.out.println("Saldo insuficiente");
            return false;
        } else if (Monto > LimiteRetiro) {
            System.out.println("El monto excede el limite de su retiro diario");
            return false;
        } else {
            Saldo -= Monto;
            System.out.println("Retiro exitoso de " + Monto);
            System.out.println("Saldo actual: " + Saldo);
            return true;
        }
    }

    public void Deposito(double Monto) {
        Saldo += Monto;
        System.out.println("Deposito exitoso de " + Monto);
        System.out.println("Saldo actual: " + Saldo);
    }

    @Override
    public String toString() {
        return "Cuenta No.: " + NumeroCuenta + ", Tipo: " + TipoCuenta + ", Saldo: " + Saldo;
    }

    private boolean esTipoCuentaValido(String tipoCuenta) {
        return tipoCuenta.equalsIgnoreCase("Ahorros") || 
               tipoCuenta.equalsIgnoreCase("Corriente") || 
               tipoCuenta.equalsIgnoreCase("Inversiones");
    }
}
