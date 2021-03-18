import org.junit.jupiter.api.Test;
import java.util.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ResultTest {

    @Test
    void gradingStudents_InitialTest() {

        List<Integer> listgrades = Arrays.asList(4, 73, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(75, 67, 40, 33);
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestGivenStudetsNumberLow() {

        List<Integer> listgrades = Arrays.asList(-10);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = new ArrayList<>();
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestGivenStudentsNumberHigh() {

        List<Integer> listgrades = Arrays.asList(
                65, 73, 67, 38, 33, 71, 84, 1, 12, 47, 18, 60, 75, 33, 58, 36, 31, 44, 73, 22, 98,
                32, 61, 39, 30, 51, 53, 8, 19, 99, 97, 66, 89, 96, 72, 23, 83, 79, 29, 48, 45, 78,
                9, 24, 69, 49, 92, 85, 10, 20, 56, 38, 100, 52, 35, 91, 76, 63, 37, 43, 42, 56,
                43, 57, 0, 4);

        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = new ArrayList<>();
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestGivenStudentsNumberBoundryHigh() {

        List<Integer> listgrades = Arrays.asList(
                61, 73, 67, 38, 33, 71, 84, 1, 12, 47, 18, 60, 75, 33, 58, 36, 31, 44, 73, 22, 98,
                32, 61, 39, 30, 51, 53, 8, 19, 99, 97, 66, 89, 96, 72, 23, 83, 79, 29, 48, 45, 78,
                9, 24, 69, 49, 92, 85, 10, 20, 56, 38, 100, 52, 35, 91, 76, 63, 37, 43, 42);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = new ArrayList<>();
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestGivenStudentsNumberBoundryLow() {

        List<Integer> listgrades = Arrays.asList(0);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = new ArrayList<>();
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestInvalidGradeEntryLow() {

        List<Integer> listgrades = Arrays.asList(4, -10, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(null, 67, 40, 33);
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestInvalidGradeEntryHigh() {

        List<Integer> listgrades = Arrays.asList(4, 104, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(null, 67, 40, 33);
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestInvalidGradeEntryBoundryLow() {

        List<Integer> listgrades = Arrays.asList(4, -1, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(null, 67, 40, 33);
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestInvalidGradeEntryBoundryHigh() {

        List<Integer> listgrades = Arrays.asList(4, 101, 67, 38, 33);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(null, 67, 40, 33);
        assertEquals(actual, expected);
    }

    @Test
    void gradingStudents_TestInvalidGradesBoundryGeneral() {

        List<Integer> listgrades = Arrays.asList(4, 100, 0, 38, 37);
        List<Integer> actual = Result.gradingStudents(listgrades);
        List<Integer> expected = Arrays.asList(100, 0, 40, 37);
        assertEquals(actual, expected);
    }
}
