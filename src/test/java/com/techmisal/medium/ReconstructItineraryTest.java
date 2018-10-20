package com.techmisal.medium;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ReconstructItineraryTest {

    private ReconstructItinerary reconstructItinerary = new ReconstructItinerary();

    @Test
    public void example1() {
        String[][] input = new String[][] {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
        List<String> expected = Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC");
        Assert.assertEquals(expected, reconstructItinerary.findItinerary(input));
    }

    @Test
    public void example2() {
        String[][] input = new String[][] {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        List<String> expected = Arrays.asList("JFK","ATL","JFK","SFO","ATL","SFO");
        Assert.assertEquals(expected, reconstructItinerary.findItinerary(input));
    }

    @Test
    public void example3() {
        String[][] input = new String[][] {{"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"}};
        List<String> expected = Arrays.asList("JFK","NRT","JFK","KUL");
        Assert.assertEquals(expected, reconstructItinerary.findItinerary(input));
    }

}