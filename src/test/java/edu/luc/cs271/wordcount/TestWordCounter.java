package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestWordCounter {

  // kinda TODO complete this test class
 private WordCounter sample;

  // TODO declare a reference to the SUT (system under test), i.e., WordCounter

  @Before
  public void setUp() {
    // kinda TODO create the SUT instance
     sample=new WordCounter;
  }

  @After
  public void tearDown() {
    // kinda TODO set the SUT instance to null
    sample= null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    assertTrue(WordCounter.isEmpty());
  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    int correctCounts = WordCounter.getCount("the");
    assertEquals(correctCounts, 15);
    int correctCountsTwo = WordCounter.getCount("and");
    assertEquals(correctCountsTwo, 12);
    int correctCountsThree = WordCounter.getCount("yryty");
    assertEquals(correctCountsThree, 0);
    int correctCountsFour = WordCounter.getCount("ejiww");
    assertEquals(correctCountsFour, 0);
  }
}