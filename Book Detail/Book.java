public class Book{
    private int bookPrice;
    private String bookName,authorName;
    public void setBookName(String s){
        this.bookName=s;
    }
    public void setBookPrice(int p){
        this.bookPrice=p;
    }
    public void setAuthorName(String a){
        this.authorName=a;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getBookPrice(){
        return this.bookPrice;
    }
    public String getAuthorName(){
        return this.authorName;
    }
}