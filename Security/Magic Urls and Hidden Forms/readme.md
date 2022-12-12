URLs that contain sensitive information or information that could lead an attacker to sensitive information such as 
predicable cookie after successful authentication are called magic urls

By guessing the encryption used the fields and data from the url can be easily seen

In short, data held anywhere in the URL, or the HTTP body for that matter, that is potentially sensitive is sinful if the payload is not protected by the appropriate crypto-
graphic defenses.

The second error is passing potentially important data from your web application to the
client in a hidden form field, hoping the client doesn’t see it or manipulate it.

Malicious users could very easily view the form contents, hidden or not, using the View Source option in their browsers

The threats that can occur due to magic urls and hidden form fields are:

- An attacker views the data
- An attacker replays the data
- An attacker predicts the data
- An attacker changes the data

REDEMPTION STEPS:
Encrypt the data at the server, and then send it to the client in a hidden form or a cookie

Use encryption channels like SSL, TLS, or IPSec.


