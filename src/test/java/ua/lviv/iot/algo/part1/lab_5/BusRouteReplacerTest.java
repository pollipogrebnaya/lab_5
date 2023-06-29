package ua.lviv.iot.algo.part1.lab_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusRouteReplacerTest {
    private BusRouteReplacer replacer;

    @BeforeEach
    public void setup() {
        replacer = new BusRouteReplacer();
    }

    @Test
    public void testReplaceBusRoute() {
        // Arrange
        String input = "The bus #123 is running late.";
        String expected = "The BUS_UNKNOWN is running late.";

        // Act
        String result = replacer.replaceBusRoute(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceBusRoute_CaseInsensitive() {
        // Arrange
        String input = "The BuS #456 is arriving soon.";
        String expected = "The BUS_UNKNOWN is arriving soon.";

        // Act
        String result = replacer.replaceBusRoute(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceBusRoute_SingleDigitNumber() {
        // Arrange
        String input = "The bus #9 is on time.";
        String expected = "The BUS_UNKNOWN is on time.";

        // Act
        String result = replacer.replaceBusRoute(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceBusRoute_ThreeDigitNumber() {
        // Arrange
        String input = "The bus #789 is crowded.";
        String expected = "The BUS_UNKNOWN is crowded.";

        // Act
        String result = replacer.replaceBusRoute(input);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    public void testReplaceBusRoute_NoMatch() {
        // Arrange
        String input = "There are no bus routes in this area.";
        String expected = "There are no bus routes in this area.";

        // Act
        String result = replacer.replaceBusRoute(input);

        // Assert
        assertEquals(expected, result);
    }
}

