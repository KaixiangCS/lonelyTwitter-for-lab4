package ca.ualberta.cs.lonelytwitter;

/**
 * Represents a tweet.
 * @author sheilaschoepp
 * @version 1.5
 * @see ca.ualberta.cs.lonelytwitter.NormalTweet
 * @see ca.ualberta.cs.lonelytwitter.ImportantTweet
 */

import java.util.Date;

public abstract class Tweet implements Tweetable{

    private String message;
    private Date date;


    }
    public Tweet(String message){
        this.message = message;
        date = new Date;
    }

    /**
     * construct a tweet object
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public Date getDate(){
        return date;

    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     * @param message tweet message
     * @throws TweetTooLongException thrown the tweet with more than 80 character
     */

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length() > 160){
            // throw an error
            throw new TweetTooLongException();
        }

        this.message = message;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract boolean isImportant();

    @Override
    public String toString(){
        return message;
    }
}
