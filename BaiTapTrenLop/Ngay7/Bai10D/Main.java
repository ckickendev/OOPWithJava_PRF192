    package Semeter2_OOP_With_Jav_a.BaiTapTrenLop.Ngay7.Bai10D;

    public class Main {
        public static void main(String[] args) {
            Menu meme = new Menu();
            BookList bookList = new BookList();
            int choice;
            do{
                choice = meme.menu();
                switch (choice){
                    case 1: {
                        bookList.addBook();
                        break;
                    }
                    case 2:{
                        bookList.display();
                        break;
                    }
                    case 3:{
                        bookList.update();
                        break;
                    }
                    case 4:{
                        bookList.delete();
                        break;
                    }
                }
            }while (choice!=5);
        }
    }
