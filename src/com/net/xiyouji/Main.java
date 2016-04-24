package com.net.xiyouji;

/**
 * Created by daidaijie on 2016/4/24.
 */
public class Main {
    public static void main(String[] args) {
        XIyoujiTask bajie;
        XIyoujiTask wukong;

        bajie = new XIyoujiTask();
        wukong = new XIyoujiTask();

        bajie.setPersonName(XIyoujiTask.Person.bajie);
        bajie.setHead("猪头");
        bajie.setHeight(1.83f);
        bajie.setWeight(86f);
        System.out.println();

        wukong.setPersonName(XIyoujiTask.Person.wukong);
        wukong.setHead("猴头");
        wukong.setHeight(1.66f);
        wukong.setWeight(1000f);
        System.out.println();

        bajie.show();
        System.out.println();
        wukong.show();
        System.out.println();

        bajie.speak();
        System.out.println();
        wukong.speak();


        wukong.setPersonName(XIyoujiTask.Person.wukong);



    }
}
