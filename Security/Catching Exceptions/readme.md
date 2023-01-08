An exception is an event that disrupts the normal flow of the program.

Exception handling is an often misused feature of programming languages and operating systems.

In exception handling, we have try-catch blocks implemented in several languages; 
Windows operating systems have structured exception handling which includes three types of blocks, try, except, and finally; 
and UNIX-based operating systems (including Linux and Mac OS) all can utilize
signal handling. 

The basic concept behind C++ exceptions is fairly simple. You put code that might do
something wrong into a try block, and then you can handle errors in a catch block.

When catch block is used, it tells the compiler to handle all C++ exceptions inside
this catch block. You typically won’t handle operating system exceptions or signals like
access violations in catch blocks. 

In SEH of windows OS, Like a catch(...) block, __except(EXCEPTION_EXECUTE_HANDLER) just handles all exceptions and is never advisable.

Redemption Steps:
In C++;
  Ensure that all objects that acquire resources are exception safe and properly clean up on destruction.
Ensure that you’re catching the exceptions you need to catch, and in the right places.

In windows OS;
  Ensure that you do not have __except blocks that handle exceptions other than those that you know
exactly how to handle.

In Unix OS;
  Carefully audit signal handlers to ensure that only safe functions are called from within
signal handlers
