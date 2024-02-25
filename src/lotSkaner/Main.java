package lotSkaner;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone= new MobilePhone("200",500);
        MobilePhone oldPhone= new MobilePhone("600",800);
        MobilePhone mediumPhone= new MobilePhone("400",900);
        //phone.displaysValue();
        //phone.differentPrice();
        String parameters= phone.getParameters();
        System.out.println(parameters);
        //phone.chekPrice();
        //oldPhone.chekPrice();
        //mediumPhone.chekPrice();
        //System.out.println(mediumPhone.wieght + " " + mediumPhone.price);
        phone.chekingPrices(11,-1);



    }

}
class MobilePhone {

    String wieght;
    int price;


    public MobilePhone(String wieght, int price) {
        this.wieght = wieght;
        this.price = price;
    }

    public void displaysValue() {
        System.out.println(this.wieght + " " + this.price);

    }

    public String getParameters() {
        return (this.price + " " + this.wieght);
    }

    public void setPrice() {
        System.out.println(this.price);
    }

    public void differentPrice() {
        System.out.println("discount price " + price * 0.9 + "PLN");
    }

    public void chekPrice() {
        if (this.price > 500) {
            System.out.println("This phone is too expensiev");
        }

        if (this.price < 200) {
            System.out.println("Price is very good");
        } else if (this.price < 300) {
            System.out.println("This price good");
        } else if (this.price < 550) {
            System.out.println("This phone could be lower");

        } else {
            System.out.println("This price advanced");
        }

        }
        public void chekingPrices(int max,int min){
            for (int i = min; i < max ; i++) {
               if (i%2==0){
                   System.out.println(i);
               }

                
            }
        




        }

    public static void main(String[] args) {
        String first= new String("test");
        String second= new String("test");
        if (first==second){
            System.out.println();
        }
    }




    }
