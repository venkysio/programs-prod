Public-key cryptography, is the field of cryptographic systems that use pairs of related keys. 
Each key pair consists of a public key and a corresponding private key.
Key pairs are generated with cryptographic algorithms based on mathematical problems termed one-way functions.
Security of public-key cryptography depends on keeping the private key secret; the public key can be openly distributed without compromising security.
In a public-key encryption system, anyone with a public key can encrypt a message, yielding a ciphertext, 
but only those who know the corresponding private key can decrypt the ciphertext to obtain the original message

PKI is a set of roles, policies, hardware, software and procedures needed to create, manage, distribute, use, store and revoke 
digital certificates and manage public-key encryption.
PKI is mainly used to facilitate the secure electronic transfer of information for network activities.

SSL, the Secure Sockets Layer is the most popular means to create secure network connections. 
It’s widely used in Web browsers to secure potentially sensitive operations such as HTTP-based banking.
Sins start to creep into SSL-based applications when they incorrectly choose security
services offered by SSL. Many security algorithms, SSL included, provide three distinct,
and optional, security services:

- Authentication (Server and/or client)

- Channel encryption

- Channel integrity checking

The big problem with SSL, however, is it uses PKI, and PKIs are really hard to get
right.

REDEMPTION STEPS

- The certificate chains to a valid root CA.
- 
- The certificate is within its validity period.
- 
- The hostname is compared against the proper subfield in at least one of the
DN field or the X.509 v3 subjectAltName extension.

- The certificate key usage is correct: server authentication or client
authentication.

- The certificate is not revoked.
