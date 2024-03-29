Hello all 

This project was my thesis project, and it's been much while since I dealt with it. 8 years ! :)

Regarding the rising era of the game technologies, I decided to have a look at the project because of some coincidences that 
I faced this week (06.08.2022). 

I have added required dependencies and some documentation telling how you can run this project with your PD patches 
and get some dsp code written for Faust.

If you have any questions, please fire an **Issue**.

## Introduction
Mephisto is a transpiler for converting sound patches designed using the graphical computer music 
environment Pure Data to the functional DSP programming language Faust. Faust itself compiles into 
highly-optimized C++ code. The aim of the transpiler is to enable creating highly optimized C++ code 
embeddable in games or other interactive media for sound designers, musicians and sound engineers using 
PureData in their workflows and to reduce the prototype-to-product delay.

PD and Max/MSP softwares are widely used for procedural sound design for games.
However, the software cannot be easily integrated with games. On the other hand,
various optimized synthesizes can be developed using low level languages by Faust.
Transporting models and applying the same algorithms from PD to Faust is really
a burden to procedural sound designers. The aim of this project is to write a source
to source transpiler which transpiles PD source to Faust source. After getting faust code, it is up to you and
Faust to generate the C++ code.

## How to Run in Unix Environments
- Build the application from its sources
    - `javac -cp antlr-4.2.2-complete.jar:. -d bin src/*.java`
- For testing purposes you can use the input1.pd file to see whether the app is running correctly or not
    - `java -cp antlr-4.2.2-complete.jar:./bin ConvertPd input1.pd`
- You will see the transpiled output in the output console. Additionally, `input1.dsp` file will be created in order to
  be used in Faust. My using this file with Faust, you can get optimized C++ code which can be used natively in your games.

## How to Run The Transpiler with JetBrains Intellij IDE
- Open your IDE, then clone and open the project.
- Right click the file `antlr-4.2.2-complete.jar` and click `Add as a library`.
- Right click `src/ConvertPd.java` file, then go to `More Run/Debug` > `Modify Run Configuration`
- For testing purposes, give the `input1.pd` file as program argument and then click `Ok`
- Finally, right click again the `src/ConvertPd.java` file, then click `Run ConvertPD.main()`
- You will see the transpiled output in the output console. Additionally, `input1.dsp` file will be created in order to
be used in Faust. My using this file with Faust, you can get optimized C++ code which can be used natively in your games.

## About The Code
- `Rows.g4` file defines the grammar of internals of the .pd files. After you draw a patch and save it in PureData (PD), 
you will see a bunch of lines defining what you have drawn in the UI when you open the file with a text editor.
- All files contained in the expression `Rows*.java` are created by ANTLR (https://www.antlr.org/) using `Rows.g4` file.
- `ConvertPdListener.java` is the file where the whole logic resides. Compiling and Faust code generation happen in here 
by using the Lexer and the Parser which are generated by ANTLR.  
- `ConvertPd.java` file is the main class which runs the application by using the classes created via ANTLR and the file
  `ConvertPdListener.java`

## Extending the Grammar
If you want to further improve the transpiler, there are two things to consider:
- You can extend the grammar by editing the `Rows.g4` file. You can add new rules for the grammar if you want to 
implement some unimplemented blocks of PD. After editing the grammar file, you should re-build the project as instructed
above.
- After re-building the Lexer and Parser, you should add the transpiling logic of the block into the `ConvertPdListener.java`
file. 

This file's structure is as below:
- `public void enterRow(RowsParser.RowContext ctx)` function is called for every row in the .pd file. In this function,
`PDObject`(class)s are created by looking the tokens provided by the `Parser`.
- Everything is started when the exitFile function is called. This is because `~dac` object in the pd file resides at the bottom
of the file. If you think the pd patch as a graph and the `~dac` object as the starting point, this function starts the traversal.
It looks for the objects coming into the inlets of the `~dac` object and then calls 
`public String createObject_setOutput(int objectNumber,int outletNumber)` function.
- `createObject_setOutput` function is used for every other `PDObject` and defines the Faust equivalents of the objects. 
Additionally, it is responsible for connecting the inlets and the outlets of the objects. This function continues to be 
called recursively until a leaf object is reached. As a result whole graph is traversed and the Faust code is generated.

 


