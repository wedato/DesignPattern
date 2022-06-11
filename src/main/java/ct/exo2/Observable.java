package ct.exo2;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }
    void notifyObserver(Question question,Reponse reponse){
        for (var observer: observers)
            observer.update(question, reponse);
    }
}
