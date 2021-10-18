import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    @SuppressWarnings("unused")
	private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    private static ArrayList<String> validSpecies = new ArrayList<String>();
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String userInput;

    	instantiateMonkeySpecies();
        initializeDogList();
        initializeMonkeyList();

        displayMenu();
        userInput = scanner.nextLine();
        while (userInput != "q") {
            if (userInput.equalsIgnoreCase("1")) {
            	intakeNewDog(scanner);
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("2")) {
            	intakeNewMonkey(scanner);
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("3")) {
            	reserveAnimal(scanner);
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("4")) {
            	printAnimals("Dog");
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("5")) {
            	printAnimals("Monkey");
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("6")) {
            	printAnimals("Not Reserved");
            	displayMenu();
            	userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase("q")) {
            	System.out.println("Goodbye");
            	return;
            } else {
            	System.out.println("Invalid input.");
            }
        }
     }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "in service", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Rafiki", "male", "42", "100", "today", "Ghana", "in service", false, "Mozambique", "7", "5'2\"", "1.7m", "Guenon");
    	Monkey monkey2 = new Monkey("King Julian", "male", "13", "100", "today", "Tanzania", "in service", false, "Ghana", "13", "1'2\"", "0.75m", "Marmoset");
    	Monkey monkey3 = new Monkey("Steve", "male", "4", "13", "today", "United States", "in service", false, "United States", "8", "14\"", "0.6m", "Capuchin");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // X Complete the intakeNewDog method
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }

        // X Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();
        String trainingStatus = "intake";
        Boolean reserved = false;
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();
        String acquisitionDate = "none";
        String acquisitionCountry = "none";
        String inServiceCountry = "none";
        Dog currentDog = new Dog(name, breed, gender, age,
        							weight, acquisitionDate, acquisitionCountry,
        							trainingStatus, reserved, inServiceCountry);
        dogList.add(currentDog);
        
        System.out.println("Dog " + name + " has been accepted at intake.");
    }


    // X Complete intakeNewMonkey
	// X Instantiate and add the new monkey to the appropriate list
    // X For the project submission you must also  validate the input
	//   to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
            
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(!validSpecies.contains(species)) {
                System.out.println("\n\nWe're not accepting monkeys of this species\n"
                  + "We accept the following: Capuchin, Guenon Macaque, Marmoset,"
                  + "Squirrel monkey, Tamarin\n\n");
                return; //returns to menu
            }
        }
            
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        String trainingStatus = "intake";
        Boolean reserved = false;
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();
        String acquisitionDate = "none";
        String acquisitionCountry = "none";
        String inServiceCountry = "none";            
            
        Monkey currentMonkey = new Monkey(name, gender, age,
            	weight, acquisitionDate, acquisitionCountry,
            	trainingStatus, reserved, inServiceCountry, tailLength, height,
            	bodyLength, species);
        monkeyList.add(currentMonkey);
            
        System.out.println("Monkey " + name + " has been accepted at intake.");
    }

    // User will input will be their desired animal type and country
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
    	System.out.println("Is the animal you'd like to reserve a Monkey or a Dog?");
    	String monkeyOrDog = scanner.nextLine();
        	
        if (monkeyOrDog.equalsIgnoreCase("monkey")) {
        	// Determine the user's desired country
        	// pick the first monkey available and reserve it
            System.out.println("In what country will you require this monkey?");
            String country = scanner.nextLine();
            
            boolean foundValidMonkey = false;
            
            for(Monkey monkey: monkeyList) {
                if((monkey.getInServiceLocation().equalsIgnoreCase(country)) && (monkey.getReserved() == false)) {
                    monkey.setReserved(true);
                    System.out.println("You have reserved monkey " +  monkey.getName() +
                    					" in " + monkey.getInServiceLocation());
                    foundValidMonkey = true;
                    break;
                }
            }
            
            if (foundValidMonkey == false) {
            	System.out.println("No monkeys are available in that country.");
            }
                
        } else if (monkeyOrDog.equalsIgnoreCase("dog")) {
            System.out.println("In what country will you require this dog?");
            String country = scanner.nextLine();
            
            boolean foundValidDog = false;
                
            for(Dog dog: dogList) {
                if((dog.getInServiceLocation().equalsIgnoreCase(country)) && (dog.getReserved() == false)) {
                    dog.setReserved(true);
                    System.out.println("You have reserved dog " +  dog.getName() +
        					" in " + dog.getInServiceLocation());
                    break; //returns to menu
                }
            }
            
            if (foundValidDog == false) {
            	System.out.println("No dogs are available in that country");
            }
                
        } else {
        	System.out.println("We don't have that kind of animal.");
        	return;
        }
     }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
    public static void printAnimals(String listType) {
        if (listType == "Dog") {
            for(Dog dog: dogList) {
            	if (dog.getReserved() == false && dog.getTrainingStatus() == "in service") {
            		System.out.println(dog.getName());
            	}
            }        	
        } else if (listType == "Monkey") {
            for(Monkey monkey: monkeyList) {
            	if (monkey.getReserved() == false && monkey.getTrainingStatus() == "in service") {
            		System.out.println(monkey.getName());
            	}
            }
        } else if (listType == "Not Reserved") {
        	// Print both lists of species, but only those that are available
            for(Dog dog: dogList) {
            	if (dog.getReserved() == false && dog.getTrainingStatus() == "in service") {
            		System.out.println(dog.getName());
            	}
            }
            	
            for(Monkey monkey: monkeyList) {
            	if (monkey.getReserved() == false && monkey.getTrainingStatus() == "in service") {
            		System.out.println(monkey.getName());
            	}
            }
        }
    }
        
    public static void instantiateMonkeySpecies() {
        validSpecies.add("Capuchin");
        validSpecies.add("Guenon");
        validSpecies.add("Macaque");
        validSpecies.add("Marmoset");
        validSpecies.add("Squirrel monkey");
        validSpecies.add("Tamarin");
    }
}

