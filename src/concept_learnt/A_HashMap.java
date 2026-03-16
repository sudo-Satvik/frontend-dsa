package concept_learnt;

import java.util.*;

// Learnt from TwoSum, practicing here

public class A_HashMap {
    public static void main(String[] args) {
        HashMap<String, String> userData = new HashMap<>();
        userData.put("name", "Satvik");
        userData.put("role", "SDE 1");
        userData.put("tech stack", "NextJS, ReactJS, TS, JS");

        System.out.println("UserData of: " + userData);
        System.out.println("UserData (name) is: " + userData.get("name"));  // get(key)
        System.out.println("UserData have (role) field?\n" + userData.containsKey("role"));     //containsKey(key)
        System.out.println("UserData have (age) field?\n" + userData.containsKey("age"));
        userData.remove("tech stack");
        System.out.println("UserData removed tech stack field: " + userData);
    }
}
