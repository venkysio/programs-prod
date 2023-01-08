The definition of a race condition is when two different execution contexts, whether they are threads or processes, are able to change a resource and interfere with one another.

Race conditions happen more reliably on multiprocessor systems, and
given the reality of current processors, systems that either have or will behave as if two processors are present 
are the norm—single-processor systems are relegated to the very lowest end of the computing scale.

The primary sin associated with this attack is the failure to write code that deals with concurrency properly.

Nearly all of the temp file race conditions are only problems because improper
access controls were used, which is typically compounded by older versions of the oper-
ating system not providing properly secured per-user temporary directories.

A high-level language that doesn’t support threads or forked processes won’t be vulnerable
to some kinds of race conditions, but the relatively slow performance of these high-level
languages makes them more susceptible to attacks based on time of check to time of use

Even concurrent applications running on UNIX and UNIX-like systems
would normally fork a new instance, and then when any global variables get changed,
that process gets its own copy of the memory page because of copy-on-write semantics.

Race conditions are commonly found under the following conditions:
  - More than one thread or process must write to the same resource. The resource
could be shared memory, the file system, other data stores like the Windows
registry, or even a database. 

  - Creating files or directories in common areas, such as directories for temporary
files (like /tmp and /usr/tmp in UNIX-like systems).

  - Signal handlers.

  - Nonreentrant functions in a multithreaded application or a signal handler.
Note that signals are close to useless on Windows systems and aren’t
susceptible to this problem.

Redemption steps:

  - If your code throws an unhandled exception while holding a lock, you’ll
deadlock any other code that requires the lock. One way out of this is to turn
the acquisition and release of the lock into a C++ object so that as the stack
unwinds, the destructor will release the lock. Note that you may leave the
locked resource in an unstable state; in some cases, it may be better to deadlock
than to continue in an undefined state.

- Always acquire multiple locks in the same order, and release them in the
opposite order from how they were acquired. If you think you need multiple
locks to do something, think for a while longer. A more elegant design may
solve the problem with less complexity.

- Do as little while holding a lock as possible. To contradict the advice of the
previous bullet point, sometimes multiple locks can allow you to use a fine
level of granularity, and actually reduce the chance of a deadlock and
substantially improve the performance of your application.

- Do not ever depend on a system call to complete execution before another
application or thread is allowed to execute. System calls can range anywhere
from thousands to millions of instructions. Since it’s wrong to expect one
system call to complete, don’t even start to think that two system calls will
complete together.











































































































































































































































































































