## SoundCheck
This project is an effort to sample _Taan_ from a given _Raag_. Now, the meanings of the words _Taan_ and _Raag_ in the context of this project are given later on. Here I will just try to describe the content and aim of this project in a nutshell. The content is two-folds.

1. A scripting language is defined, using which the user can provide a _Raag_. I will talk about what this exactly means later on.
2. Some algorithms have been decided upon to be used for generating _Taan_ for this _Raag_. Though, these algorithms will have to be improved to improve the performance and basically has to move toward solving the problem, "What capacities enable human beings to generate _Taan_ for a given _Raag_ ?".

---
## How to use it ?
Now, this is a maven project. So to use this project one has to have a maven build environment installed in the system. Now if that is present 
- download the project, create a file in the src/test/raag_files folder with .raag extension and enter the necessary code (there are examples in the folder, much more of what one has to know about the syntax of the scripting language is given below). 
- Then copy the relative path of the file and put it as the parameter of the Launcher.play function call in the Play.java file of src/main/java folder. 
- Then run the application to see the performance for yourself.

---
## Some terms to look at
### Raag
It is hard to explain what a raag is. Exponents of the Indian classical music tradition have been unanimously of this opinion. Now I here will try to define the subject as interpreted in this project. Here the _Raag_ is interpreted as a hierarchical recursive syntactic structure with musical notes as terminals. A _Raag_ in my view is an infinite set of distinct sequences of notes. And the only way to capture and represent an infinite set of sequences is to have a generative structure. So a _Raag_ here is essentially a generative structure.

### Taan
A _Taan_ is basically a sequence of notes sampled from a _Raag_ and distributed over a given bit scheme or _Taal_.

### Arohan and Avarohan
Every _Raag_ as an arohan and an avarohan. These are basically the subset of 12 notes that the _Raag_ uses while ascending, _Arohan_ or descending, _Avarohan_. These sometimes may also have patterns, which is beyond the current scope of this project.

### Palta
Now, given the _Arohan_ and _Avarohan_ of a particular _Raag_, we can declare numerical patterns, _Palta_. Now depending on the _Arohan_ and _Avarohan_ these patterns can be applied to specific notes to get respective sequences of notes. We will see how exactly this works.

---
## Describing the scripting language
Now let's take a more intricate look into the first objective of the project. Now hierarchically speaking a .raag file should have three components. **Declarations**, An optional **Scheme Block**, an optional **Rule Space**.

### Declarations
The declarations are a set of parameters that are mentioned to describe some features associated with processing the _Raag_(syntax) and the subsequent operations related to generation of _Taan_(sequence or notes). This component constitute the header of a .raag file. Some declarations are obligatory and others are optional.

#### list of obligatory declarations include
- beatsPerCycle (number): This parameter mentions the beat scheme or _Taal_, i.e., the number of beats in one cycle.
- numCycles (number): This parameter mentions the number of cycles the notes have to be played for.
- Range (string): This is the parameter used to mention the range for the **scaling** feature.

#### list of optional declarations include
- outFile (string): This feature is for the name of the .syntax file. Default value is "final".
- Start (string): This feature is for mentioning the root component or rule for the syntax. The default value is "Start".
- baseFrequency (decimal): This feature is to mention the base frequency while playing. This basically relates to the frequency of the note "Sa". The default value is 360.0.
- msec (number): This feature is to mention the number of milli-seconds each note will be played for. The default value is 140.
- volume (decimal \- 0.0 to 1.0): This feature is to mention the volume at which the notes will be played. The default value is 0.2.
- playFile (string): This feature is for the name of the .player file. It records the ongoings inside a player. There is no default value. If not provided the file won't be generated.

The following is a demonstration of how the declarations happen.
```
beatsPerCycle: 16;
numCycles: 10;
Range: ma_-ma*;
outFile: final;
Start: start;
baseFrequency: 440.00;
msec: 150;
volume: 0.5;
playFile: player_log
```

### Scheme Block (Palta)
This is the part where the _Paltas_ are declared.
At the beginning we declare the _Arohan_ and _Avarohan_ in a block called **sargam (octave)**. And then the series of paltas are declared. The declaration of _Avarohan_ in the sargam block is optional. If it is not declared, it is internally assumed as the reverse of _Arohan_. The following is an example of how a typical scheme block looks like.

```
palta {
    sargam {
        arohan : Sa, ga, ma, dha, ni;
    }

    paltaUp -> 1232, 1.0 | 1123, 1.0 | 21243432, 1.0 | (123, 4), 1.0;
    paltaDown -> (321, 4), 1.0;
}
```

Above is the scheme block for a _Raag_ named **Malkauns**. Now Malkauns happens to be a _Raag_ with _Arohan_ and _Avarohan_ having the same set of notes. So they were not separately mentioned. But for a _Raag_ like **Desh** one would have to mention the _Avarohan_ separately, like the following.

```
sargam {
    arohan : Sa, Re, ma, Pa, Ni;
    avarohan : Sa*, ni, Dha, Pa, ma, Ga, Re;
}
```

The next aspect to look at is the way the _Paltas_ have been declared. Each _Palta_ has a number of options, each with associated probability. Each time a _Palta_ is called one of these options will be chosen. Now the options are also of two kinds:

1. The first is a **simple scheme**
2. The second is what is called a **combinator scheme**.

The combinator scheme is basically a set of numbers and a sample space, **n**, for which a simple scheme is built randomly every time that option is chosen.

Now let's look at a practical scenario to explain the working of _Paltas_.
Lets take the _Palta_, **paltaUp** from the example of malkauns, and let's say, at a particular instant the third option is chosen, which is: [21243432, 1.0]. Now if this _Palta_ is called on the note **ga** by the expression, **paltaUp(ga)**, the sequence produced will be, [ga, Sa, ga, dha, ma, dha, ma, ga].

