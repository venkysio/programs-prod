Error is an condition occured in a program which interrupts the current execution.

Many security risks are possible when error handling is not done correctly

Any reliability problem in a program that leads to the program crashing, aborting, or restarting is a denial of service issue and therefore can be a
security problem, especially for server code.

There are five variants of this sin:

  1.Yielding too much information
  
    When an error is occured, if more information is displayed like why,where,how and when the error occured and how can it be resolved will attract more malicious users and attackers.
    
  2.Ignoring errors
  
    Many of the return values from the commonly used functions are ignored in general, but when these functions are used in special environments, ignoring their return values may lead to the vulnerability in the program
    
  3.Misinterpreting errors and 4.Using non-error return values
  
    These conditions mainly occur because of the confusion between the special error value and normal value that is being returned by a function.
    
  5.Using useless return values
  
    Some of the functions will return values that have no use with error handling. Using such values for error handling is of no use and may also cause unneccessary exceptions.
    
REDEMPTION STEPS

The only real redemption step is to make sure you check return values when appropriate.

  
    
