package observerpattern;

public class User implements IObserver{
    private final String username;
    private final YoutubeChannel youtubeChannel; 
    private ObservableStatus status;
    
    public User(YoutubeChannel youtubeChannel,String username){
        this.youtubeChannel = youtubeChannel;
        this.username = username;
    }
    @Override
    public void update() {
        System.out.println(username);
        this.status=this.youtubeChannel.getStatus();
        if(this.status == ObservableStatus.CHANGE_SUBSCRIBERS ){
           this.youtubeChannel.displayTotalSubscribers();
                
        }
        else{
            this.youtubeChannel.displayReleaseMessage();
        }
    }
        
}
