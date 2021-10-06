package net.javajudd.modernjavaunittesting._5_Mockito;

import net.javajudd.modernjavaunittesting.DependentObject;
import net.javajudd.modernjavaunittesting.ObjectUnderTst;
import net.javajudd.modernjavaunittesting.RealDependentObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ObjectUnderTstSpyTest {

    @Spy
    DependentObject spiedDependentObject = new RealDependentObject();

    @InjectMocks
    ObjectUnderTst objectUnderTst;

    @Test
    void real() {
        assertEquals("actiononeactiontwoactionthree", objectUnderTst.performAction(List.of("one", "two", "three")));
    }

    @Test
    void spy() { ;
        Mockito.when(spiedDependentObject.doSomething("action", "one")).thenReturn("o");
        Mockito.when(spiedDependentObject.doSomething("action", "two")).thenReturn("t");
        Mockito.when(spiedDependentObject.doSomething("action", "three")).thenReturn("r");

        assertEquals("otr", objectUnderTst.performAction(List.of("one", "two", "three")));

        Mockito.verify(spiedDependentObject).doSomething("action", "one");
        Mockito.verify(spiedDependentObject).doSomething("action", "two");
        Mockito.verify(spiedDependentObject).doSomething("action", "three");
    }

}
