package net.javajudd.modernjavaunittesting._5_Mockito;

import net.javajudd.modernjavaunittesting.DependentObject;
import net.javajudd.modernjavaunittesting.ObjectUnderTst;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class ObjectUnderTstAnnotationTest {

    @Mock
    DependentObject mockDependentObject;

    @InjectMocks
    ObjectUnderTst objectUnderTst;

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
