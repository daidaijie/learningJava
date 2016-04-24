package com.net.xiyouji;

/**
 * Created by daidaijie on 2016/4/24.
 */
public class XIyoujiTask {

    public static enum Person {
        tangseng, wukong, bajie, shaseng,
    }

    private Person personName;
    private float weight;
    private float height;
    private String head;

    public Person getPersonName() {
        return personName;
    }

    public void setPersonName(Person personName) {
        this.personName = personName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public void show() {
        System.out.println(getPersonName() + "的身高" + getHeight());
        System.out.println(getPersonName() + "的体重" + getWeight());
        System.out.println(getPersonName() + "的头" + getHead());
    }

    public void speak() {
        switch (getPersonName()) {
            case bajie:
                setHead("美男头");
                System.out.println(getPersonName() + "现在的头" + getHead());
                break;
            case wukong:
                setHead("美女头");
                System.out.println(getPersonName() + "我重" + getWeight() + "公斤,想骗八戒背我");
        }
    }

}
