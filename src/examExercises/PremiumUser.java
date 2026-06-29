package examExercises;

import java.util.Set;
import java.util.HashSet;

public class PremiumUser implements User{

    private String username;
    private Set <NormalUser> followers;

    public PremiumUser(String username) {
        this.username = username;
        this.followers = new HashSet <> ();
    }

    @Override
    public String getUsername(){
        return username;
    }
}
