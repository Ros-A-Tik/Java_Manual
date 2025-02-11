package ENUMERATIONS;

public enum ApplePrice {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price; // price of each apple

    // Constructor
    ApplePrice(int p) { price = p; }

    int getPrice() { return price; }
}
