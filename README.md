# ProjectRepo2023
# Summer Project to practice Automation Testing
The aim of this Summer project is to familiarise and practice automation testing.
We work in InteiJ program where we  use BDD framework and work with Gherkin in our Feature file.

## Prerequisities
To work on the  project we fist need to Install InteliJ program. 
Create Maven project.
There we need to add all the required dependencies shown in the picture below.
We place them in the pom.xml file

  ![2023-08-02_15h37_58](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/8de20f22-2f27-44aa-b43d-7705aa82c14c)

## What have we done so far?
We started our project with installing all needed programs and signing into the online applications: 
* InteliJ- to write all our code.
* GitHub- to store and share the code.
* Jira- to plan our project in scrum method.
* Slack- to cooperate and help each other with other group members. 

Then we created the repository in The GitHub and cloned it into our machine.
We then created Maven project and saved it in the earlier created repository.
The next step was to install the dependencies in our pom.xml file. We required **Junit, Selenium-Java, Cucumber-Java and Cucumber-Junit.**
Once we done that we had to make a BDD framework and created the packages in srs/main/test/java:
* browserControl
*  features
*  pageObjects
*  stepDefinitions
*  utilities

  ![2023-08-06_10h33_31](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/22c33379-64a0-4bf0-971c-1cb182347e06)

  Our next task was to create ReadMe file in GitHub.



  # JENKINS


# Plugins to install in Jenkins:

* Cucumber reportsVersion5.7.6

* Git plugin 

* I you want to setup maven and jdk follow the instruction in this link  https://phoenixnap.com/kb/jenkins-tutorial#jenkins-testing



## Configuration of New Project (I’ve done Freestyle Project)

* After you click new job you can name it and also give it a description

* tick the Git project and copy your repository URL

* in source code management click Git and copy same address but add .git at the end

* in branches to build change master to main 

* at the very bottom in Post-build Actions  click Add and choose Cucumber Reports click advanced and

* in Report title put: page-objects_framework/reposts.json

* in JSON Reports path  find the file in your c: where your project is saved and paste it. The file you are looking for is called cucumber but its JSON file as you can see on the picture (note that the picture is from another repository <The internet testing>, you need to find same repository as you set before <August Project>)
  
![2023-09-26_13h49_48](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/ae5164bb-fd6c-4d51-acf1-f52b72e03b52)


![2023-09-26_13h43_43](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/9fd90178-1f07-444b-8f56-ea72ba4df713)





Here you can see the previous steps:

![2023-09-26_13h36_18](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/cd284f52-f17f-4396-974f-f61ccc7c0186)






In the Intellij  in the Test Runner add the plugin  "json:target/cucumber.json"as shown on the picture

<img width="960" alt="2023-09-26_13h37_27" src="https://github.com/ASiri06/ProjectRepo2023/assets/137730564/077d598a-7eee-4e67-88e0-52287e841d16">




Once all those steps are done you should be able to see Git and Cucumber in your job page

![2023-09-26_13h42_35](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/9678d144-07ad-48fc-aec5-60099a12509f)




Once you do build now you can see the report. Please have a look at below video.
  ![2023-09-26_14h06_01](https://github.com/ASiri06/ProjectRepo2023/assets/137730564/9a7d5a24-5cf5-41d4-a4de-df551952176f)




https://github.com/ASiri06/ProjectRepo2023/assets/137730564/a5213c38-dbac-46f4-bfe9-9f3a2cf379c8


