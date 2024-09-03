package skillo.lection9;

public class Objects {

    public static void main(String[] args) {
        createStudentObjects();
    }

    public static void createMovieObjects() {
        Movie movie1 = new Movie("The Shawshank Redemption", "drama", 9.3);
        movie1.printDetails();

        Movie movie2 = new Movie("The Godfather", "crime", 9.2 );
        movie2.printDetails();

        Movie movie3 = new Movie("Schindler's List", "drama", 9.0 );
        movie3.printDetails();

        Movie movie4 = new Movie("The Lord of the Rings: The Fellowship of the Ring", "fantasy", 8.9 );
        movie4.printDetails();
    }

    public static void createStudentObjects() {
        Student student1 = new Student("John Goodman");
        student1.calculateAverageGrade(62, 91, 100);
        student1.printDetails();

        Student student2 = new Student("Macy Edwards");
        student2.calculateAverageGrade(98, 79, 87);
        student2.printDetails();

        Student student3 = new Student("Lewis Howes");
        student3.calculateAverageGrade(100, 55, 90);
        student3.printDetails();
    }

    public static void createProductObjects() {
        Product product = new Product();
        
    }
}
