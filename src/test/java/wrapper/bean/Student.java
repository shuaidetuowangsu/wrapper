package wrapper.bean;

import wrapper.annotion.Wrapper;

public class Student {

    /**
     * 标识
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别 0 男 1女
     */
     @Wrapper(dictData = {"0:男","1:女"},dictType = "array",name = "demo")
    // @Wrapper(dictData = {"0","1"},dictType = "config", name = "demo")
    private int sex;

    public Student(int id, String name, int sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
