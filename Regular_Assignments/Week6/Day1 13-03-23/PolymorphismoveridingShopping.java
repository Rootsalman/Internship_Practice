class Product {
    public void calculateDiscount(int price) {
        int discount = 10 * price / 100;
        price = price - discount;
        System.out.println("total price : " + price);
    }
}

 

class Electronics extends Product {
    public void calculateDiscount(int price) {
        if (price > 5000) {
            super.calculateDiscount(price);
        } else {
            System.out.println("total price : " + price);
            System.out.println("Purchase more for discount");
        }
    }
}

 

class Apparel extends Product {
    public void calculateDiscount(String season, int price) {
        if (season == "clearence" || season == "occasions") {
            super.calculateDiscount(price);
        } else {
            System.out.println("total price : " + price);
            System.out.println("Purchase more for discount");
        }
    }
}

 

class PolymorphismoveridingShopping {
    public static void main(String[] args) {
        Apparel apparel = new Apparel();
        Electronics elec = new Electronics();

 

        elec.calculateDiscount(4500);
        apparel.calculateDiscount("clearence", 4500);
    }
}