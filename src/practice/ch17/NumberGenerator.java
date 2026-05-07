package practice.ch17;

import java.util.ArrayList;
import java.util.List;

// 관찰 대상
public abstract class NumberGenerator {
    // Observer를 저장한다  
    // Observer: 부모 타입 -> 모든 종류의 관찰자를 저장할 수 있다
    // 관찰대상은 구체적으로 어떤 종류의 관찰자가 있는지 알 필요가 없다 -> 관찰자와 관찰대상이 느슨한 결합을 갖고 있다
    private List<Observer> observers = new ArrayList<>();

    // Observer를 추가한다 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(this);
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}
