package observerpattern;

public class ObserverPattern {

    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        User user1 = new User(youtubeChannel,"user1");
        youtubeChannel.add(user1);
        User user2 = new User(youtubeChannel,"user2");
        youtubeChannel.add(user2);
        User user3 = new User(youtubeChannel,"user3");
        youtubeChannel.add(user3);
        User user4 = new User(youtubeChannel,"user4");
        youtubeChannel.add(user4);
        User user5 = new User(youtubeChannel,"user5");
        youtubeChannel.add(user5);
        youtubeChannel.remove(user3);
        youtubeChannel.uploadVideo();

    }
    
}
