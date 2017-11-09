# Answers

### 1.Try using a TreeMap instead of a HashMap. Does this make any difference?
When I tried to use the TreeMap vs. the HashMap they both ran just fine.
The only difference I saw was the time it took to build. The HashMap's build time was a little faster than that of the TreeMap.

### 2. What happens if you invoke countWords multiple times for different String iterators?


#### 3. What crucial role does the Iterator abstraction play in making WordCounter testable?
The iterator abstraction allows us to test the WordCounter without the user inputting the words in real time.


### Report:

    `./gradlew run <lesmisrables01unkngoog_djvu.txt
    the=33282
    of=18016
    and=12849
    a=12717
    to=12454
    in=9387
    was=7788
    that=6601
    he=6202
    his=5529
`
