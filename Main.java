class Person {
    String name;
    int yearOfBirth;

    // public Person(String name,int yearOfBirth)
    // {
    // this.name=name;
    // this.yearOfBirth=yearOfBirth;
    // }

    void Display() {
        int age = 2023 - yearOfBirth;
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String args[]) {
        Person p = new Person();

        p.name = args[0];
        p.yearOfBirth = Integer.parseInt(args[1]);

        p.Display();

    }
}