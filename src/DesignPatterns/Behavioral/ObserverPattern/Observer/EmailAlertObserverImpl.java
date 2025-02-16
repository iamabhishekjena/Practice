package DesignPatterns.Behavioral.ObserverPattern.Observer;

import DesignPatterns.Behavioral.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId,StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }
    @Override
    public void update() {
        sendEmail(emailId,"Stock Available. HurryUp!!!!!");
    }

    private void sendEmail(String emailId,String message){
        System.out.println(message);
        System.out.println("Email sent to:"+emailId);
    }
}
