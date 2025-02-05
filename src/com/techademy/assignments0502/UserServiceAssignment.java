package com.techademy.assignments0502;

import java.util.Optional;

//Step 1: Create the UserService interface
interface UserService {
 // Default method that returns a generic welcome message
 default String getWelcomeMessage() {
     return "Welcome, Guest!";
 }

 // Abstract method that returns an Optional user name
 Optional<String> getUser(String name);

 // Default method to get a welcome message based on user name
 default String getPersonalizedMessage(String name) {
     return getUser(name)
             .map(userName -> "Welcome, " + userName + "!")
             .orElse(getWelcomeMessage());  // Use default message if name is absent
 }
}

//Step 2: Implement the UserService interface
class UserServiceImpl implements UserService {
 @Override
 public Optional<String> getUser(String name) {
     return (name == null || name.isBlank()) ? Optional.empty() : Optional.of(name);
 }
}

//Step 3: Demonstrate the implementation
public class UserServiceAssignment {
 public static void main(String[] args) {
     UserService userService = new UserServiceImpl();

     // Test cases
     System.out.println(userService.getPersonalizedMessage("Alice"));  // Expected: Welcome, Alice!
     System.out.println(userService.getPersonalizedMessage(""));       // Expected: Welcome, Guest!
     System.out.println(userService.getPersonalizedMessage(null));     // Expected: Welcome, Guest!
 }
}

