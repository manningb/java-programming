package ict2;

public class Test {
    public static void main(String[] args) {
        // declare, create and initialise an array of Person objects
        // When you have implemented Manager and Employee, you should be able
        // to uncomment the commented code below.
        Person[] people = {
                new Manager("C. Darwin", 455, "c.darwin@species.com", 150000, 1000, "Room 101"),
                new Person("J. Doe", 200, "j.doe@supermail.com"),
                new Student("A. Bee", 120, "a.bee@bettermail.com", "19000091"),
                new Employee("B. Cee", 111, "b.cee@okmail.com", 50000),
                new Student(),
                new Manager("A. Einstein", 105, "a.einstein@emc2.com", 100000, 2000, "Room 202")
        };

        // display the objects
        display(people);

        // display student numbers
        displayNumbers(people);

//        My tests are below
//        displayNumbersWithName(people);
//
//        // array of no-arg constructed people
//        Person[] emptyPeople = {
//                new Manager(),
//                new Person(),
//                new Student(),
//                new Employee(),
//                new Student(),
//                new Manager()
//        };
//        System.out.println("\nEMPTY PEOPLE CLASS TESTS");
//
//        // display the objects
//        display(emptyPeople);
//
//        // display student numbers
//        displayNumbers(emptyPeople);
//
//        displayNumbersWithName(emptyPeople);
//
//        displayWithClass(emptyPeople);
//
//        testInvalidInputs(emptyPeople);
//
//        testInvalidInputConstructor();
    }

    // displays each object in the array
    public static void display(Person[] arr) {
        for (Person person : arr) System.out.println(person);
    }


    // Your displayNumbers method should go here.
    public static void displayNumbers(Person[] arr) {
        for (Person person : arr) {
            if (person instanceof Student) {
                System.out.println(((Student) person).getNumber());
            }
        }
    }

    // display student numbers with name of student
    public static void displayNumbersWithName(Person[] arr) {
        for (Person person : arr) {
            if (person instanceof Student) {
                System.out.println("Student " + person.getName() + " has number "+ ((Student) person).getNumber());
            }
        }
    }

    // displays each object in the array
    public static void displayWithClass(Person[] arr) {
        for (Person person : arr) {
            System.out.println(person.getClass().getName());
            System.out.println(person);
        }
    }

    public static void testInvalidInputConstructor() {
        try {
            Employee test1 = new Employee("B. Cee", 111, "b.cee@okmail.com", -50000);

        } catch (Exception ex) {
            System.out.println("Exception occurred! "+ ex);
        }

        try {
            Manager test2 = new Manager("A. Einstein", 105, "a.einstein@emc2.com", 100000, -2000, "Room 202");
            System.out.println(test2);
        } catch (Exception ex) {
            System.out.println("Exception occurred! "+ ex);
        }

        try {
            Manager test3 = new Manager("A. Einstein", 105, "a.einstein@emc2.com", -100000, 2000, "Room 202");
            System.out.println(test3);

        } catch (Exception ex) {
            System.out.println("Exception occurred! "+ ex);
        }
    }

    public static void testInvalidInputs(Person[] arr) {
        for (Person person : arr) {
            try {
                if (person instanceof ict2.Employee) {
                    System.out.println("Employee found:");
                    ((ict2.Employee) person).setSalary(-1000);
                }
                if (person instanceof Manager) {
                    System.out.println("Manager found:");
                    ((Manager) person).setBonus(-1000);
                }
            } catch (Exception ex){
                System.out.println("Exception occurred! "+ ex);
            }
        }
    }

}
