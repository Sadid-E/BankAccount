public class BankAccount {

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p) {
    accountID = a;
    password = p;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID() {
    return accountID;
  }

  public void setPassword(String p) {
    password = p;
  }

  public boolean deposit(double amount) {
    if (amount >= 0) {
      balance += amount;
      return true;
    }
      return false;
  }

  public boolean withdraw(double amount) {
    if (amount <= balance && amount >= 0) {
      balance -= amount;
      return true;
    }
      return false;
  }

  public String toString() {
    return "#" + accountID + "\t$" + balance;
  }

  private boolean authenticate(String password) {
    return (password.equals(this.password));
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (this.authenticate(password)) {
      if (this.withdraw(amount)) {
        if (other.deposit(amount)) {
          return true;
        }
      }
    }
    return false;
  }

}
