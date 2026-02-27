class SakamotoCharacter {
    String name;
    String role;
    String skill;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Skill: " + skill);
    }
}

public class Main {
    public static void main(String[] args) {

        SakamotoCharacter character1 = null;

        try {
            
            character1.displayInfo();
        } catch (NullPointerException e) {
            System.out.println("Sakamoto character object is not created.");
        }

        
        character1 = new SakamotoCharacter();

        
        character1.name = "Taro Sakamoto";
        character1.role = "Former Assassin";
        character1.skill = "Super Strength and Combat Skills";
        

        
        character1.displayInfo();
    }
}
