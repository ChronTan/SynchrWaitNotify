package domain;

public class Robber implements Runnable {

    Robber(Work work){
        this.work=work;
    }
    Work work;


    public void run(){
        for(int i=0;i<6;i++) {
            work.steal();
        }
    }
}
