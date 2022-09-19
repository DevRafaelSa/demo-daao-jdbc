package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.sql.SQLOutput;
import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);

        //injecao de dependenciasem explicitar a implementaação
        SellerDAO sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
        System.out.println(obj);

    }
}
