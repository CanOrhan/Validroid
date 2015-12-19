package uk.co.kiwisoft.validroid_examples;

import uk.co.kiwisoft.validroid.core.handlers.IHandler;

/**
 * ToDo: Explain the scope of the class
 */
public class MyHandler implements IHandler<MyCustomView> {

    public void handleErrorMessages(String[] errors) {
        for(String msg : errors){
            System.out.println("ERROR IN CONTAINER: " + msg);
        }
    }
}
