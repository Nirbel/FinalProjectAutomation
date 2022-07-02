## **Final Project Automation**
[Short Video - Demonstration](https://drive.google.com/file/d/1LE30JJGs7JYVvWvz8Zj3yr6JeV_GVR97/view?usp=sharing)

### **_This project was created to demonstrate my knowledge and skills on a variety of platforms using different kinds of tools & frameworks._**
***
### _About_
The project demonstates a smart automation infrastructure. It is built in hierarchy order of modules. The modules contain number of classes with methods.
There are main/common/helpers/actions/page_object modules.
In this way, the tests can be created in very simple way with a minimum lines of code.
Also the infrastructure allows to work with differend kinds of applications.
**Big advantage of the infrastructure is that it can be easy maintained!**

### _Project Overview_

The project is an example of infrastructure for automation testing of different kinds of applications:
* Web based application
* Mobile application
* Web API
* Electron application
* Desktop application

### **_Infrastructure project includes using of:_**
* Page Object Design Pattern
* Project Layers(Extensions/Work Flows/Test Cases...)
* Support of Different Clients/Browsers
* Failure Mechanism
* Common Functionality
* External Files Support
* Reporting System (including screenshots)
* Visual Testing
* DB support
* CI support  

***

### _List of applications were used in this project:_
* Grafana webpage - Web based application
* Mortgage calculator - Mobile application
* Grafana API - Web API
* Todolist- Electron application
* Windows calculator - Desktop application

### _Tools & Frameworks that were used in this project:_
* Selenium - For Web Aplication Testing
* Appium - For Mobile Aplication Testing
* RestAssured- for API testing
* WinAppDriver - For Desktop Aplication Testing
* Electron Driver - For Electron Aplication Testing
* TestNG - Testing Framework
* Listeners - interface used to generate logs and customize the TestNG reports
* MySQL Free Online DB - used for Grafana web  page
* [Jenkins](https://www.jenkins.io/)- for tests execution
* [Allure Reports](http://allure.qatools.ru/) - as the main reporting system

### Tests Execution:
> Each of the applications has a few tests for demonstration purpose.
These tests can be developed in a very simple way, due to a lot of work with the infrastructure.
[[Sanity Tests]](https://github.com/Nirbel/FinalProjectAutomation/tree/master/src/test/java/sanity)

### _Known Issues:_
Sometimes can be conflicts with some dependencies the applications are using.
Hence, the project is for DEMO purpose only. In production it should be divided into several projects.
