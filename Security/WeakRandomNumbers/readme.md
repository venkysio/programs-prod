Random numbers are often used to generate cryptographic keys and session identifiers. In many tasks requiring random numbers, an attacker who can predict numbers
can leverage this information to breach the security of a system

The biggest sin you can commit with random numbers is not using cryptographically sound random numbers when they should be used. There should be no predictability
from one value to the next.

The random number generators that have been around for years in most programming language libraries aren’t good for security at all. The numbers may look random,but they are not because most use deterministic algorithms to generate the numbers 

The three different kinds of random numbers are:

- Non-cryptographic pseudo-random number generators (non-cryptographic
PRNG)
Before the Internet, random numbers weren’t really used for security-critical applica-tions.
Instead, they were used only for statistical simulation. The idea was to have numbers
that would pass all statistical tests for randomness, Thus, Application Programming
Interfaces (APIs) were designed to take a single number, and have that number be the
source (the seed) for a very long stream of numbers that appeared randomly. 
With traditional non-cryptographic generators, the entire state of the generator can be
determined just from looking at a single output. But, most applications don’t use the out-
put directly. Instead, they map it onto a small space. 

- Cryptographic pseudo-random number generators (CRNGs)
The simplest cryptographic pseudo-random number generators (CRNGs) act very much
like traditional random number generators. Anytime you give one the same seed, it produces the same set of
numbers. The only real difference is that if the attacker doesn’t know the seed.
Another point to note about cryptographic generators is that the strength of their
outputs can never be better than the strength of the underlying key.

- "True" random number generators (TRNGs)
As a result, true random numbers on the typical machine are in short supply relative
to the demand for them, especially on server hardware that has nobody sitting in front of
the console using the keyboard and mouse. While it’s possible to solve the problem with
hardware, it’s usually not cost effective. Therefore, it usually pays to be sparse with true
random numbers, and use them instead to seed CRNGs.

REDEMPTION STEPS:
In Windows systems:

- The Windows CryptoAPI provides the routine CryptGenRandom() or BCryptGenRandom on Windows Vista when using CNG, which can be implemented by any cryptographic provider.

In Unix systems:

-Random numbers are served up by two special devices (generally, /dev/random and /dev/urandom, but OpenBSD is an exception, providing /dev/srandom and
/dev/urandom).
