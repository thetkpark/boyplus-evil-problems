
## CSC102 Quiz#4 2019 RNA   

#### Difficulty: `Low`

- - -

### Description

> Professor Cecil is a biologist who works in the field of genetics. One day a set of mysterious RNA sample was sent to her lab. She successfully processed these samples and stored it as simple strings. Unfortunately, the service that helps her process stored data is offline, so she came to SIT for help. Professor Cecil sees the potential in you and asked you to write a program to count the amount of certain amino acids in her sample data.
> 
>One RNA strand contains N amino acids and is represented by a string with length of 3N. Each amino acid is represented by 3 nucleotides represented by letter U, C, A and G. Combinations of these letter can be looked up at the table below.
> 
>![enter image description here](https://github.com/thetkpark/boyplus-evil-problems/raw/master/69-RNA/RNA.png)

### Input

>The input contains one line representing the RNA string with length of 3 <= 3N <= 300.

### Output

> The output is the list representing the amount of amino acids for each type in the following order:
Leucine, Proline, Histidine, Glutamine, and Arginine.

### Sample I/O

| Input             | Output |
| ----------------- | ------ |
| CUGCGGCCACACCCUCACCGUCAUCGA| 1 2 3 0 3     |
