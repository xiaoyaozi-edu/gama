/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-07-29 18:42
 */
public class B extends A {

    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                "} " + super.toString();
    }
}