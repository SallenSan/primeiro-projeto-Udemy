package Entidade;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    // construtores
    public Conta(String nome, int numeroConta, double saldo) {
        this.titular = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Conta(String nome, int numeroConta) {
        this.titular = nome;
        this.numeroConta = numeroConta;
    }

    // getters e setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }



    public double getSaldo() {
        return saldo;
    }


    public void deposito(double quantia){
        saldo += quantia;
    }

    public void saque(double quantia){
        saldo -= quantia + 5;
    }

    public String toString(){
        return "conta "
                + numeroConta
                + ", titular "
                + titular
                + ", saldo de R$ "
                + String.format("%.2f", saldo);
    }

}
