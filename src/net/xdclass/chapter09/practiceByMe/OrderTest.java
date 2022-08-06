//package net.xdclass.chapter09.practiceByMe;
//
//import java.util.*;
//
//public class OrderTest {
//    public static void main(String[] args) {
//        List<VideoOrder> videoOrders1 = new ArrayList<>();
//        videoOrders1.add(new VideoOrder("a课程", 22));
//        videoOrders1.add(new VideoOrder("w课程", 200));
//        videoOrders1.add(new VideoOrder("c课程", 100));
//        videoOrders1.add(new VideoOrder("d课程", 33));
//        videoOrders1.add(new VideoOrder("f课程", 1));
//
//        List<VideoOrder> videoOrders2 = new ArrayList<>();
//        videoOrders2.add(new VideoOrder("a课程", 22));
//        videoOrders2.add(new VideoOrder("b课程", 18));
//        videoOrders2.add(new VideoOrder("d课程", 33));
//        videoOrders2.add(new VideoOrder("f课程", 1));
//        videoOrders2.add(new VideoOrder("z课程", 22));
//        jiaoji(videoOrders1,videoOrders2);
//        chaji(videoOrders1,videoOrders2);
//        bingji(videoOrders1,videoOrders2);
//        quchongbingji(videoOrders1,videoOrders2);
//    }
//    public static List jiaoji(List list1,List list2) {
//        Object[] videoOrders1 = list1.toArray();
//        Set<Object> set1 = new HashSet<>();
//        for (Object o : videoOrders1) {
//            set1.add(o);
//        }
//
//        Object[] videoOrders2 = list2.toArray();
//        Set<Object> set2 = new HashSet<>();
//        for (Object o : videoOrders2) {
//            set2.add(o);
//        }
//        Set<Object> zset = new HashSet<>();
//        Set<Object> cset1 = new HashSet<>();
//        Set<Object> cset2 = new HashSet<>();
//        zset.addAll(set1);
//        zset.addAll(set2);
////        System.out.println(zset);
//        cset1.add(set1);
//        cset1.removeAll(set1);
//        System.out.println("cset1:" + cset1);
//        cset2.add(set2);
//        cset2.removeAll(set1);
////        System.out.println(cset2);
//        zset.removeAll(cset1);
//        zset.removeAll(cset2);
////        System.out.println(zset);
//
//        return null;
//    }
//    public static List chaji(List list1,List list2) {
//        return null;
//
//    }
//    public static List bingji(List list1,List list2) {
//        return null;
//
//    }
//    public static List quchongbingji(List list1,List list2) {
//        return null;
//
//    }
//}
//
//class VideoOrder {
//    private int price;
//    private String title;
//
////    @Override
////    public int hashCode() {
////        return Objects.hash(price,title);
////    }
////
////    //判断地址是否一样
////    //非空判断和class类型判断
////    //强转
////    //对象里面的字段一一匹配
////    @Override
////    public boolean equals(Object obj) {
////        if (this == obj) return true;
////        if(obj == null || getClass()!=obj.getClass()) return false;
////        VideoOrder videoOrder = (VideoOrder) obj;
////        return price == videoOrder.price&& title.equals(videoOrder.title);
////    }
//
//    public VideoOrder(String title, int price) {
//        this.title = title;
//        this.price = price;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    @Override
//    public String toString() {
//        return "VideoOrder{" +
//                "title=" + title +
//                ", price='" + price + '\'' +
//                '}';
//    }
//}
