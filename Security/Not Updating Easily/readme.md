Most software needs to be updated at some point during the supported lifespan,
whether this is for a bug fix, for a service pack, as a minor update, or to fix a security bug

Different types of applications have different updating needs. 

The sins related to updation of appications are:
- sinful installation of additional software
   Users install updates to fix problems with the software they have, not to install more software, which could have problems of its own. 
- sinful access controls
   An attacker can corrupt your executables, and at worst this allows for a very simple escalation of privilege that would
put all your customers at risk.
- sinful prompt fatigue
- sinful ignorance
- sinfully updating without notifying
- sinfully updating one system at a time
- sinfully forcing reboot

Redemption Steps:
- Resist the urge to bundle additional software in a patch.
- If you need to update a component running as a highly privileged user, you can let an
ordinary user download the update.Get the user to put the update in a safe place, and then have the privileged
process that needs to be updated check that the patch has not been tampered with by verifying the signature, and install it itself.
- Make the application just do the right thing without relying on the user to make a correct
decision.
- Don’t update without notifying the user.

