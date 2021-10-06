package net.javajudd.modernjavaunittesting;

public class RealDependentObject implements DependentObject {

    @Override
    public String doSomething(String param1, String param2) {
        return param1 + param2;
    }
}
