The sin of failing to use least privilege is a design issue that allows attackers to create
more damage when a failure does happen.

Every program and every user of the system should operate using the least set
of privileges necessary to complete the job.

If there are ways to further reduce the
capabilities of the user account but still get the job done, then you should reduce the capa-
bilities of the process. A closely related problem is designing the application so that
privileges are used for the shortest possible time.

For example, in Windows a privilege is a discrete machine-wide capability,
such as the ability to debug any arbitrary process or bypass an ACL check for backup or
restore purposes.

On Linux, BSD, and Mac OS X, there is no notion of a discrete privilege other than the
capabilities inherent in the user ID (uid) and group ID (gid).

The term “privilege” also has a generic meaning that is applicable to all operating
systems: “high privilege” usually equates to any process that is capable of performing
sensitive operations, while “low privilege” often equates to processes running under
accounts that are task-constrained.

Redemption Steps:

The redemption is to run code with least privilege
There are two main ways to limit privilege in Windows.
  - The first is to run processes as low-privilege accounts,and that was one of the major goals of Windows Vista.
  - Another approach is to determine exactly which Windows privileges your application must have, call GetTokenInformation() 
  to get the full list of privileges that the application currently has, and then copy all of the privileges—excepting those you require—to a
  list of privileges to drop by setting the attribute to SE_PRIVILEGE_REMOVED. 
  
Probably the most well-known model for reducing privilege in Linux, BSD, and Mac OS X is how the Apache httpd process forks code: 
  This process runs the core Apache daemon as root so that it can open port 80, but it does not handle any potentially
dangerous requests from users; rather, it spawns a series of httpd child processes that run
at much lower privilege levels, often the “nobody” or “www” account, depending on the
operating system.

Microsoft’s .NET Runtime offers an incredibly rich set of granular permissions.

  
