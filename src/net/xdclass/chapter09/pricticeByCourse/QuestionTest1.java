package net.xdclass.chapter09.pricticeByCourse;

import java.util.*;

public class QuestionTest1 {
    public static void main(String[] args) {
        List<VideoOrder> videoOrders1 = new ArrayList<>();
        videoOrders1.add(new VideoOrder("a课程", 22));
        videoOrders1.add(new VideoOrder("w课程", 200));
        videoOrders1.add(new VideoOrder("c课程", 100));
        videoOrders1.add(new VideoOrder("d课程", 33));
        videoOrders1.add(new VideoOrder("f课程", 1));
        List<VideoOrder> videoOrders2 = new ArrayList<>();
        videoOrders2.add(new VideoOrder("a课程", 22));
        videoOrders2.add(new VideoOrder("b课程", 18));
        videoOrders2.add(new VideoOrder("d课程", 33));
        videoOrders2.add(new VideoOrder("f课程", 1));
        videoOrders2.add(new VideoOrder("z课程", 22));

        //交集
//        videoOrders1.retainAll(videoOrders2);
//        System.out.println(videoOrders1);
        
//        List<VideoOrder> intersectionList = new ArrayList<>();
//        for (VideoOrder videoOrder : videoOrders1) {
//            if(videoOrders2.contains(videoOrder)){
//                intersectionList.add(videoOrder);
//            }
//        }
//        System.out.println(intersectionList);

        //videoOrder1差集
//        videoOrders1.removeAll(videoOrders2);
//        System.out.println(videoOrders1);

//        List<VideoOrder> diffList = new ArrayList<>();
//        for (VideoOrder videoOrder : videoOrders1) {
//            if (!videoOrders2.contains(videoOrder)) {
//                diffList.add(videoOrder);
//            }
//        }
//        System.out.println(diffList);

        // 并集
        videoOrders1.addAll(videoOrders2);
        System.out.println(videoOrders1);

        // 去重并集
        Set<VideoOrder> set = new HashSet<>(videoOrders1);
        System.out.println(set);


    }
}

class VideoOrder {
    private int price;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoOrder that = (VideoOrder) o;
        return price == that.price && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, title);
    }

    public VideoOrder(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "VideoOrder{" +
                "title=" + title +
                ", price='" + price + '\'' +
                '}';
    }
}