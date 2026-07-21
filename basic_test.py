# ============================================================
#              PYTHON BASICS - TEST QUESTIONS
#         10 Questions Each Topic | Total: 130 Questions
#   Topics: Variables | Data Types | Operators | Input/Output
#           Strings | Conditionals | Loops | Break/Continue/Pass
#           Lists | Tuples | Sets | Dictionaries | Functions
# ============================================================


# ════════════════════════════════════════════════════════════
#  TOPIC 1 : VARIABLES  (Q1 – Q10)
# ════════════════════════════════════════════════════════════

# Q1.  Create three variables: name (string), age (integer),
#      and height (float). Print all three on a single line.

name = "Arjit"
age=20
height=5.11


# Q2.  Assign the value 10 to x. Then assign x to y.
#      Change x to 20. What is the value of y? Print and explain.
x=10
y=x
x=20
print(y)

# Q3.  Python allows multiple assignment in one line.
#      Assign a=1, b=2, c=3 in a single line and print them.
a,b,c=1,2,3
print(a,b,c)

# Q4.  Swap the values of two variables a=5 and b=10
#      WITHOUT using a third variable. Print before and after.
a=5
b=10
a,b=b,a
print(a,b)


# Q5.  Create a variable pi = 3.14159.
#      Re-assign it to the string "pi". Print its value and type.
#      What does this show about Python variables?
pi = 3.14159



# Q6.  Which of the following are valid variable names?
#      Write each one, try assigning a value, and comment why
#      the invalid ones fail:
#        2name, my_name, _secret, my-var, MyVar, class

# Q7.  Create variables x = 100, y = 200.
#      Print their values, types, and memory IDs using id().

# Q8.  Delete a variable using the del keyword.
#      Create x = 99, print it, delete it, then try to print again.
#      What error do you get?

# Q9.  Assign the same value 0 to five variables a, b, c, d, e
#      in a single line. Print all five.

# Q10. Create a variable total = 0.
#      Add 10 to it using +=, subtract 3 using -=,
#      multiply by 2 using *=. Print the final value.


# ════════════════════════════════════════════════════════════
#  TOPIC 2 : DATA TYPES  (Q11 – Q20)
# ════════════════════════════════════════════════════════════

# Q11. Create one variable of each type: int, float, str, bool,
#      list, tuple, set, dict, NoneType.
#      Print each variable and its type using type().

# Q12. What is the output of:
#        print(type(10))
#        print(type(10.0))
#        print(type("10"))
#        print(type(True))
#        print(type(None))
#      Write the answers as comments.

# Q13. Convert the following and print:
#        "123"  → integer
#        45     → float
#        3.99   → integer  (what happens to the decimal?)
#        0      → boolean
#        1      → boolean

# Q14. What is the difference between int and float in Python?
#      Write 3 examples showing operations that return each type.

# Q15. Check if a variable is of a specific type using isinstance().
#        x = 3.14
#      Check if x is int, float, and str. Print True/False for each.

# Q16. Create a variable x = "100".
#      Try to add 50 to it directly — what error occurs?
#      Then fix it with proper type conversion.

# Q17. What is the result of each expression? Write answers as comments:
#        10 / 3
#        10 // 3
#        10 % 3
#        2 ** 8
#        bool(0), bool(""), bool([])

# Q18. Create a complex number z = 3 + 4j.
#      Print its real part, imaginary part, and its type.

# Q19. Explain with examples the difference between:
#        == (equality)   and   is (identity)
#      Use two variables a = [1,2,3] and b = [1,2,3].
#      Do a == b and a is b give the same result? Why?

# Q20. What is implicit and explicit type conversion?
#      Give one example of each using int, float, and str.


# ════════════════════════════════════════════════════════════
#  TOPIC 3 : OPERATORS  (Q21 – Q30)
# ════════════════════════════════════════════════════════════

# Q21. Write a program that takes two numbers and prints:
#      their sum, difference, product, quotient, floor division,
#      modulus, and power using all arithmetic operators.

