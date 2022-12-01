Network traffic is one of tyhe most commonly attacked elements.
It can occur due to in accurate encryption,using protocols such as HTTP or SMTP which are not secure, connecting to an insecure netwok such as public wi-fi etc

Many important protocols, such as SMTP,IMAP,POP,SNMP, HTTP provide no security at all, or at most,
provide basic authentication mechanisms that are easily attacked.

All languages are subject to this problem because failure to protect network traffic is a
design issue.

These attacks can be occured at several levels such as ARP spoofing, router level etc. Some of the examples are:

- Eavesdropping: An attacker listens in to the conversation and records any valuable information, such as login names and passwords.
    
- Replay: The attacker takes existing data from a data stream and replays it.
    
- Spoofing: The attacker mimics data as if it came from one of the two parties, but the data is controlled by the attacker.
    
- Tampering: The attacker modifies data on the wire, perhaps doing something as innocuous as changing a 1 bit to a 0 bit.
    
- Hijacking: The attacker waits for an established connection and then cuts out one of the parties, spoofing the party’s data for the rest of the conversation.
   
Some of the basic measures to be taken against these attcaks are:
  
- Initial authentication: Your application needs to ensure that the two endpoints agree on who they’re talking to. Authentication can involve the
client authenticating the server, the server authenticating the client, or both.

- Ongoing authentication: Once you’ve initially authenticated, you still need to ensure that the rest of the traffic hasn’t been diverted or tampered with.

- Privacy

REDEMPTION STEPS:

-   Use SSL, ssh, or the Kerberos-based Application Programming Interfaces (APIs) Windows provides in the Distributed
Component Object Model/Remote Procedure Calls (DCOM/RPC) libraries.

-   If your application involves bulk data transfer, and privacy is not required, consider just transmitting a hash or HMAC of the data through a secure
channel, and then check for corruption or tampering on the receiving end.
