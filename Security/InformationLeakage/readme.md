When we talk about information leakage as a security risk, we’re talking about the attacker getting data that leads to a breach of security or privacy policy, whether the data itself could be the goal (such as customer data), or the data can provide information that leads the attacker to his goal.

At a high level, there are three ways in which information gets leaked:

  Accidentally: The data is considered valuable, but it got out anyway, perhaps due to a logic problem in the code, or perhaps through a nonobvious channel.

  Intentionally: Usually the design team has a mismatch with the end user as to whether data should be protected. These are usually privacy issues.

  Mistake: The designer or the programmer didn’t understand that while the information might not have much value to them, the attacker found it helpful. 

There are many times when an attacker can glean important information about data by measuring information that the design team wasn’t aware was being communicated.There are two primary forms of side channel issues: timing channels and storage channels.

  With timing channels, the attacker learns about the secret internal state of a system by measuring how long operations take to run.
  
  Storage channels allow an attacker to look at data and extract information from it that probably was never intended or expected.
  
The job of any application is to present information to users so they can use it to perform useful tasks. The problem is that there is such a thing as too much information. The problem with having detailed version information is one of aiding the attackers and
allowing them to operate unnoticed.

The most common mistake is leaking internal network information such as
- MAC addresses
- Machine names
- IP addresses
- Application information
- Path and stack layout.

Redemption Steps:

For straightforward information leakage, the best starting remedy is to determine who should have access to what, and to write it down as a policy your application designers and developers must follow.

Maintaining access permissions
