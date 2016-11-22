Introduction. Home Work 2
=============

[![Join the chat at https://gitter.im/changerequest/introduction.hw2](https://badges.gitter.im/changerequest/introduction.hw2.svg)](https://gitter.im/changerequest/introduction.hw2?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)
1\. Make tags
-------------
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
Given tag and word strings, create the HTML string with tags around the word, 
e.g.: `<i>Yay</i>`

##### Examples
```
makeTags(";","Text 2") -> "<;>Text 2</;>"
```

2\. firstTwo
-------------
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". 
If the string is shorter than length 2, return whatever there is, 
so "X" yields "X", and the empty string "" yields the empty string "".

##### Examples
```
firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"
```

3\. comboString
-------------
Given 2 strings, a and b, return a string of the form short+long+short, 
with the shorter string on the outside and the longer string on the inside. 
The strings will not be the same length, but they may be empty (length 0).

##### Examples
```
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
```

4\. improved charAt
-------------
Given a string and an index, return char of string at the given index position.

If index is negative - start from the end of string.

If index is bigger(or for negative - smaller) than string length - loop over string characters again.

If string is `null` - return `"null"`.

##### Examples
```
charAt("Hello", 0) -> "H"
charAt("Hello", -1) -> "o"
charAt("Hello", -6) -> "o"
charAt("Hello", 6) -> "e"
```

5\. commonEnd
-------------
Given 2 arrays of ints, a and b, return true if their first or last elements are same. 
Both arrays will have 1 or more elements.

##### Examples
```
commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
commonEnd([3,4,5], [1,2,3]) → true
```

6\. reverse
-------------
Given an array of ints, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

##### Examples
```
reverse([1, 2, 3]) → [3, 2, 1]
reverse([5, 11, 9]) → [9, 11, 5]
reverse([7, 0, 0, 1]) → [1, 0, 0, 7]
```

7\. countEvens
-------------
Return the number of even ints in the given array. (`0` is also even)

##### Examples
```
countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, -5]) → 0
```

8\. evenOdd
-------------
Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Order of numbers should be preserved.

##### Examples
```
evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
evenOdd([2, 6, 4, 3, 1, 5, 8, 10] → [2, 6, 4, 8, 10, 3, 1, 5]
```

9\. Extract data from URL
-------------
Parse given URL and extract `scheme`, `host` and `port`. Return an array with extracted data
in following order: `['scheme', 'host', 'port']`.

If any of returning parameters could not be identified - return empty string for that parameter.

##### Examples
```
extractData("http://www.trarara.com/posts) -> ["http","www.tratata.com",""]
extractData("ftp://example.com:20) -> ["ftp","example.com","20"]
extractData("www.example.com) -> ["","www.example.com",""]
```

10\. Trim whitespaces from start and end of line
-------------
Return given text, without leading and trailing whitespaces in each line. 
Be sure not to remove whitespaces inside sentences.

Do not use String.trim() method. Implement your own solution based on Regexp.

##### Examples
```
trim("      Text is     here.     ") -> "Text is     here."
trim("") -> ""
trim("Text") -> "Text"
```
