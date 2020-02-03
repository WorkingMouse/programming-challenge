# Programming Challenge

This is the Pig Latin programming challenge.

The challenge is to convert an English sentence into Pig Latin.

- You can choose to complete it in JS, PHP, or C#.
  Choose whichever language you are most comfortable with.
- It should not take more than 1 hour.

## Description

Pig Latin takes the first consonant (or consonant cluster) of an English word, moves it to the end of the word and appends an "ay". If a word begins with a vowel you just append "way".

**Examples**

| English   | Pig Latin   |
|-----------|-------------|
| hello     | ellohay     |
| shellfish | ellfishshay |
| envelope  | envelopeway |

**Bonus Challenge (Optional)**

Restore the first letter case of the Pig Latin word to match the English word.

## Getting Started

1. Clone the repository.
   ```bash
   $ git clone https://github.com/WorkingMouse/programming-challenge.git
   $ cd programming-challenge
   ```

2. Create a branch, call it *submission*.
   ```bash
   # Inside your programming-challenge directory
   $ git checkout -b submission
   ```

2. Complete the solution for one of the languages in the `translateEnglishToPigLatin` function.
   *You may add additional functions to assist with your solution if you wish.*

3. Test your application by running it. See *Running* in the README.md for that language.

4. Submit your solution. See [Submission](#submission).

## Submission

**YOU WILL NOT BE ABLE TO PUSH DIRECTLY TO THIS REPOSITORY!!**

1. Create a patch of your work by running:
   ```bash
   # Inside your programming-challenge directory
   $ rm programming-challenge.patch
   $ git diff master..submission > programming-challenge.patch
   ```

2. Email your patch file (`programming-challenge.patch`) to [hr@workingmouse.com.au](mailto:hr@workingmouse.com.au).
