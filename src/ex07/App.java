package ex07;

import ex07.lib.DB;

public class App {
    public static void main(String[] args) {

        DBFactory factory = DBFactory.getInstance();
        DB oracleDB = factory.createDB("maria");


    }
}
