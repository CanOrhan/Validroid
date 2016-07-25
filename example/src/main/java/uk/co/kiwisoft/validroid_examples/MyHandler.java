package uk.co.kiwisoft.validroid_examples;

import uk.co.kiwisoft.validroid.Handler;

/**
 * ToDo: Explain the scope of the class
 */
public class MyHandler implements Handler {

    public void handleErrorMessages(String[] errors) {
        for (String msg : errors) {
            System.out.println("ERROR IN CONTAINER: " + msg);
        }
    }
}
