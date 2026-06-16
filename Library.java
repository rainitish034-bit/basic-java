class Library1{
    String[] books;
    int no_of_books;

    public Library1() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBooks(String book){
    this.books[no_of_books] = book;
    no_of_books++;
    System.out.println( book+"has been add");
    }
    void ShowAvailableBook(){
        System.out.println("Available books are:");
        for(String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issueBook(String book){
        for(int i =0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
            System.out.println("the book has been issued");
            this.books[i]= null;
             return;
          } 
          System.out.println("*" +book);
        }
         System.out.println("this book does not exist"); 
    }
    void returnBook(String book){
         addBooks(book);
    }
}

class Library{
    public static void main(String[] args) {
      Library1 centLibrary =new Library1();
      centLibrary.addBooks("think and grow rich"); 
      centLibrary.addBooks("java basic"); 
      centLibrary.addBooks("c++"); 

      centLibrary.ShowAvailableBook(); 
      centLibrary.issueBook("java basic");
      centLibrary.ShowAvailableBook(); 
      centLibrary.returnBook("c++");
      centLibrary.ShowAvailableBook();
    }
}