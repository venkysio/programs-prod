DOM Based XSS:(TYPE 0)

- It is a type of cross site scripting attack, which is mainly based on the client side scripts and browsers.

- This attack is mainly found when any html page or broswer uses Document Object Model to build the web page. When the input through which website building is performed is not validated properly, it may lead to wrong and untrusted building of website through which attacks happen.

- For example, if an website uses XMLHttpRequest to request some website and build dom based on the input using innerHtml, if not sanitised the input from the request may contain malicious scripts which gets executed in the user's browser leading to the attack.
