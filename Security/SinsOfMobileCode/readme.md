Mobile code is code that is downloaded and executed on a user’s computer, sometimes with little or no user consent

Eg: A web page rendered in a browser

One reason enterprises like mobile code is they can build centrally administered, web-based applications that are maintained and updated centrally.

But there is a fundamental problem that makes it hard to create secure mobile code
containers and secure mobile code, and that is that mobile code mixes code and data.  Once you start mixing them
together, all sorts of nasty things start to happen because the user thinks the application is
rendering data, but there is code executing from a potentially distrusted source, and that
code could be made to perform nefarious tasks.

The kind of attacks that can occur are:

The mobile code is possibly downloaded with no authenticity check,
and which performs tasks beyond what it was meant to do or performs tasks that it
really ought not to do.

The container, which is the code that executes the mobile code possibly does not constrain mobile code to a limited set of capabilities, or
allows mobile code to execute without direct or indirect user consent.

Redemption steps:

The first and by far the most important redemption is to create mobile code in a safe language and safe operating environment such as .NET and Java

If an application that hosts mobile code, then that container process must be “sandboxed” to limit any potential damage from a rogue or poorly written mobile
code application.
