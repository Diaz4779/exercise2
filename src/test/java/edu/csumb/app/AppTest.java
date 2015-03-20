package edu.csumb.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class AppTest {

    @Test
    public void thisAlwaysPasses() {

    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }

    @Test
    public void groupsHaveThreePeople() {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        Generator generator = new App(names);
        List<String> group = generator.createGroup("a");
        assertEquals(group.size(), 3);
    }

    @Test
    public void givenUsernameIsInGroup() {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        Generator generator = new App(names);
        String name = "a";
        List<String> group = generator.createGroup(name);
        assertEquals(group.contains(name), true);
    }

    @Test
    public void groupsHaveConsistentMembership() {
        List<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");
        names.add("e");
        names.add("f");
        Generator generator = new App(names);
        List<String> actualA = generator.createGroup("a");
        List<String> actualB = generator.createGroup("b");
        List<String> actualC = generator.createGroup("c");
        List<String> expected = new ArrayList<String>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        assertEquals(actualA, expected);
        assertEquals(actualB, expected);
        assertEquals(actualC, expected);
    }
}
