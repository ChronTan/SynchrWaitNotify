package domain;

public class Consumer implements Runnable{

    Consumer(Work work){
        this.work=work;
    }
    Work work;


    public void run(){
        for(int i=0;i<6;i++) {
            work.get();
        }
    }
}
