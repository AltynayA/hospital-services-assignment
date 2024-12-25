package Subjects;

public class Patient extends Person {
        private String name;
        private int age;

        public Patient() {
            super("Unknown", 0);
        }
        public Patient(String name, int age) {
            super(name,age);
        }
        //setters and getters are not necessary, already in person class

        //age check method
        public String ageCheck() {
            if (getAge() < 18) {
                return getName() + " is under 18 years old. He/she cannot be treated in this hospital";
            }
            else{
                return getName() + " is an adult. He/she can be treated in this hospital";
            }
        }


    }



