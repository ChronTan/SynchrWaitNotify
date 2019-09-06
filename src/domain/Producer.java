package domain;

public class Producer implements Runnable {

    Producer(Work work){
        this.work=work;
    }
    Work work;


    public void run(){
        for(int i=0;i<6;i++) {
            work.put();
        }
    }
}
