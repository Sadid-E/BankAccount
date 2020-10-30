public class Tester {

  public static void main(String[] args) {
    BankAccount a1 = new BankAccount(12,"hello");
    BankAccount a2 = new BankAccount(123,"cool");
    a1.setPassword("bye");
    System.out.println(a1.getBalance());
    System.out.println(a1.getAccountID());
    System.out.println(a1.deposit(1000));
    System.out.println(a1.getBalance());
    System.out.println(a1.deposit(-1000));
    System.out.println(a1.getBalance());
    System.out.println(a1.deposit(13.68));
    System.out.println(a1.getBalance());
    System.out.println(a1.withdraw(500));
    System.out.println(a1.getBalance());
    System.out.println(a1.withdraw(-500));
    System.out.println(a1.getBalance());
    System.out.println(a1.withdraw(18));
    System.out.println(a1.getBalance());
    //System.out.println(a1.authenticate("bye"));
    System.out.println(a1.transferTo(a2,200,"bye"));
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a1.transferTo(a2,500,"bye"));
    System.out.println(a1.transferTo(a2,100,"hello"));
  }

}
