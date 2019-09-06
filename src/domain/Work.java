package domain;

public class Work {

    int product=0;
    int productConsumer=0;
    int stealing=0;

    synchronized void put(){
//        while(product>6){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("error");
//            }}
//            System.out.println("произведено 3 товара");
//            product+=3;
//            System.out.println("на складе: "+ product);
//        notify();
        if(product>6){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }else{
            System.out.println("произведено 3 товара");
            product+=3;
            System.out.println("на складе: "+ product);
            notify();
        }
    }

    synchronized void get(){
//        while(product<2){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("error");
//            }}
//            System.out.println("купил 2 товара");
//            product-=2;
//            productConsumer+=2;
//            System.out.println("на складе: "+ product);
//            System.out.println("У покупателя: "+ productConsumer);
//        notify();
        if(product<2){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }else{
            System.out.println("купил 2 товара");
            product-=2;
            productConsumer+=2;
            System.out.println("на складе: "+ product);
            System.out.println("У покупателя: "+ productConsumer);
            notify();
        }
    }

    synchronized void steal(){
//        while(productConsumer<1){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println("error");
//            }}
//            System.out.println("украл 1 товар");
//            productConsumer-=1;
//            System.out.println("У покупателя: "+ productConsumer);
//            stealing++;
//            System.out.println("Укралено всего:" + stealing);
//        notify();
        if(productConsumer<1){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }else{
            System.out.println("украл 1 товар");
            productConsumer-=1;
            System.out.println("У покупателя: "+ productConsumer);
            stealing++;
            System.out.println("Укралено всего:" + stealing);
            notify();
        }
    }
}
