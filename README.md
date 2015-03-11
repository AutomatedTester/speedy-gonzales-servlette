# Speedy Gonzales Servlet

This is a project to help make Mozilla Web QA Selenium Tests more reliable by reciving messages from a
[grid proxy](https://github.com/dimacus/speedy-gonzales-proxy). This plugin is run on the Selenium
NODE machine with

This servlet accepts a call from the HUB machine and executes the MOUSE MOVE command on the node before a test is started



Step 1: Compile code
In the root of the project run
``` bash
   ant
```
servlette.jar is the product


Step 2 - Launching the mouse Moving Servlet

``` bash
   java -cp servlette.jar:lib/* com.mozilla.seleniumgrid.servlet.SpeedyGonzalesServlet
```

You should see "Server has been started" and when you navigate to http://localhost:3000/moveMouse in your
browser, your mouse should move into top left corner of the screen
