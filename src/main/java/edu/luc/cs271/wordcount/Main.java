package edu.luc.cs271.wordcount;

import java.util.*;
import java.io.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {

    try {
      // FileReader reads text files in the default encoding.
      FileReader fileReader =
              new FileReader("miserables.txt");

      // Always wrap FileReader in BufferedReader.
      BufferedReader bufferedReader =
              new BufferedReader(fileReader);

      while((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      // Always close files.
      bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
      System.out.println(
              "Unable to open file '" +
                      "miserables.txt" + "'");
    }
    catch(IOException ex) {
      System.out.println(
              "Error reading file '"
                      + "miserables" + "'");
      // Or we could just do this:
      // ex.printStackTrace();
    }

  // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");

    // TODO complete this main program
    // 1. create a WordCounter instance
    WordCounter wordy=new WordCounter(new HashMap<>());
    // 2. use this to count the words in the input
    wordy.countWords(input);
    // 3. determine the size of the resulting map
    Map<String, Integer> map2 = wordy.getCounts();
    int size = map2.size();
    // 4. create an ArrayList of that size and
    ArrayList sizes=new ArrayList(size);
    // 5. store the map's entries in it (these are of type Map.Entry<String, Integer>
    for(Map.Entry<String, Integer> entry: map2.entrySet()){
      sizes.add(entry);
    }
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)

    // 7. print the (up to) ten most frequent words in the text
  }
}
