package github.veikkoroc.A_Books.程序员代码面试指南.第1章栈和队列.第4节猫狗队列;

/**
 * @author Veikko Roc
 * @version 1.0
 * @date 2020/10/30 14:24
 */
public class Pet {
    private String type;

    public Pet(String type){
        this.type = type;
        System.out.println("父类构造器执行");
    }

    public String getPetType(){
        return this.type;
    }
}
