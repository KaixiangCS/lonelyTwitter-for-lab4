package ca.ualberta.cs.lonelytwitter;

/**
 * Used to check if the tweet is a valid tweet.
 * @author kaixiang
 * @version 1.5
 * @see ca.ualberta.cs.lonelytwitter.NormalTweet
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 * @see ImportantTweet
 * @see TweetTooLongException
 *
 */


public interface Tweetable {
    public String getMessage();
    public void setMessage(String message) throws TweetTooLongException;
}
