package DesignPatterns.Behavioral.ObserverPattern;

import DesignPatterns.Behavioral.ObserverPattern.Observable.IphoneObservableImpl;
import DesignPatterns.Behavioral.ObserverPattern.Observable.StocksObservable;
import DesignPatterns.Behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.Behavioral.ObserverPattern.Observer.MobileAlertObserverImpl;
import DesignPatterns.Behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]){
        StocksObservable iphoneObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("asdassdas@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("213213213",iphoneObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("asdasd@gmail.com",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);
    }
}
