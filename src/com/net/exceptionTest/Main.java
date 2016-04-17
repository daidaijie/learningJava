package com.net.exceptionTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

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

}
