# JetsProject

## Description
An app that can read pilot and jet information from a text file to be added to an array with a randomly assigned pilot. intended for use is java ver 1.8

## Technology used
Buffered input / File reader: allows app to import jet and pilot information from text files/

Array Lists: used to store the jet and pilot values and can dynamically grow and shrink based on the amount of planes added or removed

Abstract class: Ensured that all child classes had the necessary values and that they had a fly();

Interfaces: Gave certain types of jets specialized methods such as fight(); for the fighter jets

Math.random(): used to randomly assign pilots to jets when they are created

## Lessons Learned
I learned that Math.random has to be cast to an int in order to access an array list using the .get command, as well as how to randomly assign values to an object as it is being created.