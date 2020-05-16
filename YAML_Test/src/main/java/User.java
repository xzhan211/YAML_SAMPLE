import java.util.Map;

public class User {
    private String name;
    private int age;
    private Map<String, String> address;
    private String[] roles;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Map<String, String> getAddress() {
        return address;
    }
    public void setAddress(Map<String, String> address) {
        this.address = address;
    }
    public String[] getRoles() {
        return roles;
    }
    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nName: " + name + "\n");
        sb.append("\nAge: " + age + "\n");
        sb.append("\nAddress:");
        for(String addr : address.values()){
            sb.append("\n"+addr);
        }
        sb.append("\n");
        sb.append("\nRoles:");
        for(String role : roles){
            sb.append("\n"+role);
        }
        sb.append("\n");

        return sb.toString();
    }
}
