class Library{
    String[] books;
    int no_of_books;
    
    Library(){
        this.books = new String[100];
        no_of_books = 0;
    }
    
    public void addbooks(String book){
        books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been Added");
    }
    
    void showAvailableBooks(){
        for(String arr: this.books){
            if(arr == null){
                continue;
            }
            else
                System.out.println("*"+books);
        }
    }
    
    void issuedbooks(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("Book has issued");
                books[i]=null;
                return;
            }
        }
        System.out.println("Book is not available");
    }
    
    void returnBook(String books){
        addbooks(books);
    }
}
class libreary
{
	public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library l1 = new Library();
        l1.addbooks("akjsdl");
        l1.addbooks("pyhysics");
        l1.addbooks("Maths");
        l1.addbooks("java");
        l1.issuedbooks("physics");
	}
}
