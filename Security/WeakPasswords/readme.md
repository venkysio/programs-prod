Password in internet is a highly used entity for authentication.
There is an ever running trade off between its goodness and ease of use.
Any software system using passwords is a security risk. Managing passwords poorly can make the overall problem even
worse, but there are ways to deal with passwords correctly that can mitigate many of the
problems with a weak authentication mechanism that we seem to be stuck with.

There are many problems that a password based system suffers. Some of them are:
1.  Password Compromise: Passwords are a portable, single-factor authentication method, user can be tricked into revealing a password.
2.  Weak passwords and iterated passwords: A weak password allows an attacker to easily guess the user’s password.
3.  Infrequent password changes: If password changes are not required, the obvious consequence is that any compromised passwords will remain compromised indefinitely.
4.  Default passwords: The default passwords that are provided to users are common irrespective of the user and can be easily cracked.
5.  Replay Attacks: A replay attack happens when someone is able to obtain the network traffic between the user and server application, and is then able to just send the packets again and obtain the same access your user would have.
6.  Password storage and brute force: When passwords are directly stored, if once the storage is compromised by methods such as brute force, they are at a risk.
7.  Revealing Whether a Failure Is Due to an Incorrect User or Password: This makes the filtering of attempts made by an attacker more easy and passwords cracking can occur at an higher rate.

To ensure more password security the redemption steps are:
1.  If your application handles passwords at all, ensure that passwords are not stored in memory for any longer than absolutely needed.
2.  Ensure that your application enforces password complexity, history and length requirements.
3.  Don’t use default passwords.
4.  The primary defense against replay attacks is to encapsulate authentication attempts inside of a protected channel, such as SSL/TLS or IPSec.
5.  The first consideration when preventing online attacks is to not disclose user names to attackers. If the attacker has to guess at both the user name and the password, this makes the attacker’s job considerably harder.
6.  The key to the problem of forgotten passwords is to allow a reset—do not return the existing password under any circumstances.


