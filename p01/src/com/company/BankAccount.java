package com.company;

import java.util.Date;

public class BankAccount {
    int acctType;
    String acctNumber;
    double acctBalance;
    class CheckingAccount extends BankAccount {
        double acctBalance;
        double acctLimit;

    }

    class CertificateOfDeposut extends BankAccount {
        int acctTransfers;
    }

    public static void main(String[] args) {
        BankAccount myAcc =new BankAccount();
    }
}
