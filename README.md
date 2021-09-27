In this challenge, Applaudos Studios requested me:

// Rest Assured 

For following api doc site: https://breakingbadapi.com/documentation build a class with tests that resolve below exercises:

1. Get Walter White information and print in console birthday only <----

2. Get all characters information store them into a POJO/Model/DTO and print all characters information as below:

Character name: "Walter White"

Portrayed: "Bryan Cranston"

------------------------------------------------------

Character name: "Jesse Pinkman"

Portrayed: "Aaron Paul"

-----------------------------------------------------

What did I do?

I created a Maven project and added the dependencies that I needed (rest-assured, testng and fasterxml) as below:
![dependecies](https://user-images.githubusercontent.com/13719381/134827283-b4da540d-f150-4481-94f7-c18900f2a133.JPG)

and then, I created a class that represent a Character object returned by the API. Next, I created a class with two test methods that represent the two test cases requested me to automate (**givenWalterWhiteInformationThenGetHisBirthday and givenAllCharactersInformationThenStorePOJOAndPrint**). Finally, I added my test cases into testng.xml file and run the suite. you should get the following results:

![run suite](https://user-images.githubusercontent.com/13719381/134827619-599399b5-60be-49a0-8297-3c1da2a5a385.JPG)

**For this project, I used IntelliJ IDE, so when you clone this project and open it using IntelliJ, every dependencies should be downloaded automatically.**

If you are using Eclipse IDE, you should import the project (if it didn't cloned from git) as Maven Project (Existing Maven Project option). Step by step below:

![step 1](https://user-images.githubusercontent.com/13719381/134835448-a39d1e00-578b-41ea-9e2e-81bfa441b659.JPG)

![step 2](https://user-images.githubusercontent.com/13719381/134835463-7ce8cea0-a864-471c-9af5-4afee959ac5f.JPG)
