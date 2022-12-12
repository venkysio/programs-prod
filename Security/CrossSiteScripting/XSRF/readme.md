Cross site request forgery(XSRF):
 
 XSRF is also an common attack seen in many of the websites.
 
 It is an input trust attack, where unauthorized commands are submitted from a user that the web application trust.
 
 XSRF bugs are due to the server having too much trust in the client, or more accurately, the server believes the request came from a valid user request.
 
Redemption Steps:

1. Add a secret value to the web client and web server session; this value should
not be included in the cookie.

2. Add a timeout to the session.

3. As a defense in depth mechanism, use POST rather than GET.

This is why adding a timeout is important, as it closes the attacker’s window of opportunity.

Interestingly, this is one security vulnerability type where input validation doesn’t help because all the input is valid. Also, an XSS bug anywhere on the web site will allow
bypassing any XSRF mitigations.
