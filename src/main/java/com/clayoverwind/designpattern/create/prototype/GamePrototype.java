package com.clayoverwind.designpattern.create.prototype;

import java.io.*;

/**
 * @author clayoverwind
 * @version 2017/5/23
 * @E-mail clayanddev@163.com
 */
public class GamePrototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public GamePrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* 浅复制 */
    public GamePrototype clone() throws CloneNotSupportedException {
        GamePrototype prototype = (GamePrototype)super.clone();
        return prototype;
    }

    /* 深复制 */
    public GamePrototype deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (GamePrototype)ois.readObject();
    }
}
