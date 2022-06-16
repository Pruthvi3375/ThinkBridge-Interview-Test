# ThinkBridge-Interview-Test

Interview Test Question no.2

One of the travel websites requires you to automate their Flight Search function.

Automation Requirements:
• Launch a new Browser.
• Open URL http://jt-dev.azurewebsites.net/#/SignUp
• Validate that the dropdown has "English" and "Dutch"
• Fill in your name.
• For organization, use your name as well.
• Input your email address.
• Click on "I agree to the Terms And Conditions"
• Click on "SignUp"
• Validate that you received an email.


Answer:- For solution of this question please refer folder shared on GitHub named as InterviewTest.

The user guide to open the file is as follows:
1.Download the Eclipse IDE.
2.Open the Eclipse.
3.Go to Perspective => Git Repositories and click on Add Git Repo.
4.Then Git Repo window will open. In that click on clone a repository.
5.In the next window paste "" in the URI field ==> Next ==> Next ==> Finish.
6.Now the project will get imported automatically to your Eclipse.
7.Right click anywhere on the screen select Run As ==> TestNG Test.

=========That's it.==========

Advanced Concept Used in Code Writing is using TestNG Framework.

After the execution of the program, you can see emailable reports or index.xml file for better understanding.


Notes: 

For Validation of Email Address, the code is written and commented beacause it will fail the test case if you run it
with out valid credentials for Gmail sign in. 
You can add your details and uncomment it to see further automation for Email verification.
