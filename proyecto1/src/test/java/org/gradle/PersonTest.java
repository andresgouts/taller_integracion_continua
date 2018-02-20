package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

import org.gradle.domain.Person;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry","paige");
        assertEquals("Larry", person.getName());
    }
}
