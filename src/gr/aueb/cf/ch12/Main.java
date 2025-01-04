package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.*;
public class Main {

    public static void main(String[] args) {

        Teacher teacher = new Teacher(1, "Athanasios", "Androutsos");
        User user = new User(1, "Kwstas", "Mark", "cmask", "12345", true);
        Customer customer = new Customer(1, "Andrew", "Dimitriou", "856867445", "6978594930", "West-Attica", "Attica", "Athens", "Patision","123","10445");
        Point point = new Point(0, 10);
        Order order = new Order(1, 5.5, "Meat", "Ordered");

        System.out.println("Teacher" + teacher.getFirstname() + ", " + teacher.getLastname() );
        System.out.println("User:" + user.getUsername());
        System.out.println("Customer:" + customer.getFirstname() + ", " + user.getLastname());
        System.out.println("Point:" + point.getX() + ", " + point.getY());
        System.out.println("Order: "+ order.getId() + ", " + order.getFormatedTimestamp());

    }

}