# Q22. Given a = 15, b = 4. Without running the code, predict
#      the output of each expression. Then verify:
#        a + b, a - b, a * b, a / b, a // b, a % b, a ** b

# Q23. Use comparison operators to compare x=10 and y=20.
#      Print the result of: ==, !=, >, <, >=, <=

# Q24. Use logical operators (and, or, not) to:
#      - Check if a number is between 10 and 50
#      - Check if a number is either negative or greater than 100
#      - Negate a True value

# Q25. Use assignment operators to start with x=10 and perform:
#      +=5, -=3, *=2, /=4, //=2, %=3, **=2
#      Print x after each step.

# Q26. Convert 13 to binary, octal, and hexadecimal using
#      bin(), oct(), hex(). Print all three.

# Q27. Use bitwise operators on a=12 (1100) and b=10 (1010):
#        &  (AND), |  (OR), ^  (XOR), ~  (NOT), <<  (left shift), >>  (right shift)
#      Print each result and write the binary explanation in comments.

# Q28. What is the difference between / and // in Python?
#      Give 3 examples for each and explain what happens with negatives:
#        -7 // 2  →  what is the result and why?

# Q29. Write expressions using the ternary (conditional) operator:
#      - Print "Even" or "Odd" for a number
#      - Print "Pass" or "Fail" based on marks >= 50
#      - Print "Adult" or "Minor" based on age >= 18

# Q30. Given x = 5, evaluate and write the result as comments:
#        x > 3 and x < 10
#        x == 5 or x == 6
#        not (x > 3)
#        x > 3 and x > 10
#        not x == 5


# ════════════════════════════════════════════════════════════
#  TOPIC 4 : INPUT / OUTPUT  (Q31 – Q40)
# ════════════════════════════════════════════════════════════

# Q31. Write a program that asks the user for their name
#      and prints "Hello, <name>! Welcome to Python."

# Q32. Ask the user for two numbers and print their sum.
#      Remember: input() always returns a string — handle conversion.

# Q33. Ask the user for their name, age, and city.
#      Print a formatted sentence using an f-string:
#      "My name is Arjit, I am 20 years old and I live in Delhi."

# Q34. Print the following using sep and end parameters of print():
#      - Print 1 2 3 with dashes between them: 1-2-3
#      - Print three words on the same line without newline

# Q35. Print a formatted table of 5 students with name and marks
#      using f-strings with alignment (left/right justify).
#      Use :<20 and :>5 format specifiers.

# Q36. Use print() to display:
#      - A tab-separated line using \t
#      - A newline in the middle of a string using \n
#      - A backslash using \\
#      - A quote inside a string using \"

# Q37. Ask the user for a number and print its multiplication table
#      up to 10.

# Q38. Use input() to read a list of 5 numbers separated by spaces
#      on a single line. Convert to a list of integers.
#      Print their sum, average, max, and min.
#      Hint: use .split() and list comprehension.

# Q39. Format and print the following using f-strings:
#      - pi = 3.14159265 → print with exactly 2 decimal places
#      - price = 1999    → print as ₹1,999 (with comma separator)
#      - ratio = 0.8756  → print as 87.56%

# Q40. Write a program that asks for a password using input().
#      If the password is "python123", print "Access Granted",
#      else print "Access Denied". (Real programs use getpass module)


# ════════════════════════════════════════════════════════════
#  TOPIC 5 : STRINGS  (Q41 – Q50)
# ════════════════════════════════════════════════════════════

# Q41. Create a string s = "Hello, Python World!"
#      Print:
#      - Total length
#      - First character
#      - Last character
#      - Characters from index 7 to 12

# Q42. Given s = "  hello world  "
#      Apply and print: strip(), lstrip(), rstrip(),
#      upper(), lower(), title(), capitalize()

# Q43. Given s = "Python is awesome and Python is fun"
#      - Count how many times "Python" appears
#      - Find the index of the first "Python"
#      - Replace "Python" with "Coding"

