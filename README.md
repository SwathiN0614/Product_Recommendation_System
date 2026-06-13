# Product Recommendation System

## Overview

The Product Recommendation System is a Java-based application that recommends products to users based on their purchasing behavior. The system uses a simple collaborative filtering technique and Jaccard Similarity to identify users with similar interests and suggest products that the target user has not purchased yet.

This project demonstrates the use of Data Structures such as HashMap, HashSet, and ArrayList to build a basic recommendation engine.

## Features

* Store users and their purchased products.
* Calculate similarity between users.
* Identify the most similar user.
* Recommend products not already owned by the target user.
* Simple console-based user interaction.

## Technologies Used

* Java
* HashMap
* HashSet
* ArrayList
* Scanner

## Data Structures Used

### HashMap

Stores user names and their purchased products.

```java
Map<String, Set<String>> userProducts = new HashMap<>();
```

### HashSet

Stores unique products for each user and supports efficient set operations.

```java
Set<String> products = new HashSet<>();
```

### ArrayList

Stores recommended products.

```java
List<String> recommendations = new ArrayList<>();
```

## Algorithm

### Jaccard Similarity

Similarity between two users is calculated using:

Similarity = Intersection of Products / Union of Products

Where:

* Intersection = Common products purchased by both users
* Union = Total unique products purchased by both users

Example:

User A: {Laptop, Phone, Tablet}

User B: {Laptop, Phone, Camera}

Intersection = {Laptop, Phone} = 2

Union = {Laptop, Phone, Tablet, Camera} = 4

Similarity = 2 / 4 = 0.5

## Workflow

1. Add users and their products.
2. Accept a target user as input.
3. Compare the target user with all other users.
4. Calculate similarity scores.
5. Find the most similar user.
6. Recommend products owned by the similar user but not by the target user.

## Sample Input

```
Enter User Name (Alice/Bob/Charlie): Alice
```

## Sample Output

```
Recommended Products:
Camera
```

## Time Complexity

* Similarity Calculation: O(m)
* Recommendation Generation: O(m)
* Overall Complexity: O(n × m)

Where:

* n = Number of users
* m = Average number of products per user

## Space Complexity

```
O(n × m)
```

## Advantages

* Easy to understand and implement.
* Efficient product lookup using HashSet.
* Demonstrates recommendation system fundamentals.
* Suitable for Java and DSA learning.

## Limitations

* Uses only one similar user for recommendations.
* Small dataset support.
* Does not consider ratings or purchase frequency.
* Not optimized for large-scale applications.

## Future Enhancements

* Use multiple similar users.
* Add product ratings and reviews.
* Integrate with a database.
* Develop a GUI or web application.
* Implement machine learning-based recommendation techniques.

## Conclusion

The Product Recommendation System is a simple recommendation engine that uses collaborative filtering and Jaccard Similarity to suggest products. It effectively demonstrates the practical application of Java collections and data structures in solving real-world recommendation problems.

