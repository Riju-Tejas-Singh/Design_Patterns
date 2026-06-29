package critical.builder;

public class User {

    // Mandatory fields
    private final String name;
    private final String email;

    // Optional fields
    private final int age;
    private final String phone;
    private final String profession;
    private final boolean married;
    private final double salary;

    // Private constructor with argument type Builder
    private User(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phone = builder.phone;
        this.profession = builder.profession;
        this.married = builder.married;
        this.salary = builder.salary;
    }

    public void display() {
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Age        : " + age);
        System.out.println("Phone      : " + phone);
        System.out.println("Profession : " + profession);
        System.out.println("Married    : " + married);
        System.out.println("Salary     : " + salary);
    }



    // ---------------- Builder ----------------



    public static class Builder {

        // Mandatory fields
        private final String name;
        private final String email;

        // Optional fields with default values
        private int age = 18;
        private String phone = "Not Provided";
        private String profession = "Student";
        private boolean married = false;
        private double salary = 0;

        // constructor for mandatory fields
        public Builder(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public Builder married(boolean married) {
            this.married = married;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public User build() {

            // Validations
            if(name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            if(age < 0) {
                throw new IllegalArgumentException("Invalid age");
            }
            if(salary < 1000000) {
                System.out.println("Very less salary");
            }

            return new User(this);
        }
    }
}
