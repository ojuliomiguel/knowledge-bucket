package Java.Basic.OPP.Account;

public class AccountBank {

  private double number;
  private String owner;
  private double balance;

  public AccountBank(double amount) {
    this.balance = amount;
  }

  void deposit(double value) {
    if (value < 0) {
      System.out.println();
      return;
    }

    this.balance = this.balance + value;
    System.out.println("Deposit $ " + value + "\nCurrent balance $" + this.balance);
  }

  void withdraw(double value) {
    if (value <= 0 || value > this.balance) {
      System.out.println("Cannot withdraw. Current balance $ " + this.balance + "\nWithdrawal requested $ " + value);
      return;
    }
    this.balance = this.balance - value;
    System.out.println("Withdraw $" + value + "\nCurrent balance " + this.balance);
  }

  public double getNumber() {
    return number;
  }

  public void setNumber(double number) {
    this.number = number;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public double getBalance() {
    return balance;
  }
}
