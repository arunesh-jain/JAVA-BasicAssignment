package Question9;

public class Main {
    public static void main(String[] args) {

        SBI sbi = new SBI();
        ICICI ici = new ICICI();
        BOI boi = new BOI();
        Bank bank=new Bank();

        bank.getDetail();
        sbi.getDetail();
        ici.getDetail();
        boi.getDetail();
    }
}
