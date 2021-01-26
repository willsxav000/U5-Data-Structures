# Unit 5 - Data Structures

## [L2 Sandbox][sandbox]

## Enhanced For Loop

For Loops and Arrays are like peanut butter and jelly, hot dogs and bonfires, and nachos and cheese. Because of this, there is a special for loop just for processing arrays. 

CONDITION: This for-loop only works if you are processing EVERY element in the array. So it's super nice for outputting the data in the array and can be used for many other things, just make sure that you are doing the same computation for each and every array element. 

So this enhanced for-loop could not be used to output the months and days like in the previous examples. 

### Example

```java
int[] arr = {4, 5, 6, 7, 8};

for(int number: arr){
    System.out.println(number);
}
```

First, this for loop is already designed to loop through each element in the array declared after the `:`. 

Then it does this:  `number = arr[i];`   So it assigns the value at the index to the variable `number`. Remember, number can be any variable name you want.

Next it executes the code block, which in this case is just an output line. 

It then increases i, and repeats the assignment and code execution. 


### Example

Create an array of every even number from 1 to 20 and output three times the value in each index. 

Let's go to the [**Sandbox**][sandbox]

## Exercises

1. Prompt the user to enter 5 names, then output those names. 

2. An employee works 5 days a week at $9.50/hour. Prompt the user to enter their hours worked for a month and output their weekly income totals.


[sandbox]: ../L3-For%20Each%20Loop/src/Main.java