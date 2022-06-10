package ct;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }
    void notifyObserver(Question question,String reponse){
        for (var observer: observers)
            observer.update(question, reponse);
    }
}
