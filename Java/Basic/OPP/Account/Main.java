package Java.Basic.OPP.Account;

public class Main {
  public static void main(String[] args) {
    AccountBank accountBank = new AccountBank(0);
    accountBank.setOwner("Júlio Miguel");
    accountBank.setNumber(73737);

    accountBank.withdraw(0);
    accountBank.withdraw(100);

    accountBank.deposit(100);
    accountBank.withdraw(15);
    accountBank.withdraw(8.4);
    accountBank.withdraw(76);
    accountBank.withdraw(0.6);

  }
}
