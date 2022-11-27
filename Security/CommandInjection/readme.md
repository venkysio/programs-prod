Command injection problems occur when untrusted data is placed into data that is passed to some sort of compiler or any shell, where the data might, if it’s formatted in a particular way, be treated as something other than data.

This is also an attack that usually occurs because of the unvalidated user input

SQL Injection attacks are also a type of the command injection.

In general the malicious input contains data such that it terminates the current command with some values or comments and executes other unintended commands.

For example,
If a program reads user input to open a file in the shell,if not validated the input can give filename following with ;(in linux) &(in windows)and some command names so that the operarting system executes both the commands

Redemption Steps:
- User Input validation

- Restricting previlages of command execution
