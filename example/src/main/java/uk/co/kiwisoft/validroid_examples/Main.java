package uk.co.kiwisoft.validroid_examples;

import uk.co.kiwisoft.validroid.core.CoreValidationRunner;
import uk.co.kiwisoft.validroid.core.WorkContainer;
import uk.co.kiwisoft.validroid_examples.validators.EmailValidator;
import uk.co.kiwisoft.validroid_examples.validators.LengthValidator;

public class Main {
    public static void main(String[] args) {
        MyCustomView view = new MyCustomView("");

        WorkContainer<MyCustomView, String> emailWorkContainer =
                new WorkContainer<MyCustomView, String>(view,
                        new MyProvider(),
                        new EmailValidator(),
                        new MyHandler());

        WorkContainer<MyCustomView, String> lengthWorkContainer =
                new WorkContainer<MyCustomView, String>(view,
                        new MyProvider(),
                        new LengthValidator(),
                        new MyHandler());

        CoreValidationRunner vr = new CoreValidationRunner();
        vr.addWork(emailWorkContainer);
        vr.addWork(lengthWorkContainer);

        if (vr.validate()) {
            System.out.println("Valid email address");
        } // Invalid states are handled by IHandlers

    }
}
