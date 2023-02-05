# AnyDo-Automaton-selenium


### This project automates certain tasks in [Any.do](https://app.any.do/), a popular task management application, using Selenium and Maven. The automation script is written in Java.

### Technology used for Test 
* tool: Selenium
* Language: Java
* Architecture: POM
* Framework: TestNG
* IDE: eclipse

### Pre Requisites:
* Open/install Java JDK 8 version on your PC
* Install Maven on your PC
* Install TestNG on your IDE
* Install Eclipse/STS or any other IDE
* Setup Java, Maven environment on your PC
* Chrome driver match with your browser

### These steps are executed:

* Open the Chrome browser
* Maximize the browser window
* Go to Desktop.any.do Web Site

* CreateTask Method:
  - Click create task
  - Click on "i want to"
  - Type Task name
  - Click "Add Task"

* Create task with notes and reminder:
  - Click create task
  - Click on "i want to"
  - Type Task name
  - Click "Insert your notes"
  - Type Notes name
  - On right side click "Next week"
  - Click "Add task"

* Create sub task:
  - On "My friday task" Click "Add a new subtask"
  - Type "Wake up early"

* Create list:
  - On left side in list category click "+" button 
  - Type list name

* Add item on list:
  - Click "My Shopping List"
  - Down below click "Click to add task"
  - Type "T-shirt"
  - Press enter
  - Type "Pant"
  - Press enter
  - Type "Mouse"
  - Type "KeyBoard"

* Change Theme:
  - on top right side click Settings
  - Click Theme
  - Select Dark
  - Wait 5 Second
  - Click Dark

* Check notification:
  - On top right Click on notification
  - Click "updates"

* Add Selection Feature on list:
  - Click "My Shopping List"
  - On list top side corner click "More options"
  - Click "Multiple selection"

* Create Tag:
  - On bottom left side in Tag category click "+" button
  - Click "NO, THANKS"

* Log out:
  - Click settings
  - Click My Profile
  - Click Sign out

* Then Close the browser

### Run the script:
* Right Click to Project
* Then select Run as TestNG
* Run the Test Case
* Close the program
