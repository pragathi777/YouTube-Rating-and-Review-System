Project Structure
The project is divided into two main packages to separate responsibilities:

com.youtube.backend: Contains the core data structures and logic.

Channel.java: A data class (POJO) that models a single YouTube channel, holding its name, review, rating, and URL.

ChannelRepository.java: Acts as an in-memory database. It manages the collection of Channel objects, handling operations like adding, retrieving, and storing data.

com.youtube.frontend: Contains the user-facing presentation layer.

YouTubeConsoleUI.java: The main entry point of the application (main method). It is responsible for displaying menus, processing user input from the console, and interacting with the ChannelRepository to execute user requests.

How to Run
Prerequisites
Java Development Kit (JDK) 8 or higher installed.

Running from an IDE (Recommended)
Create a new Java project in your IDE (Eclipse, IntelliJ IDEA, VS Code).

Create the package structure com.youtube.backend and com.youtube.frontend inside your src folder.

Place the corresponding .java files into these packages.

Locate the YouTubeConsoleUI.java file.

Right-click on the file and select "Run as Java Application".

Running from the Command Line
Organize the files in the directory structure as specified above (e.g., src/com/youtube/backend/Channel.java).

Open a terminal or command prompt and navigate to the src directory.

Compile all the Java source files:

javac com/youtube/backend/*.java com/youtube/frontend/*.java

Run the application by specifying the fully qualified name of the main class:

java com.youtube.frontend.YouTubeConsoleUI

The application will start, and you can interact with it directly in your console.
