# Snap Game

This project is part of the [_nology](https://nology.io/become-a-developer/) training. This is a simple version of the Snap Game, where cards are matched by their symbols.

## Prerequesites

You will need to have Java version 25 or later installed and one of either [Visual Studio Code](https://code.visualstudio.com/) or [JetBrains IntelliJ](https://www.jetbrains.com/idea/).

If you are using Visual Studio Code, ensure that the Extension Pack for Java has been installed.

## Installation

- Clone the repository
    - https:
      ```shell
      git clone https://github.com/bobbybwoy/nology-snap-game.git
      ```
    - ssh:
      ```shell
      git clone git@github.com:bobbybwoy/nology-snap-game.git
      ```
- If you have Maven installed, then enter the following in your terminal:
    ```shell
    cd nology-snap-game
    mvn package
    ```
  It will start with:
  ```shell
    [INFO] Scanning for projects...
    [INFO]
    [INFO] ---------------------< uk.co.rdl:nology-snap-game >---------------------
    [INFO] Building nology-snap-game 1.0-SNAPSHOT
    [INFO]   from pom.xml
    [INFO] --------------------------------[ jar ]---------------------------------
    [INFO]
    [INFO] --- resources:3.3.1:resources (default-resources) @ nology-snap-game ---
    ```
  It will go through a series of downloads and tests, culminating with the following:
  ```shell
  [INFO] Building jar: /Users/robertdeleon/Desktop/NewSkillsRepo/Java/nology-snap-game/target/nology-snap-game-1.0-SNAPSHOT.jar
  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time:  25.088 s
  [INFO] Finished at: 2026-02-12T07:23:01Z
  [INFO] ------------------------------------------------------------------------
    ```
 
- If you have IntelliJ:

  - Click on the small "m" in the right hand toolbar
  - When the Maven window opens, click on the Execute Maven Goal button, which in the middle of the Maven window toolbar
  - A pop up window will appear, double-click on the option "mvn package"

- If you have Visual Studio Code:

  - In Explorer, expand the Maven explorer, right click the project and select Run Maven Commands... > package

- The output for IntelliJ and VS Code will be the same as the Maven terminal command

- To run the game, type in the following
  ```shell
  java -cp target/nology-snap-game-1.0-SNAPSHOT.jar uk.co.rdl.Main
  ```

## How to play

Each player gets to enter their name, and the game will begin with each player pressing `Enter` to get their next card.

The game will automatically end when the card's numbers match, with the last player drawing a card being the winner.

## Features missing

- The timer functionality

## References

These are the references I used during the project:

- [How to Sort an ArrayList in Java](https://www.javaspring.net/blog/how-to-sort-an-arraylist-java)
- [Unit Testing System.in for Input Handling in JUnit](https://www.geeksforgeeks.org/advance-java/unit-testing-system-in-for-input-handling-in-junit)
- [Mastering Java Timers: A Comprehensive Guide](https://www.javaspring.net/blog/java-timer)
- [Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)