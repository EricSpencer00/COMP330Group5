public class Membership {
    public int barcode;
    public String accountType;
    public String status;
    public String expiration;

    public Membership(int barcode, String accountType, String status, String expiration) {
        this.barcode = barcode;
        this.accountType = accountType;
        this.status = status;
        this.expiration = expiration;
    }
}
