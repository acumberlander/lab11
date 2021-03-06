# My First Spring Web App

### This app was an introduction to the use of routing with Spring Boot. It includes the following:
  - When going to the default localhost:8080 page, the splash page will be displayed
  ![](src/main/resources/splash-page.PNG)
  - When the ```/hello``` route is run it takes the user to the greeting.html page that will say "Hello World!" by default. The user can add a name parameter that will change the output to "Hello {name}!"
  !["greeting page"](src/main/resources/greeting-page.PNG)
  - When the ```/capitalize``` route is run, any text after it will be displayed with all the letter capitalized
  !["capitalize-page"](src/main/resources/capitalize-page.PNG)
  - When the ```/albums``` route is run, a list of albums that have been hardcoded will be displayed on the screen. Each album will include a title, artist, songCount, length, and a imageUrl.
  !["albums-page"](src/main/resources/albums-page.PNG)