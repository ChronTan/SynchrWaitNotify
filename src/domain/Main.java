package domain;

public class Main {

    public static void main(String[] args) {
        Work work=new Work();
        Producer producer=new Producer(work);
        Consumer consumer=new Consumer(work);
        Robber robber=new Robber(work);
        Thread prod=new Thread(producer);
        Thread cons=new Thread(consumer);
        Thread rob=new Thread(robber);
        prod.start();
        cons.start();
        rob.start();

    }
}