### Rule Space (Rules)
Now, as hinted earlier, here a _Raag_ is assumed to be a **Context Free Grammar** (though this assumption may change later on) with a particular kind of predicate associated with each rule. These predicates are basically probabilities, which work as hints for the machine during derivation of the rules. The _Raag_ on the other hand is basically an infinite set of sequences of notes (or viable notes) that is identified through the **CFG**.
The rule space always starts with a "Start" symbol or rule. A typical example of a rule space is the following.

```
Start -> SaFirst, 1.0 
       | gaFirst, 1.0 
       | SaFirst*, 1.0;
       
SaFirst -> paltaUp(Sa)-gaFirst, 1.0 
         | paltaDown(Sa)-niFirst_, 1.0 
         | paltaUp(Sa)-maFirst, 0.5 
         | paltaDown(Sa)-dhaFirst_, 0.5;
         
gaFirst -> paltaUp(ga)-maFirst, 1.0 
         | paltaDown(ga)-SaFirst, 1.0 
         | paltaUp(ga)-dhaFirst, 0.5 
         | paltaDown(ga)-niFirst_, 0.5;
         
maFirst -> paltaDown(ma)-gaFirst, 1.0 
         | paltaUp(ma)-dhaFirst, 1.0 
         | paltaDown(ma)-niFirst, 0.5 
         | paltaUp(ma)-SaFirst, 0.5;
         
dhaFirst -> paltaUp(dha)-niFirst, 1.0 
          | paltaDown(dha)-maFirst, 1.0 
          | paltaUp(dha)-SaFirst*, 0.5 
          | paltaDown(dha)-gaFirst, 0.5;
          
niFirst -> paltaUp(ni)-SaFirst*, 1.0 
         | paltaDown(ni)-dhaFirst, 1.0 
         | paltaUp(ni)-gaFirst*, 0.5 
         | paltaDown(ni)-maFirst, 0.5;
```

Now an important feature to look at over here is, **scaling** (as I call it).
Now, in practical situations, while playing a taan it is quite seldom that the artist restricts the notes within just an octave. So in that manner if we want to declare the syntax of a particular _Raag_ we will have to hard code all the rules for the range we decide upon. That will make necessary a lot of repetitive coding as we may have to declare in some cases the same rule for three octaves seperately. 

But that is not required as we have the feature of **scaling**. Here to mention the next octave or previous octave counterpart of a pre-defined or post-defined rule, we just need to append a "\*" or an "\_", respectively, to it. After using this feature we can mention the notes of the lowest and highest pitch in declarations' "range" domain and the syntax will be scaled accordingly, as in the signature defined for initially will be replicated without any loss across the mentioned range. 

Although I think it is important to mention that this feature does not work the other way round. So if we declare a rule only in the higher octave, with a "\*" appended, we can't expect that to be replicated in the lower octaves according to the mentioned range.

After the scaling happens in the directory of the ".raag" file, a file with ".syntax" extension is produced which contains the scaled version of the whole syntax or _Raag_. An example of the above syntax being scaled, is the following.

```
Start -> SaFirst, 1.0 | gaFirst, 1.0 | SaFirst*, 1.0;
SaFirst -> paltaUp(Sa)-gaFirst, 1.0 | paltaUp(Sa)-maFirst, 0.5 | paltaDown(Sa)-dhaFirst_, 0.5 | paltaDown(Sa)-niFirst_, 1.0;
gaFirst -> paltaDown(ga)-niFirst_, 0.5 | paltaUp(ga)-maFirst, 1.0 | paltaUp(ga)-dhaFirst, 0.5 | paltaDown(ga)-SaFirst, 1.0;
SaFirst* -> paltaUp(Sa*)-gaFirst*, 1.0 | paltaUp(Sa*)-maFirst*, 0.5 | paltaDown(Sa*)-niFirst, 1.0 | paltaDown(Sa*)-dhaFirst, 0.5;
maFirst -> paltaUp(ma)-SaFirst, 0.5 | paltaDown(ma)-gaFirst, 1.0 | paltaUp(ma)-dhaFirst, 1.0 | paltaDown(ma)-niFirst, 0.5;
dhaFirst_ -> paltaDown(dha_)-maFirst_, 1.0 | paltaUp(dha_)-SaFirst, 0.5 | paltaUp(dha_)-niFirst_, 1.0;
niFirst_ -> paltaUp(ni_)-gaFirst, 0.5 | paltaDown(ni_)-maFirst_, 0.5 | paltaDown(ni_)-dhaFirst_, 1.0 | paltaUp(ni_)-SaFirst, 1.0;
dhaFirst -> paltaUp(dha)-SaFirst*, 0.5 | paltaDown(dha)-maFirst, 1.0 | paltaUp(dha)-niFirst, 1.0 | paltaDown(dha)-gaFirst, 0.5;
gaFirst* -> paltaUp(ga*)-maFirst*, 1.0 | paltaDown(ga*)-niFirst, 0.5 | paltaDown(ga*)-SaFirst*, 1.0;
maFirst* -> paltaDown(ma*)-gaFirst*, 1.0 | paltaUp(ma*)-SaFirst*, 0.5;
niFirst -> paltaUp(ni)-SaFirst*, 1.0 | paltaDown(ni)-dhaFirst, 1.0 | paltaDown(ni)-maFirst, 0.5 | paltaUp(ni)-gaFirst*, 0.5;
maFirst_ -> paltaUp(ma_)-dhaFirst_, 1.0 | paltaDown(ma_)-niFirst_, 0.5;
```