
Malicious scripts are injected into otherwise benign and trusted websites through a method known as Cross-Site Scripting (XSS). 
XSS attacks occur when an attacker uses a web application to send malicious code to a different end user in the form of a browser-side script. 
These attacks are quite widespread and can take place anywhere a web application uses input from a user in its output without validating or encoding it first.

DOM Based XSS:(TYPE 0)

- It is a type of cross site scripting attack, which is mainly based on the client side scripts and browsers.

- This attack is mainly found when any html page or broswer uses Document Object Model to build the web page. When the input through which website building is performed is not validated properly, it may lead to wrong and untrusted building of website through which attacks happen.

- For example, if an website uses XMLHttpRequest to request some website and build dom based on the input using innerHtml, if not sanitised the input from the request may contain malicious scripts which gets executed in the user's browser leading to the attack.

Remedies:

- Verify the input
- Prefer using innerText when suffice than innerHtml 
