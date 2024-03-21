package observerpattern;

import java.util.LinkedList;
import java.util.List;

public class YoutubeChannel implements IObservable{
    private final List<IObserver> observers;
    private ObservableStatus status;
    
    public YoutubeChannel(){
        this.observers = new LinkedList<>();
    }
    @Override
    public void add(IObserver observer) {
       System.out.println("\nAdding Subscriber");
       observers.add(observer);
       status = ObservableStatus.CHANGE_SUBSCRIBERS;
       notifyObservers();
    }

    @Override
    public void remove(IObserver observer) {
        System.out.println("\nRemoving Subscriber");
        observers.remove(observer);
        status = ObservableStatus.CHANGE_SUBSCRIBERS;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying subscribers\n");
        
        for(IObserver observer:observers){
            observer.update();
        }
    }
    
    public void displayTotalSubscribers(){
        System.out.println("Number of subscribers:"+ observers.size());
    }
    public void displayReleaseMessage(){
        System.out.println("New video release");
    
    }
    public ObservableStatus getStatus(){
        return status;
    }    
    public void uploadVideo(){
        status = ObservableStatus.NEW_RELEASE;
        notifyObservers();
    }
}
