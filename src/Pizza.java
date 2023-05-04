public class Pizza {
    private static int price;
    private Boolean veg;
    private int addExtraCheese=1;
    private static int addExtraToppings=2;
    private static int backPrice=1;
    private int basePizzaPrice;

    private  boolean isExtraCheeseadd=false;
    private  boolean isExtraToppingsadd=false;
    private boolean isbackPrice=false;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 3;

        } else {
            this.price = 4;
        }
        basePizzaPrice =this.price;

    }

    public void addExtraCheese(){
        isExtraCheeseadd=true;
        System.out.println("Extra cheese add");
        this.price+=addExtraCheese;

    }
    public  void addExtraToppings(){
        isExtraToppingsadd=true;
        System.out.println("add extra Topping");
        this.price+=addExtraToppings;

    }

    public void  takeaway(){
        isbackPrice=true;
        System.out.println("Take away opted");
        this.price+=backPrice;
    }
    public void getBill(){
            String bill="";
        System.out.println("Pizza"+basePizzaPrice);

        if(isExtraCheeseadd){
         bill+="Extra chesse added :"+addExtraCheese+"\n";
        }
        if(isExtraToppingsadd){
            bill+="Extra Toppings added :"+addExtraToppings+"\n";
        }
        if(isbackPrice){
            bill+="take away:"+backPrice+"\n";
        }

        bill += "Bill:"+this.price+"\n";

        System.out.println(bill);
    }
}
