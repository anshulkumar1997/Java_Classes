import java.util.Scanner;
public class TestBook{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int bp;
        String bn,an;
        Book b=new Book();
        System.out.println("Enter the Book name:");
        bn=sc.nextLine();
        b.setBookName(bn);
        System.out.println("Enter the price:");
        bp=sc.nextInt();
        b.setBookPrice(bp);
        System.out.println("Enter the Author name:");
        an=sc.next();
        b.setAuthorName(an);
        System.out.println("Book Details");
        System.out.println("Book Name :"+b.getBookName());
        System.out.println("Book Price :"+b.getBookPrice());
        System.out.println("Author Name :"+b.getAuthorName());
    }
}