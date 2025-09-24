package demo;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<String> users = new ArrayList<>();

    public void addUser(String user) {
        users.add(user);
    }

    public List<String> getDuplicates() {
        List<String> duplicates = new ArrayList<>();
        for (String u : users) {
            if (users.stream().filter(x -> x.equals(u)).count() > 1 && !duplicates.contains(u)) {
                duplicates.add(u);
            }
        }
        return duplicates;
    }

    // Task: Optimize this method. Use iterative refinement prompting with Copilot.
}
