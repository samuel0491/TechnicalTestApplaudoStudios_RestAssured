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


