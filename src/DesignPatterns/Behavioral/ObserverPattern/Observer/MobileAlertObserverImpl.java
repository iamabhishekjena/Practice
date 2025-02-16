package DesignPatterns.Behavioral.ObserverPattern.Observer;

import DesignPatterns.Behavioral.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String mobileNumber;
    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String mobileNumber,StocksObservable stocksObservable){
        this.mobileNumber = mobileNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendSms(mobileNumber,"Stock Available. Hurry Up!!!");
    }

    private void sendSms(String mobileNumber,String message){
        System.out.println(message);
        System.out.println("message sent to:"+mobileNumber);
    }
}
