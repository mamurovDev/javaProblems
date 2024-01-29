class Student {
    private String name;

    public String getName() {
        return name;
    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public void setName(String newName) {
        if (newName == null || newName.isEmpty() ||
                newName.charAt(0) != newName.toUpperCase().charAt(0) ||
                !isAlpha(newName)) {
            throw new IllegalArgumentException("Invalid student name");
        } else {
            this.name = newName;
        }
    }
}

class Demo {
    public static void main(String[] args) {
        // Creating a new Student object
        Student student = new Student();

        for (int i = 0; i < args.length; i++) {
            try {
                // Invoking the setName method for each command-line parameter
                student.setName(args[i]);

                // Displaying the result returned by the getName method
                System.out.println(student.getName());
            } catch (IllegalArgumentException e) {
                // Handling the case where setName method throws an IllegalArgumentException
                System.out.println("Invalid student name");
            }
        }
    }
}
