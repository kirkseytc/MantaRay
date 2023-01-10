# MantaRay - "An Approach to Compressing Files"

MantaRay will save files as .ray files and will use the idea that you can use a fraction to store a string decimals that will be decoded into the file.

For Example, say our data, in decimal form, is "29296875". You can store that as the fraction "75/256" because that is equivalent to ".29296875". Then, once it reaches it's destination, it can be undone by removing the decimal point and decoded it back into the original data.

## How to Use It

To use MantaRay, open a Terminal* and type the command:
```bash
java --version
```
to check if you have java installed. if you do not, the link to the download is right [here](https://www.java.com/en/download/).
Once you have java installed, open another Terminal* (or cd) in the location of the mantaRay.jar file. 
Then to run the application, type the command:
```bash
java -jar mantaRay.jar
```
Once the application is finished being ran, you can either close the Terminal* window or type the command:
```bash
exit
```
*or Command Prompt

## Versions
>0.1: The "Barely Functional" Update - this layed out the ui for how the CLI tool would work. 
> >0.1.1: laying groundwork for the algorithm's input and output. 