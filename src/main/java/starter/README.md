### Application code
 
These packages generally contain application code. 
If you are writing a reusable test library, you can also place reusable test components such as Page Objects or Tasks here.

---Pre-Requists---
- Should have the latest Maven version installed, in order to run commands 
- Need the latest Java version

To run the sample project, you can either just run the CucumberTestSuite test runner class, or run either mvn verify or gradle test from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the driver system property, e.g.

$ mvn clean verify -Ddriver=firefox
Or

$ gradle clean test -Pdriver=firefox
The test results will be recorded in the target/site/serenity directory.