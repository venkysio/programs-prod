Integer overflows, underflows, and arithmetic overflows of all types, especially floating
point errors, have been a problem since the beginning of computer programming. The error can be anything from an underallocation to allocating zero bytes.

The core of the problem is that for nearly every binary format in which we can choose
to represent numbers, there are operations where the result isn’t what you’d get with
pencil and paper.

All common languages are affected, but the effects differ, depending on how the language handles integers internally.

Some of the common mistakes that cause Integer Overflows are:
- One of the first is a lack of awareness of casting order and implicit casts from operators.
- Not being aware that just invoking an operator changes the type of the result.
- Not handling arthimetic operations between datatypes carefully 
- Using comparision opeartors between different data types

REDEMPTION STEPS:
- Do the Math
- Make your checks for integer problems straightforward and easy to understand.
- Write Out Casts
- If you use gcc, you can compile with the –ftrapv option.