# Q44. Write a function is_palindrome(s) that checks if a string
#      is a palindrome (ignoring spaces and case).
#      Test: "racecar", "Hello", "A man a plan a canal Panama"

# Q45. Given s = "apple,banana,cherry,mango"
#      - Split into a list using split(",")
#      - Join them back with " | " separator

# Q46. Use string slicing to:
#      - Reverse a string
#      - Get every second character
#      - Get the last 5 characters
#      - Get characters from index 2 to -2

# Q47. Check the following using string methods and print True/False:
#      - "Hello123".isalnum()
#      - "Hello".isalpha()
#      - "12345".isdigit()
#      - "  ".isspace()
#      - "hello".startswith("he")
#      - "hello".endswith("lo")

# Q48. Write a program that counts the number of:
#      - Words in a sentence (use split())
#      - Vowels in a string (loop + check)
#      - Uppercase and lowercase letters

# Q49. Format the following using f-strings, .format(), and % operator:
#      Variables: name="Arjit", score=95.678
#      Print: "Student Arjit scored 95.68 marks"
#      Use all three methods and compare.

# Q50. Write a function word_frequency(s) that returns a dictionary
#      of each word and how many times it appears in the string.
#      Test: "the cat sat on the mat the cat"


# ════════════════════════════════════════════════════════════
#  TOPIC 6 : CONDITIONALS  (Q51 – Q60)
# ════════════════════════════════════════════════════════════

# Q51. Write a program that checks if a number is positive,
#      negative, or zero using if-elif-else.

# Q52. Write a program that takes marks as input and prints grade:
#      90-100 → A+
#      80-89  → A
#      70-79  → B
#      60-69  → C
#      Below 60 → Fail

# Q53. Write a program to check if a year is a leap year.
#      Rules: divisible by 4, BUT not by 100, UNLESS also by 400.
#      Test: 2000, 1900, 2024, 2023

# Q54. Write a program to find the largest among three numbers
#      using if-elif-else (do NOT use max()).

# Q55. Write a program that takes a character as input and checks:
#      - Is it a vowel or consonant?
#      - Is it uppercase or lowercase?
#      - Is it a letter, digit, or special character?

# Q56. Use a nested if to check eligibility for a loan:
#      - Age must be >= 21
#      - Salary must be >= 25000
#      - Credit score must be > 700
#      Print appropriate message for each failed condition.

# Q57. Write a program using the ternary operator to:
#      - Find max of two numbers
#      - Check if a list is empty
#      - Check if a string is empty or not

# Q58. Rewrite the following using match-case (Python 3.10+):
#      day = input("Enter day number (1-7): ")
#      Print the day name (1=Monday, 2=Tuesday ... 7=Sunday).
#      Add a default case for invalid input.

# Q59. Write a number guessing hint program:
#      secret = 42
#      Take a guess from the user.
#      Print "Too High", "Too Low", or "Correct!" accordingly.

# Q60. Write a program that checks if a number is:
#      - Divisible by both 3 and 5
#      - Divisible by 3 only
#      - Divisible by 5 only
#      - Divisible by neither
#      This is the classic FizzBuzz problem.


# ════════════════════════════════════════════════════════════
#  TOPIC 7 : LOOPS  (Q61 – Q70)
# ════════════════════════════════════════════════════════════

# Q61. Print numbers from 1 to 10 using a for loop and range().

# Q62. Print the multiplication table of a number entered by the user
#      using a while loop.

# Q63. Use a for loop to print all even numbers between 1 and 50.
#      Then do the same using a while loop.

# Q64. Write a program that calculates the sum of digits of a number.
#      Example: 1234 → 1+2+3+4 = 10
#      Use a while loop.

# Q65. Use a for loop with range() to print:
#      - Numbers 0 to 9
#      - Numbers 1 to 10
#      - Numbers 10 to 1 (countdown)
#      - Even numbers from 2 to 20
#      - Odd numbers from 1 to 19

# Q66. Write a program to find the factorial of a number using a loop.
#      Example: 5! = 5 × 4 × 3 × 2 × 1 = 120

