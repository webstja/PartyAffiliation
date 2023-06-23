public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to represent your party affiliation:");
        System.out.println("D for Democrat");
        System.out.println("R for Republican");
        System.out.println("I for Independent");
        System.out.println("Enter your choice:");
        String partyAffiliation = scanner.nextLine().toUpperCase();
        String symbol;
        if (partyAffiliation.equals("D")) {
            symbol = "Democratic Donkey";
        } else if (partyAffiliation.equals("R")) {
            symbol = "Republican Elephant";
        } else if (partyAffiliation.equals("I")) {
            symbol = "Independent Person";
        } else {
            symbol = "Other";
        }
        System.out.println("You get a " + symbol + ".");
    }
}
