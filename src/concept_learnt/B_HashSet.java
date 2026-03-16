package concept_learnt;

import java.util.*;

// Learnt from ContainsDuplicate problem during code optimisation, practicing here

public class B_HashSet {
    public static void main(String[] args) {
        HashSet<String> uniqueIds = new HashSet<>();
        // adding the element using add() method
        uniqueIds.add("u123000789");
        uniqueIds.add("v123000789");
        uniqueIds.add("w123000543");
        // checking if element exists using contains() method
        boolean isUidPresent = uniqueIds.contains("v123000789");
        System.out.println("Is user info present: " + isUidPresent);
        // deleting element using remove() method
        System.out.println("Before Deletion HashSet: " + uniqueIds);
        uniqueIds.remove("w123000543");
        System.out.println("After Deletion HashSet: " + uniqueIds);
    }
}
