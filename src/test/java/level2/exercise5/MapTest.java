package level2.exercise5;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {

    private Map map;

    @BeforeEach
    void setUp() {
        map = new Map();
        map.addStudent("Ana", 101);
        map.addStudent("Carlos", 102);
        map.addStudent("Lucía", 103);
    }

    @Test
    void testContainsExistingStudent() {

        assertTrue(map.containsStudent("Carlos"), "The map should contain Carlos");
    }

    @Test
    void testAddNewStudent() {
        String newStudentName = "Carla";
        int newStudentId = 110;

        map.addStudent(newStudentName, newStudentId);

        assertTrue(map.containsStudent(newStudentName), "The map should now contain Marta");

    }
}