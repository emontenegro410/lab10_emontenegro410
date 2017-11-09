package edu.luc.cs271.wordcount;

import java.util.*;
import java.io.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    Map<String, Integer> words = new HashMap<String, Integer>();
    WordCounter wordy = new WordCounter(words);
    // 2. use this to count the words in the input
    wordy.countWords(input);
    // 3. determine the size of the resulting map
    Map<String, Integer> mp = wordy.getCounts();
    int sizeOfMap = mp.size();
    // 4. create an ArrayList of that size and
    ArrayList<Map.Entry<String, Integer>> sizes = new ArrayList<>(sizeOfMap);

    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>

    sizes.addAll(wordy.getCounts().entrySet());

    // 6. sort the ArrayList in descending order by count using Collections.sort and an instance of the provided comparator (after fixing the latter)

    Collections.sort(sizes, new DescendingByCount());

    // 7. print the (up to) ten most frequent words in the text
    //   for(int i =0; i<9; i++){
    // System.out.println("TO DO");
    //  }
    if (wordy.getCounts().size() < 11) {
      for (int i = 0; i < sizes.size(); i++) {
        System.out.println(sizes.get(i));
      }
    } else {
      for (int i = 0; i < 10; i++) {
        System.out.println(sizes.get(i));
      }
    }
  }
}