public class Tester {

  public static void main(String[] args) {
    BankAccount a1 = new BankAccount(12,"hello");
    a1.setPassword("bye");
    System.out.println(a1.getBalance());
    System.out.println(a1.getAccountID());
    System.out.println(a1.deposit(1000));
    System.out.println(a1.getBalance());
    System.out.println(a1.deposit(-1000));
    System.out.println(a1.getBalance());
  }

}
