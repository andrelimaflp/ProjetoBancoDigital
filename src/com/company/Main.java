package com.company;
import java.io.SequenceInputStream;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();

        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
