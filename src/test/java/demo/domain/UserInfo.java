package demo.domain;

/**
 * @auther: marco.li
 * @date: Created in 2020/3/15
 */
public class UserInfo {

    private Integer id;

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