# Q67. Use a nested for loop to print the following pattern:
#      *
#      * *
#      * * *
#      * * * *
#      * * * * *

# Q68. Write a program to print the Fibonacci sequence up to n terms
#      using a while loop. (0 1 1 2 3 5 8 13 ...)

# Q69. Use a for loop with enumerate() to print each item of a list
#      with its index number.
#      lst = ["apple", "banana", "cherry", "mango", "grape"]

# Q70. Use a for loop with zip() to pair two lists and print them.
#      names  = ["Arjit", "Rahul", "Priya"]
#      scores = [95, 87, 92]
#      Output: Arjit → 95, Rahul → 87, Priya → 92


# ════════════════════════════════════════════════════════════
#  TOPIC 8 : BREAK, CONTINUE, PASS  (Q71 – Q80)
# ════════════════════════════════════════════════════════════

# Q71. Use break to stop a loop when a specific number is found.
#      Loop from 1 to 20 and stop when you hit 13.
#      Print "Found 13! Stopping." when it breaks.

# Q72. Use continue to skip odd numbers and print only even numbers
#      from 1 to 20 using a for loop.

# Q73. Write a while loop that keeps asking the user to enter a number
#      until they enter 0. Use break to exit.
#      Print the sum of all numbers entered (excluding 0).

# Q74. Use pass inside an if block to create an empty placeholder:
#      Loop from 1 to 10. If the number is 5, pass (do nothing).
#      For all other numbers, print them.
#      Explain what pass does.

# Q75. Write a number search program:
#      numbers = [4, 7, 2, 9, 1, 5, 8, 3]
#      target = 9
#      Use a for loop with break to search for target.
#      Print "Found at index X" or "Not found".

# Q76. Use continue to print all numbers from 1 to 30
#      that are NOT divisible by 3.

# Q77. Write a menu-driven program using while True and break:
#      Options: 1-Add  2-Subtract  3-Multiply  4-Exit
#      Keep running until user enters 4.

# Q78. Use nested loops with break:
#      Outer loop: 1 to 5
#      Inner loop: 1 to 5
#      Break inner loop when inner == outer.
#      Print what gets printed.

# Q79. Use pass to define an empty function and an empty class
#      as placeholders (to be implemented later):
#      def process_data(): pass
#      class DatabaseConnector: pass
#      Explain: when would you use this in real code?

# Q80. Write a program that prints prime numbers between 1 and 50
#      using a for loop with continue (skip non-prime numbers).


# ════════════════════════════════════════════════════════════
#  TOPIC 9 : LISTS  (Q81 – Q90)
# ════════════════════════════════════════════════════════════

# Q81. Create a list of 5 numbers. Print:
#      - The whole list
#      - First and last element
#      - Length of list
#      - Sum, max, and min

# Q82. Given lst = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3]:
#      - Sort in ascending order
#      - Sort in descending order
#      - Count occurrences of 1
#      - Remove all occurrences of 5

# Q83. Write a function flatten(nested) that flattens a one-level
#      nested list into a single list.
#      Example: [[1,2],[3,4],[5,6]] → [1,2,3,4,5,6]

# Q84. Use list comprehension to create:
#      - List of squares from 1 to 10
#      - List of even numbers from 1 to 20
#      - List of words longer than 4 characters from a given sentence

# Q85. Given lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]:
#      Use slicing to get:
#      - First 5 elements
#      - Last 5 elements
#      - Every other element (step 2)
#      - Reversed list

# Q86. Write a function remove_duplicates(lst) that removes duplicates
#      while preserving the original order.
#      Example: [3,1,2,1,3,4] → [3,1,2,4]

# Q87. Write a function rotate_left(lst, k) that rotates a list
#      to the left by k positions.
#      Example: rotate_left([1,2,3,4,5], 2) → [3,4,5,1,2]

# Q88. Given two lists lst1 and lst2:
#      - Merge them
#      - Find common elements (intersection)
#      - Find elements in lst1 but not in lst2 (difference)
#      - Find all unique elements from both (union)

