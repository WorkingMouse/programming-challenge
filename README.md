# Programming Challenge

This is the Pig Latin programming challenge.

The challenge is to convert an English sentence into Pig Latin.

- You can choose to complete it in JS, PHP, C# or Java.
  Choose whichever language you are most comfortable with (unless you've already been requested to use a different language)
- It should not take more than 2 hours.

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

*Using Open Git Bash*

1. Clone the repository.
   ```bash
   $ git clone https://github.com/WorkingMouse/programming-challenge.git
   $ cd programming-challenge
   ```

2. Create and checkout a branch, call it *submission*.
   ```bash
   # Inside your programming-challenge directory
   $ git checkout -b submission
   ```

3. Complete the solution for one of the languages in the `translateEnglishToPigLatin` function.  
   *You may add additional functions, imports or phrases to assist with your solution if you wish.*

4. Test your application by running it. See *Running* in the README.md for that language.

5. Commit your changes to your `submission` branch
   *Replace `<message>` with a description of your change, e.g. "Completed Solution".*
   ```bash
   # Inside your programming-challenge directory
   $ git add .
   $ git commit -m "<message>"
   ```

6. Submit your solution. See [Submission](#submission).

## Submission

**YOU WILL NOT BE ABLE TO PUSH DIRECTLY TO THIS REPOSITORY!!**

*Using Git Bash*

1. Create a patch of your work by running:  
   *Replace `<name>` with your name.*
   ```bash
   # Inside your programming-challenge directory
   $ git diff master..submission > programming-challenge-<your name>.patch
   ```

2. Reply to you programming challenge request email with your patch file `programming-challenge-<name>.patch`.
