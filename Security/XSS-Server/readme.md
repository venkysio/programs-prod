Cross Site Scripting:

- Cross Site Scrpting(XSS) attacks are mainly seen in web applications These are both of client and server based.

Server based XSS attacks:

-  The sever based XSS attacks are mainly occured when user input is not sanitised.
-  The malicious inputs containing scripts to steal data such as cookies, if echoed, are rendered by the browser as normal scripts and gets executed leading to the attack
-  There are two types in server based XSS attacks:

XSS-non persistent(TYPE1)
- This attack mainly occurs when the user clicks on the link containg malicious script. 
- These links appear like they are from the valid website but they also contaion some scripts that are executed without user's knowledge, stealing the data.

- For example, Consider a search website that echoes the users search. This website asks for user login and stores user cookies in their browser.
        - When the user gets to see some link related to this website, he might click on that thinking that it will be giving him some serch results.
        - But the malicious url while leading to search website steals the user cookies containg login info stored in the browser nd then can access them.

Usage:

STEP 1: If the user is new to the website, they create an account.
        If the user already exists, they login into the account by giving username
        
STEP 2: If the cookie for user login exists in browser, it doesnot ask for user password.
        Otherwise it asks for user password, validates and creates a new cookie.
        
STEP 3: The user can now use the search website, search for anything and results are displayed.(echoed)

Attack:

STEP 1: When the user clicks on the malicious url(within view more button) the malicious website(XSS-Exploit) stoles cookies and stores them in its database.

STEP 2: The malicious user now gets the cookie which has user name and password of an authenticated user.

STEP 3: Malicious user can now insert the stolen cookie in their browser and login as if they were the authenticated user.

XSS-persistent(TYPE2)
- This attack mainly occurs by storing data conatning scripts in a database
- When this stored data is displayed on the web browser,the scripts while rendering are exceuted and lead to attack

- For example, Consider a chat website where users can post their comments and also view the comments posted by other users.
        - If a malicious user posts some comments along with some script such as stealing cookies, it will be stored by the databses and will be displayed to other users.
        - When displayed for other users, the browser executes the script and steals the user cookies to malicous user.

Usage:

STEP 1: If the user is new to the website, they create an account.
        If the user already exists, they login into the account by giving username
        
STEP 2: If the cookie for user login exists in browser, it doesnot ask for user password.
        Otherwise it asks for user password, validates and creates a new cookie.
        
STEP 3: The user can now use the chat website, all the user chat results are displayed

Attack:

STEP 1: The malicious user when entering comments enters some malicious script to stole brower cookies.

STEP 1: When the  normal user views the malicious user's comments,the script inside is exceuted and stoles cookies and stores them in its database.

STEP 2: The malicious user now gets the cookie which has user name and password of an authenticated user.

STEP 3: Malicious user can now insert the stolen cookie in their browser and login as if they were the authenticated user.

Remedies:

-Validate user input

- Encrypt cookies and data