# Q89. Write a function second_largest(lst) that returns the
#      second largest element WITHOUT using sort() or max().

# Q90. Use the map(), filter(), and reduce() functions on a list:
#      lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#      - map: square every element
#      - filter: keep only even numbers
#      - reduce: find the product of all elements


# ════════════════════════════════════════════════════════════
#  TOPIC 10 : TUPLES  (Q91 – Q100)
# ════════════════════════════════════════════════════════════

# Q91. Create a tuple of 5 elements. Print:
#      - The whole tuple
#      - First and last element
#      - Length
#      Try to change an element — what error occurs?

# Q92. Create a tuple t = (3, 1, 4, 1, 5, 9, 2, 6, 5).
#      - Count occurrences of 1
#      - Find index of first 5
#      - Check if 9 is in the tuple

# Q93. Demonstrate tuple unpacking:
#      t = (10, 20, 30)
#      Unpack into variables a, b, c and print each.
#      Also use * (star unpacking):
#        first, *rest = (1, 2, 3, 4, 5)
#      Print first and rest.

# Q94. Create a list of tuples representing students:
#      students = [("Arjit", 20, 95), ("Rahul", 22, 87), ("Priya", 19, 92)]
#      Sort by age, then by marks (descending).
#      Use key= with lambda.

# Q95. What is the difference between a list and a tuple?
#      Write 3 differences and one example where you would
#      prefer a tuple over a list.

# Q96. Create a function that returns multiple values as a tuple.
#      Write min_max(lst) that returns (minimum, maximum) of a list.
#      Unpack the result into two variables.

# Q97. Convert between list and tuple:
#      - Create a list, convert to tuple, print type
#      - Create a tuple, convert to list, modify, convert back

# Q98. Create a tuple of tuples (like a 2D table):
#      data = ((1,"Arjit",95), (2,"Rahul",87), (3,"Priya",92))
#      Loop through and print each row in formatted output.

# Q99. Demonstrate that tuples can be used as dictionary keys
#      (because they are hashable), but lists cannot.
#      Create a dictionary where keys are coordinate tuples:
#        locations = {(28.6, 77.2): "Delhi", (19.0, 72.8): "Mumbai"}

# Q100. Write a function swap(a, b) using tuple packing/unpacking.
#       Also use tuple unpacking to swap variables directly in one line.
#       Show both methods.


# ════════════════════════════════════════════════════════════
#  TOPIC 11 : SETS  (Q101 – Q110)
# ════════════════════════════════════════════════════════════

# Q101. Create a set of 5 elements including a duplicate.
#       Print the set. What happened to the duplicate?
#       Print the type and length.

# Q102. Given:
#       A = {1, 2, 3, 4, 5}
#       B = {4, 5, 6, 7, 8}
#       Print: union, intersection, difference (A-B), (B-A),
#       and symmetric difference.

# Q103. Demonstrate set operations using methods AND operators:
#       union: A | B   AND  A.union(B)
#       intersection: A & B  AND  A.intersection(B)
#       Show both give same result.

# Q104. Use set methods: add(), remove(), discard(), pop(), clear().
#       Create a set, perform each, and print after each step.
#       What is the difference between remove() and discard()?

# Q105. Check membership using in and not in:
#       s = {10, 20, 30, 40, 50}
#       Check if 30, 99, 10 are in the set.
#       Also use issubset(), issuperset(), isdisjoint().

# Q106. Convert a list with duplicates to a set to remove duplicates,
#       then convert back to a sorted list.
#       lst = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]

# Q107. Create a frozenset and demonstrate that it cannot be modified.
#       Show it can be used as a dictionary key (unlike a regular set).

# Q108. Find common elements between three sets using intersection.
#       A = {1,2,3,4,5}, B = {2,3,4,6,7}, C = {3,4,8,9}
#       Print: common in all three.

# Q109. Write a function find_unique(lst1, lst2) that returns elements
#       that appear in only one of the two lists (symmetric difference).
#       Example: [1,2,3,4], [3,4,5,6] → {1, 2, 5, 6}

