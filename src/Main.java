public class Main {
    public static void main(String[] args) {
    Author Gogol = new Author("Николай","Гоголь");
    Author Iunusov = new Author("Азат","Юнусов");
    Book DeadSouls = new Book("Мёртвые души",1835, Gogol);
    Book MyLive = new Book ("Моя жизнь",2022, Iunusov);

    DeadSouls.setYearPublish(2022);
    MyLive.setYearPublish(1960);

        System.out.println(Gogol);
        System.out.println(Iunusov);
        System.out.println(DeadSouls);
        System.out.println(MyLive);
    }
}