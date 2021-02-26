package model;

import java.util.ArrayList;
import java.util.Random;

public class GuessTheNumber {

    Random r1 = new Random();
    private int num;
    private final ArrayList<NumObserver> COLLECTIONOFNUMOBSERVERS = new ArrayList<>();

    GuessTheNumber(){
        randomNum();
        notifyNumObserver();
    }


    public void randomNum(){
        this.num = r1.nextInt(101);
    }

    public int getNum() {
        return num;
    }

    public void setNewNum() {
        this.num = r1.nextInt(101);
    }


    public void notifyNumObserver(){
        for (NumObserver observer :COLLECTIONOFNUMOBSERVERS
             ) { observer.update();
        }
    }


    public void addNumObserver(NumObserver numObserver){
        if(!COLLECTIONOFNUMOBSERVERS.contains(numObserver))
        COLLECTIONOFNUMOBSERVERS.add(numObserver);
    }


    public interface NumObserver{
        void update();
    }


}
