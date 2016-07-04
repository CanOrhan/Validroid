package uk.co.kiwisoft.validroid_examples;


import uk.co.kiwisoft.validroid.Provider;

/**
 * ToDo: Explain the scope of the class
 */
public class MyProvider implements Provider<String, MyCustomView> {

    public String provideData(MyCustomView container) {
        return container.getMyData();
    }
}
