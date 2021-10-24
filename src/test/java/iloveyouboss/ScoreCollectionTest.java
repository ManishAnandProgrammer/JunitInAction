package iloveyouboss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScoreCollectionTest {

    @Test
    public void arithmeticMeanOfTwoNumbers() {
        // arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // act
        int actualResult = collection.arithmeticMean();

        // assert
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);

    }
}