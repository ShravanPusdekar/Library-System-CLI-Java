import java.util.ArrayList;
import java.util.Scanner;

class Book {
    static int count=0;
    int bookId;
    String name,author;
    boolean isIssued=false;

    public Book(String name, String author) {
        this.bookId =++count;
        this.name = name;
        this.author = author;
    }
    @Override
    public String toString(){
        return "ID-"+ bookId +","+name+" by "+name;
    }

}
class library{
    ArrayList<Book> libBook=new ArrayList<>();
    public void addBook(Book book){
        libBook.add(book);
    }
    public void viewAllBooks(){
        if(libBook.isEmpty()) System.out.println("There are no books available in library....");
        else {
            System.out.println("Following are books in library...");
            for(Book b:libBook) System.out.println(b);
        }
    }
}
class user{
    int userId;
    String userName;
    public  user(int userId,String userName){
        this.userId=userId;
        this.userName=userName;
    }
}
public class libraryManagementSystem {
    public static void main(String[] args) {
        int choice,issuingBookId;
        library lib=new library();
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Select Option\n" +
                    "1. Add Book\n" +
                    "2. View all Books\n" +
                    "3. issueBook\n" +
                    "4. Return Book\n" +
                    "5. Search Book\n" +
                    "6. Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter then name of book");sc.nextLine();
                    String bookName=sc.nextLine();
                    System.out.println("Enter then name of Author");

                    String bookAuthor=sc.nextLine();
                    Book book1=new Book(bookName,bookAuthor);
                    lib.addBook(book1);
                    System.out.println("Book Added Successfully!");
                    break;
                case 2:
                    lib.viewAllBooks();
                    break;
                case 3:
                    System.out.println("Enter the id of Book which you want to Issue");
                    issuingBookId=sc.nextInt();
                    boolean found =false;
                    for(Book obj1:lib.libBook){
                        if (obj1.bookId==issuingBookId){
                            found=true;
                            if (!obj1.isIssued){
                                obj1.isIssued=true;
                                System.out.println("Book Issued Successfully");
                            }
                            else System.out.println("Book is already Issued.");
                        }
                        break;
                    }
                    if (!found) System.out.println("Book not found....");
                    break;

                case 4:
                    System.out.println("Enter the id of Book which you want to Issue");
                    int returnBookId= sc.nextInt();
                    boolean returnFound=false;
                    for (Book b: lib.libBook){
                        returnFound=true;
                        if (b.isIssued){
                            b.isIssued=false;
                            System.out.println("Book Issued Successfully.");
                        }
                        else System.out.println("Book was not issued.");
                    }
                    if (!returnFound) System.out.println("Book was not found...");
                case 5:
                    System.out.println("Enter the ID of book you want to search:");
                    int searchBookID = sc.nextInt();
                    boolean foundSearch = false;
                    for (Book b : lib.libBook) {
                        if (b.bookId == searchBookID) {
                            System.out.println("Book found: " + b);
                            foundSearch = true;
                            break;
                        }
                    }
                    if (!foundSearch) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Library System....... Goodbye!");
                    break;
            }
        }
        while (choice!=6);

    }
}
