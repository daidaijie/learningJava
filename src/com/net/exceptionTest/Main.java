package com.net.exceptionTest;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by daidaijie on 2016/4/17.
 */
public class Main {


    public static void main(String[] args) {

        //这里调用应当在这里处理异常
        try {
            new Main().read("030");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /*public void read(String fileName) {
        InputStream in = null;
        try {
            in = new FileInputStream(fileName);
            int b;
            while ((b = in.read()) != -1) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/

    //最好的选择是将异常传递给调用者,应该让调用者去处理
    public void read(String fileName) throws IOException {
        InputStream in = null;
        in = new FileInputStream(fileName);
        int b;
        while ((b = in.read()) != -1) {

        }
    }


    //带资源的try语句
    public void read() {
        //无论是否正常都会调用in.close()
        try (Scanner in = new Scanner(new FileInputStream("030.txt"))) {
            System.out.println(in.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //还可以使用多个资源
        try (Scanner in = new Scanner(new FileInputStream("030.txt"));
             PrintWriter out = new PrintWriter("out.txt")) {
            System.out.println(in.next());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
