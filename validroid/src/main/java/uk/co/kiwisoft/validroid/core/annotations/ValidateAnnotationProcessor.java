package uk.co.kiwisoft.validroid.core.annotations;

import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * ToDo: Explain the scope of the class
 */
@SupportedAnnotationTypes(
        {"uk.co.kiwisoft.validroid.core.annotations.Validate"}
)
@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class ValidateAnnotationProcessor extends AbstractProcessor{
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        for(TypeElement annotation : annotations){
            Messager messager = processingEnv.getMessager();
            messager.printMessage(Diagnostic.Kind.NOTE, "Annotation: " + annotation.getSimpleName().toString());

        }
        return false;
    }
}
