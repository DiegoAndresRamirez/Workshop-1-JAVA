package Clases;

public class CuentaBancaria {
    private String titular;
    private Double balance;

    public CuentaBancaria(String titular, Double balance){
        this.titular = titular;
        this.balance = balance;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void depositarDinero(String titular, Double newBalance){
        if(this.titular.equalsIgnoreCase(titular)){
            if(this.balance>0){
                this.balance += newBalance;
                System.out.println("se agrego el dinero correctamente");
            }
        }else{
            System.out.println("no se encontro la cuenta bancaria");
        }
    }

    public void retirarDinero(String titular, Double newBalance){
        if(this.titular.equalsIgnoreCase(titular)){
            if(this.balance> 0){
                Double operacion = this.balance-newBalance;
                if(operacion<0){
                    System.out.println("no se puede retirar dinero, estamos quebrados :/");
                }else {
                    this.balance -= newBalance;
                    System.out.println("Se retiro el dinero correctamente");
                }
            }
        }else{
            System.out.println("no se encontro la cuenta bancaria");
        }
    }

    public void mostrarBalance(String titular){
        if(this.titular.equalsIgnoreCase(titular)){
            System.out.println("El balance de " + this.titular + " es de: " + this.balance);
        }
    }
}
