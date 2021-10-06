package net.javajudd.modernjavaunittesting._5_Mockito;

import net.javajudd.modernjavaunittesting.DependentObject;
import net.javajudd.modernjavaunittesting.ObjectUnderTst;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

public class ObjectUnderTstProgrammaticTest {

    private DependentObject mockDependentObject;
    private ObjectUnderTst objectUnderTst;

    @BeforeEach
    void setUp() {
        mockDependentObject = Mockito.mock(DependentObject.class);
        objectUnderTst = new ObjectUnderTst(mockDependentObject);
    }

    @Test
    void stub() {
        Mockito.when(mockDependentObject.doSomething(anyString(), any())).thenReturn("x");

        assertEquals("xxx", objectUnderTst.performAction(List.of("one", "two", "three")));
    }

    @Test
    void mock() { ;
        Mockito.when(mockDependentObject.doSomething("action", "one")).thenReturn("o");
        Mockito.when(mockDependentObject.doSomething("action", "two")).thenReturn("t");
        Mockito.when(mockDependentObject.doSomething("action", "three")).thenReturn("r");

        assertEquals("otr", objectUnderTst.performAction(List.of("one", "two", "three")));

        Mockito.verify(mockDependentObject).doSomething("action", "one");
        Mockito.verify(mockDependentObject).doSomething("action", "two");
        Mockito.verify(mockDependentObject).doSomething("action", "three");
    }

}
