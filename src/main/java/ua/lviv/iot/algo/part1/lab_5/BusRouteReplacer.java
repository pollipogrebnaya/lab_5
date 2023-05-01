package ua.lviv.iot.algo.part1.lab_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BusRouteReplacer {
    /**
     * Replaces the information about the bus route in the given input string
     * with "BUS_UNKNOWN".
     *
     * @param input the input string to process
     * @return the modified string with the bus route replaced
     */
    public String replaceBusRoute(final String input) {
        Pattern pattern = Pattern.compile("(?i)(bus #)(\\d{1,3})");
        Matcher matcher = pattern.matcher(input);
        String replaced = matcher.replaceAll("BUS_UNKNOWN");
        return replaced;
    }

    /**
     * Entry point. Replaces the bus route in the provided input string
     * and prints the result to the console.
     *
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        BusRouteReplacer replacer = new BusRouteReplacer();
        String input = "The bus #123 is running late.";
        String replaced = replacer.replaceBusRoute(input);
        System.out.println(replaced);
    }
}


