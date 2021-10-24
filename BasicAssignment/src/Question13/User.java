package Question13;

import java.util.Scanner;

public class User implements Interface {
    static String userName,name;
    static int userID,id, Book_id;
    static String Title, Author, ISBN, Publication;
    @Override
    public void Register() {
        Scanner sc=new Scanner(System.in);
        System.out.println("#Registration\n");
        System.out.println("enter ID :");
        userID=sc.nextInt();
        System.out.println("enter Name :");
        userName=sc.next();
    }
    @Override
    public void Login() {
        Scanner sc=new Scanner(System.in);
        System.out.println("#Login\n");
        System.out.println("Enter Your Name for Login :");
         name=sc.next();
        System.out.println("Enter Your Id for Login :");
         id=sc.nextInt();

    }

    @Override
    public void Verify() {
        if (userID==id && userName==name)
        {
        System.out.println("You have Successfully LoggedIn;");
        }
        else
        {
            System.out.println("You have entered wrong id or name\n");
        }

    }
    @Override
    public void get_book_info() {
        System.out.println("We are Having these Books available for you :");
        System.out.println("Book_id = 1 . In Search of Lost Time by Marcel Proust");
        System.out.println("Book_id = 2 . Ulysses by James Joyce");
        System.out.println("Book_id = 3 . Don Quixote by Miguel de Cervantes");
        System.out.println("Book_id = 4 . One Hundred Years of Solitude by Gabriel Garcia Marquez");
        System.out.println("Book_id = 5 . The Great Gatsby by F. Scott Fitzgerald");
        System.out.println("Book_id = 6 . Moby Dick by Herman Melville");
        System.out.println("Book_id = 7 . War and Peace by Leo Tolstoy");
        System.out.println("Book_id = 8 . Hamlet by William Shakespeare");
        System.out.println("Book_id = 9 . The Odyssey by Homer");
        System.out.println("Book_id = 10 . Madame Bovary by Gustave Flaubert");
        System.out.println("Book_id = 11 . The Divine Comedy by Dante Alighieri");
        System.out.println("Book_id = 12 . The Maths by Dante Alighieri");
        System.out.println("Book_id = 13 . The Brothers Karamazov by Fyodor Dostoyevsky");
    }




    @Override
    public void Book_request() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The id of your book :");
        Book_id=sc.nextInt();
        switch (Book_id)
        {
            case 1:
                System.out.println("your book is In Search of Lost Time by Marcel Proust\n");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 2:
                System.out.println("your book is Ulysses by James Joyce");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 3:
                System.out.println("your book is Don Quixote by Miguel de Cervantes");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 4:
                System.out.println("your book is One Hundred Years of Solitude by Gabriel Garcia Marquez");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 5:
                System.out.println("your book is The Great Gatsby by F. Scott Fitzgerald");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 6:
                System.out.println("your book is Moby Dick by Herman Melville\"");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 7:
                System.out.println("your book is War and Peace by Leo Tolstoy");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 8:
                System.out.println("your book is Hamlet by William Shakespeare ");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 9:
                System.out.println("your book is The Odyssey by Homer");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 10:
                System.out.println("your book is Madame Bovary by Gustave Flaubert");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 11:
                System.out.println("your book is The Divine Comedy by Dante Alighieri");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 12:
                System.out.println("your book is The Maths by Dante Alighieri");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            case 13:
                System.out.println("your book is The Brothers Karamazov by Fyodor Dostoyevsky ");
                System.out.println("Please submit this Book before 20 days\n");
                System.out.println("Fine will be 5 Rs per day After 20 days");
                break;
            default:
                System.out.println("You have entered wrong Book_id\n");
        }

    }

    @Override
    public void Feedback() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Submit your valuable feedback");
        String feedback=sc.nextLine();
        System.out.println("Thanks a lot for your valuable feedback");

    }

}
