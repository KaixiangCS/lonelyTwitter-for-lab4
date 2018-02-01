/*
 * Copyright (c) 2018 Team X,CMPUT 301, University of Alberta-All Rights Reserved.
 *  You may use distribute or modify this code under terms and conditions of the code of student behavior at U of A.
 *  You can find a copy of the licence in this project. Otherwise please contact kaixiang@ualberta.ca
 */

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

public class NormalTweet extends Tweet {
    NormalTweet(String message){
        super(message);

    }

    /**
     * constructs a normal tweet object.
     * @param message tweet message
     * @param date tweet date
     */

    NormalTweet(String message, Date date){
        super(message,date);
    }

    @Override
    public boolean isImportant(){
        return false;
    }
}
