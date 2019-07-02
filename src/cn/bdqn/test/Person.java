package cn.bdqn.test;

import java.util.List;
import java.util.Map;

public class Person {
    private String name="s";
    private String words="hello";

    private List<String> pList;

    private Map<String,Object> hobbies;
    public Person(){}

    public Person(String name, String words) {
        this.name = name;
        this.words = words;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public List<String> getpList() {
        return pList;
    }

    public void setpList(List<String> pList) {
        this.pList = pList;
    }

    public Map<String, Object> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Map<String, Object> hobbies) {
        this.hobbies = hobbies;
    }

    public void say(){
        System.out.println(this.name+"说："+this.words+"该种语言是"+this.pList+"他的爱好是"+this.hobbies);
    }

}
