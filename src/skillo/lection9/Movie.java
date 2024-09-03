package skillo.lection9;

public class Movie {
/* Create a class named Movie that has three attributes: title, genre, and rating. 
Use this class to create different movie objects, each with its own title, genre, and rating. 
Display the details of each movie by accessing these attributes.*/

String title;
String genre;
double rating;

// Parametrized constructor
public Movie (String title, String genre, double rating) {
    this.title = title;
    this.genre = genre;
    this.rating = rating;
}

public void printDetails() {
    System.out.println("Title: " + title);
    System.out.println("Genre: " + genre);
    System.out.println("Rating: " + rating);
}

}
