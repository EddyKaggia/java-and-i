class HelloWorld {
    public static void main(String[] args) {
        String name = "Eddy Kaggia";
        String country = "Kenya";
        int age = 35;
        String company = "Walmart";
        double gpa = 3.8;
        Boolean show = true;

        // Formatted string
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. It is %b that I love Invincible.", name, country, age, company, gpa, show);

        System.out.println(formattedString);

        String cow = "They love grass!";

        System.out.println(cow.toUpperCase());

        // Comparing strings
        String string1 = new String("abc");
        String string2 = new String("abc");
        String string3 = new String("ABC");

        System.out.println(string1 == string2); // Will be false -> compares reference to object
        System.out.println(string1.equals(string2)); // Will be true -> compares the characters in the string not the string object
        System.out.println(string1.equals(string3)); // Will be false -> different case
        System.out.println(string1.equalsIgnoreCase(string3)); // Will be true -> ignores case
    }
}
