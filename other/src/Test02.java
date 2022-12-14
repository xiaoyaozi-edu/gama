import java.util.concurrent.ConcurrentHashMap;

/**
 * tip:
 *
 * @author zhumingcheng
 * createTime: 2022-08-16 19:29
 */
public class Test02 {

    public static void main(String[] args) {
//        Hashtable a = new Hashtable();
//        a.put(null, a);

//        HashMap h = new HashMap();
//        h.put(null, h);

        ConcurrentHashMap<Object, Object> c = new ConcurrentHashMap<>();
        c.put(1, null);
    }

}