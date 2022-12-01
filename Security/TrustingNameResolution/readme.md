As an end user, no user wants to remember the IP addresses of the websites and networks that they visit.

So each IP address are customised with the web server names such as www.google.com

The primary name resolution service is DNS for most applicationa and it is common to find Windows Internet Name Service (WINS) usedfor name resolution on large Windows networks

The problem is that, name resolution systems are very fragile and are easyily attacked. The fragile aspects of the name server are:

 - The first would be the address of the real name server. This is relatively easy for attackers to find
out, especially if they’re located on the same network as you—it is almost certain they
have the same DNS server as you.

- Let’s say that your computer has some form of host-based intrusion
protection, and it will do a lookup on the source of a perceived attack. The attackers can
send you a packet, knowing that the reverse lookup will end up going to a server they
control—your DNS server forwarded the request to them, and now they know the IP
address of your DNS server.

- So let’s assume the attacker knows the IP address of your DNS server. You might
think that your client would insist that the reply must come from the same IP address the
request was sent to. But the unfortunate reality is that sometimes replies do not come
from the same IP address 

- Next, the reply has to go back to the same source port the request came from,but in reality, there is not. 

- If the attacker is on the same subnet as the client, there are fairly trivial attacks, even on switched networks where the attacker can see the
request and will know all of the information needed to spoof a reply.
-You then might think that if we asked for the IP address of one system and got a reply
with the address of another unrelated system, our resolver would just ignore this unsolic-
ited information. Very unfortunately, you’d be wrong in many cases. Worse yet, if we ask
for the IP address of one system and get an answer for another system along with the IP
address of what we asked for, you might think the client would again ignore the extrane-
ous information. 

REDEMPTION:
- The first step toward redemption is to understand the problem and know when you have a problem. Be aware of how unreliable DNS information can be.

- One of the easiest approaches is to ensure that connections are running over SSL and that your code is performing all the appropriate PKI checks

- If you’re dealing with internal applications, you will probably want to set up an enterprise-level certificate server and push the enterprise root certifi-
cate out to all of the client systems.

- Another approach is to use IPSec