# Q110. Demonstrate that sets are unordered:
#       Create a set with 10 numbers and print it multiple times.
#       Show you cannot access elements by index.
#       How do you loop through a set?


# ════════════════════════════════════════════════════════════
#  TOPIC 12 : DICTIONARIES  (Q111 – Q120)
# ════════════════════════════════════════════════════════════

# Q111. Create a dictionary of 5 students with name as key and marks as value.
#       Print all keys, all values, and all key-value pairs.

# Q112. Perform the following on a dictionary:
#       - Add a new key-value pair
#       - Update an existing value
#       - Delete a key using del
#       - Delete and return a value using pop()
#       - Clear the entire dictionary

# Q113. Use dictionary methods:
#       d.get(key)         → vs d[key] — what's the difference?
#       d.keys()           → print all keys
#       d.values()         → print all values
#       d.items()          → print all pairs
#       d.update(another_dict) → merge

# Q114. Loop through a dictionary and print each key and value
#       using a for loop with .items().
#       Then find the key with the maximum value.

# Q115. Write a function word_count(sentence) that returns a dictionary
#       of each word and its frequency.
#       Example: "the cat sat on the mat" → {"the":2, "cat":1, ...}

# Q116. Create a nested dictionary to store student information:
#       students = {
#           "Arjit": {"age": 20, "grade": "A", "city": "Delhi"},
#           "Rahul": {"age": 22, "grade": "B", "city": "Mumbai"}
#       }
#       Access and print each student's grade.

# Q117. Use dictionary comprehension to create:
#       - Squares: {1:1, 2:4, 3:9, 4:16, 5:25}
#       - Filtered: keep only items where value > 3

# Q118. Write a function invert_dict(d) that swaps keys and values.
#       Example: {"a":1, "b":2} → {1:"a", 2:"b"}
#       What happens if two keys have the same value?

# Q119. Use defaultdict from the collections module to group
#       a list of (name, city) tuples by city.
#       people = [("Arjit","Delhi"), ("Rahul","Mumbai"),
#                 ("Priya","Delhi"), ("Neha","Mumbai")]

# Q120. Write a function merge_dicts(*dicts) that merges any number
#       of dictionaries. Later keys override earlier ones.
#       Example: merge_dicts({a:1},{a:2,b:3},{c:4}) → {a:2,b:3,c:4}


# ════════════════════════════════════════════════════════════
#  TOPIC 13 : FUNCTIONS  (Q121 – Q130)
# ════════════════════════════════════════════════════════════

# Q121. Write a function greet(name) that returns "Hello, <name>!".
#       Call it with your name and print the result.

# Q122. Write a function calculator(a, b, op="+") with a default
#       argument for the operator. Support +, -, *, /.
#       Call it with and without the op argument.

# Q123. Write a function that accepts *args (variable positional arguments)
#       to calculate the sum of any number of numbers.
#       Example: total(1,2,3,4,5) → 15

# Q124. Write a function that accepts **kwargs (variable keyword arguments)
#       and prints each key-value pair.
#       Example: display(name="Arjit", age=20, city="Delhi")

# Q125. Write a function is_prime(n) that returns True if n is prime.
#       Use it with filter() to get all primes between 1 and 50.

# Q126. Write a recursive function factorial(n) that returns n!
#       Also write an iterative version and compare both.

# Q127. Write a recursive function fibonacci(n) that returns the
#       nth Fibonacci number.
#       Then improve it using memoization (store results in a dict).

# Q128. Create and use lambda functions for:
#       - Square of a number
#       - Check if a number is even
#       - Sort a list of tuples by second element
#       - Convert Celsius to Fahrenheit

# Q129. Write a function make_multiplier(n) that returns a function
#       which multiplies its input by n. (Closure)
#       Example: triple = make_multiplier(3); triple(5) → 15

# Q130. Write a decorator @timer that measures and prints the
#       execution time of any function it decorates.
#       Apply it to a function that calculates the sum of 1 to 1000000.
