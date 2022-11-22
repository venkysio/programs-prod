Format specifiers are used to specify the type of data, In most languages, the formatting information is described using some sort of a string, called the format string. But many developers make an easy mistake —they use data from untrusted users as the format string. As a result, attackers can
write format strings to cause many problems.

As with many security problems, the root cause of format string bugs is trusting user-supplied input without validation. In C/C++, format string bugs can be used to write to arbitrary memory locations, and the most dangerous aspect is that this can happen without tampering with adjoining memory blocks. 

In other lnguages such as java,format string attacks can still lead to an attacker might launching cross-site scripting or SQL injection attacks. These can be used to corrupt or transform data as well


The first step is never pass user input directly to a formatting function, and also be sure to do this at every level of handling formatted output.
