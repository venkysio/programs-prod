Cryptography is the method of encrypting the data so that the data can be securely communicated between the networks. There are many cryptographic techniques available and widely used now-a-days.
But care must be taken while using cryptography for protecting data.
There are common mistakes that developers do when they use cryptography. Some of them are:

- Using their own cryptography techniques. These may not be highly protected unless they are highly reviwed and tested by the organisations such as NEST

- Developing own cryptography algorithms using a mix of lower and higher level algorithms. These algorithms can have many issues and it is preferred and secure to implement well known higher level algorithms.

- Some algorithms are now well known to be very weak and open to attack such as:
    - The key used for DES encryption is too small; it’s only 56 bits long.
    - Two-key 3DES is losing its FIPS evaluation status in 2010. Do not use it.
  Knowing such properties is very crucial before implementing the technique.
  
REDEMPTION STEPS:

- Replace weaker algorithms with secure versions

- Don’t use stream ciphers. You should grep your code for all instances of “RC4”
and any other stream ciphers you might use.

- Any time you create a password verifier, use at least 8 bytes of salt, preferably 16—and if
you’re using one of the larger hashing algorithms (SHA256 or SHA512), consider using
more salt


