public class SimpleUser implements User {
    private String name;

    public SimpleUser(String name) {
        this.name = name;
    }

    public SimpleUser() {
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "User name is: " + getName();
    }

}
