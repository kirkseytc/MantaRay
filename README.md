# MantaRay - "An Approach to Compressing Files"

MantaRay will save files as .ray files and will use the idea that you can use a fraction to store a string decimals that will be decoded into the file.

For Example, say our data, in decimal form, is "29296875". You can store that as the fraction "75/256" because that is equivalent to ".29296875". Then, once it reaches it's destination, it can be undone by removing the decimal point and decoded it back into the original data.

## How to Use It


## Versions
0.1: The "Barely Functional" Update - this layed out the ui for how the CLI tool would work.
=> 0.1.1: laying groundwork for the algorithm's input and output. 