Executing code with too much privilage is independent of language and is a design issue 
a) True
b) False
Answer a

Statement 1: In Windows a privilege is a discrete machine-wide capability, such as the ability to debug any arbitrary process or bypass an ACL check for backup or restore purposes.
Statement 2: On Linux, BSD, and Mac OS X, there is no notion of a discrete privilege other than the capabilities inherent in the user ID (uid) and group ID (gid).
Which of the above statements is true?
a) Statement 1
b) Statement 2
c) Both of them
Answer c

How can we limit privilages in windows?
a) run processes as low-privilege accounts,a
b) run the core Apache daemon as root so that it can open port 80
c) Both of them
Answer a

 What are th steps to to determine exactly which Windows privileges your application must have?
 a) call GetTokenInformation() to get the full list of privileges that the application currently has
 b) copy all of the privileges—excepting those you require—to a list of privileges to drop by setting the attribute to SE_PRIVILEGE_REMOVED.
 c) Both of them
 Answer c
 
 Microsoft’s .NET Runtime offers an incredibly rich set of granular permissions.
 a) True
 b) False
Answer a
