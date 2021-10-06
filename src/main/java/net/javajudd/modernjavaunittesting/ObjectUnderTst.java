package net.javajudd.modernjavaunittesting;

import java.util.List;

public class ObjectUnderTst {

    DependentObject dependentObject;

    public ObjectUnderTst(DependentObject dependentObject) {
        this.dependentObject = dependentObject;
    }

    public String performAction(List<String> items) {
        StringBuffer result = new StringBuffer();
        items.forEach(item ->
           result.append(dependentObject.doSomething("action", item))
        );

        return result.toString();
    }
}
