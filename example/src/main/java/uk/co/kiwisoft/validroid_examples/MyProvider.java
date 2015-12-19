package uk.co.kiwisoft.validroid_examples;


import uk.co.kiwisoft.validroid.core.providers.IProvider;

/**
 * ToDo: Explain the scope of the class
 */
public class MyProvider implements IProvider<String, MyCustomView> {

    public String provideData(MyCustomView container) {
        return container.getMyData();
    }
}
