package ca.ualberta.cs.lonelytwitter;

/**
 * Represents an important tweet.
 * @author kaixiang
 * @version 1.5
 * @see ca.ualberta.cs.lonelytwitter.NormalTweet
 * @see ca.ualberta.cs.lonelytwitter.Tweetweet
 *
 */

import java.util.Date;

public class ImportantTweet extends Tweet{

    ImportantTweet(String message){
        super(message);
    }

    /**
     * constructs an important tweet object.
     * @param message tweet message
     * @param date tweet date
     */

    ImportantTweet(String message, Date date){
       super(message,date);
    }


    @Override
    public boolean isImportant(){
        return true;
    }
}
