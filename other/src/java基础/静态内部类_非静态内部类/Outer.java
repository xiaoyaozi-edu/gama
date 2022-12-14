package java基础.静态内部类_非静态内部类;

/**
 * tip: https://www.cnblogs.com/thisiswhy/p/16798811.html#!comments
 *
 * @author zhumingcheng
 * createTime: 2022-12-14 10:32
 */
public class Outer {

    // 静态内部类与非静态内部类区别：
    // 1、非静态内部类会持有外部类的实例，因此可以调用外部类的私有属性或私有方法；
    //      这种情况就会出现内存泄露的情况，如果内部类的实例没有被回收，它引用外部类的实例也没法回收，就可能出现内存泄露，
    //      所以正常情况下我们会优先考虑使用静态内部类
    //
    // 2、非静态内部类不允许有静态方法，但是可以有静态常量，不能是静态变量
    //
    // 3、存活的线程可以作为gc，线程持有worker对象，worker又是线程池的内部类，所以worker持有ThreadPoolExecutor，线程池不会被回收

    private String name;

    private void setName(String name) {
        this.name = name;
    }

    public class Inner {
        static final String a = "";
        private void testMethod() {
            setName("tom");
        }
    }

}

//package java基础.静态内部类_非静态内部类;
//
//public class Outer {
//    private String name;
//
//    public Outer() {
//    }
//
//    private void setName(String name) {
//        this.name = name;
//    }
//
//    public class Inner {
//        public Inner() {
//        }
//
//        private void testMethod() {
//            Outer.this.setName("tom");
//        }
//    }
//}


//package java基础.静态内部类_非静态内部类;
//
//public class Outer$Inner {
//    public Outer$Inner(Outer this$0) {
//        this.this$0 = this$0;
//    }
//
//    private void testMethod() {
//        Outer.access$000(this.this$0, "tom");
//    }
//}