package org.lessons.snack.java;

import java.math.BigDecimal;

public class ContoBancario {

  private int accountNumber;
  private BigDecimal balance;

  ContoBancario(int accountNumber){
    // Save the account number
    this.accountNumber = accountNumber;

    // Initialize balance
    balance = new BigDecimal("0");
  }

  public void depositMoney(float money){
    if(money > 0)
      balance = balance.add(BigDecimal.valueOf(money));
  }

  public void withDrawMoney(float money){
    if(money > 0)
      balance = balance.subtract(BigDecimal.valueOf(money));
  }

  public BigDecimal getBalance(){
    return balance;
  }

  String getContoBancario(){
    return "Conto Bancario \nNumero conto: " + accountNumber + "\nBilancio: " + balance;
  }

}
