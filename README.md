#MantaRay - "An Approach to Compressing Files"

MantaRay will save files as .ray files and will use the idea that you can use a fraction to store a string decimals that will be decoded into the file.

i.e.

Say our data in decimal form is "29296875". You can store that as the fraction "75/256" because that is equivalent to ".29296875".
Then, once it reaches it's destination, it can be undone by removing the decimal point and decoded back in to data.