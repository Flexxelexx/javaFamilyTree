import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void getName() {
    // arrange

        Person test = new Person("barbara","Streisand", "female", 88);

    // act

        String result = test.getName();

    // assert

        assertEquals("barbara", result);

    }
    @Test
    public void setName() {
        // arrange

        Person test = new Person("barbara","Streisand", "female", 88);

        // act
        test.setName("hanneke");
        String result = test.getName();
        // assert

        Assertions.assertEquals("hanneke", result);

    }
    @Test
    public void getMiddleName() {
        // arrange

        Person test = new Person("henry", "Jodokus", "Gijssens", "male", 55);

        // act
        String result = test.getMiddleName();
        // assert

        Assertions.assertEquals("Jodokus", result);

    }
    @Test
    public void setMiddleName() {
        // arrange

        Person test = new Person("henry", "Jodokus", "Gijssens", "male", 55);

        // act
        test.setMiddleName("gerard");
        String result = test.getMiddleName();
        // assert

        Assertions.assertEquals("gerard", result);

    }
    @Test
    public void getLastName() {
        // arrange

        Person test = new Person("barbara","Streisand", "female", 88);

        // act
        String result = test.getLastName();
        // assert

        Assertions.assertEquals("Streisand", result);

    }
    @Test
    public void setLastName() {
        // arrange

        Person test = new Person("barbara","Streisand", "female", 88);

        // act
        test.setLastName("Ross");
        String result = test.getLastName();
        // assert

        Assertions.assertEquals("Ross", result);

    }
    @Test
    public void getSex() {
        // arrange

        Person test = new Person("Henk","Strooizand", "male", 66);
        // act

        String result = test.getSex();

        // assert

        assertEquals("male", result);

    }
    @Test
    public void setSex() {
        // arrange

        Person test = new Person("Henk","Strooizand", "male", 66);
        // act
        test.setSex("female");
        String result = test.getSex();

        // assert

        assertEquals("female", result);

    }
    @Test
    public void getAge() {
        // arrange

        Person test = new Person("Henk","Strooizand", "male", 66);

        // act

        test.getAge();

        // assert

        Assertions.assertEquals(66,66);


    }
    @Test
    public void setAge() {
        // arrange

        Person test = new Person("Henk","Strooizand", "male", 66);
        // act
        test.setAge(55);
        int result = test.getAge();

        // assert

        assertEquals(55, result);


    }
    @Test
    public void setMother() {
        // arrange
        Person mother = new Person("Gerda", "Koekmeel", "female", 90);
        Person test = new Person("barbara","Strooizand", "female", 66);
        test.setMother(mother);

        // act
        Person result = test.getMother();

        // assert

        assertEquals(mother, result);

    }
    @Test
    public void setFather() {

        Person father = new Person("Geertje", "Koekmeel", "male", 90);
        Person test = new Person("Hendrik","Strooizand", "male", 45);
        test.setFather(father);

        // act
        Person result = test.getFather();

        // assert

        assertEquals(father, result);

    }
    @Test
    public void setSiblings() {
        // arrange

        Person test = new Person("Keesje","Geisers", "male", 20);
        Person testSibling = new Person("Jantje", "Korteraar", "male", 19);
        ArrayList testList = new ArrayList<>();
        testList.add(testSibling);

        test.setSiblings(testList);

        // act
        List result = test.getSiblings();
        // assert
        assertEquals(result, testList);

    }
    @Test
    public void setChildren() {
        // arrange

        Person test = new Person("Josje","Bierput", "shemale", 19);
        Person testChildren = new Person("Jantje", "Korteraar", "male", 19);
        ArrayList testList = new ArrayList<>();
        testList.add(testChildren);

        test.setChildren(testList);

        // act
        List result = test.getChildren();
        // assert
        assertEquals(result, testList);

    }




}
