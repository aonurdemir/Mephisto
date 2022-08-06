Hello all! 

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

## How to Run The Transpiler with JetBrains Intellij IDE
- Open your IDE, then clone and open the project.
- Right click the file `antlr-4.2.2-complete.jar` and click `Add as a library`.
- Right click `src/ConvertPd.java` file, then go to `More Run/Debug` > `Modify Run Configuration`
- For testing purposes, give the `input1.pd` file as program argument and then click `Ok`
- Finally, right click again the `src/ConvertPd.java` file, then click `Run ConvertPD.main()`
- You will see the transpiled output in the output console. Additionally, `input1.dsp` file will be created in order to
be used in Faust. My using this file with Faust, you can get optimized C++ code which can be used natively in your games.