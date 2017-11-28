public class Greeter {
    public String greet(String name) {
        if(name == null)
            throw new IllegalArgumentException("Screw you");
        return "Hello " + name + "!";
    }
}
