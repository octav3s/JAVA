class java_day2cw {
public static void main(String[] args) {
    int books=3;
    int price=275;
    int total_amount=books*price;
    int discount=10;

    double discount_value=(discount/100.0)*total_amount;
    double net_amount=total_amount-discount_value;

    System.out.println("Discount: "+discount_value);
    System.out.println("Net Amount: "+net_amount);
    }

}