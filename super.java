class demosuper {

    void display() {
        System.out.println("Value of a in parent class: ");
    }

}   
class Super extends demosuper {

    int a = 10;

    void display() {
        super.display(); // Call the parent class method
        System.out.println("Value of a in child class: " + a);
    }

    public static void main(String[] args) {
        Super obj = new Super();
        obj.display(); // Display values from both parent and child classes
    }
}