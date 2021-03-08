import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the restaurant ZhaAr");
            System.out.println("Choose option");
            System.out.println("1.Make an order");
            System.out.println("2.Sign in");
            int choice = sc.nextInt();
            while (choice != 1 && choice != 2) {
                System.out.println("Please only 1-2");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1: {
                    try {
                        ConnectDB obj_ConnectDB = new ConnectDB();
                        Connection conn = obj_ConnectDB.get_connection();

                        System.out.println("Input Client's Name:");
                        sc.nextLine();
                        String name = sc.nextLine();

                        System.out.println("Input Table number:");
                        String table_number = sc.nextLine();

                        int waiter_id;
                        System.out.println("Waiter ID:");
                        waiter_id = sc.nextInt();

                            System.out.println("What does the client want?");
                            System.out.println("a.Alcoholic drinks\t11.Vodka\t12.Cognac\t13.Whiskey");
                            System.out.println("b.Soft drinks\t21.Water\t22.Lemonade\t23.Tea");
                            System.out.println("c.Hot meals\t31.Mutton\t32.Horsemeat\t33.Pork");
                            System.out.println("d.Salads\t41.Caesar\t42.Greek\t43.Olivie");
                            System.out.println("e.Side dishes\t51.Puree\t52.Rice\t53.Spaghetti");
                            System.out.println("f.Desserts\t61.Cheesecake\t62.Chocolate cake\t63.Pistachio roll");
                            System.out.println("g.Soups\t71.Chicken soup\t72.Lentil soup\t73.Mushroom soup");
                            System.out.println("h.Pizza\t81.Margarita\t82.Three cheeses\t83.Chedar");
                            System.out.println("0.Finish order");
                            int choicee = sc.nextInt();
                            while (choicee != 1 && choicee != 2 && choicee != 3 && choicee != 4 && choicee != 5 && choicee != 6 && choicee != 7 && choicee != 8 && choicee != 0) {
                                System.out.println("Please only 0-8");
                                choicee = sc.nextInt();
                            }

                        String sql = "INSERT INTO \"Orders\" (order_id, client_name, table_number, num) VALUES (?,?,?,?)";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setString(2, name);
                        preparedStatement.setString(3, table_number);
                        preparedStatement.setInt(1, waiter_id);
                        preparedStatement.setInt(4, choicee);
                        preparedStatement.execute();

                    } catch (Exception e) {
                        System.err.println(e.getClass().getName() + ": " + e.getMessage());
                        System.exit(0);


                        break;


                    }
                }
            }
        }
    }
}