

//import java.awt.List;
import java.util.List;
import java.*;
import javafx.animation.Animation.Status;
import twitter4j.ResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Araceli
 */
public class NewMain {
 
    /**
     * @param args the command line arguments
     */
 
 public static void main(String[] args) throws TwitterException {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        ResponseList <twitter4j.Status> statuses= twitter.getHomeTimeline();
        System.out.println("Mostrando el timeline...");
        for (twitter4j.Status status : statuses) {
            System.out.println("@" + status.getUser().getScreenName()+": "+ status.getText());
           
        }
    }
} 