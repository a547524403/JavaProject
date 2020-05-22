package cc.test.collection;

import java.util.*;

class librarys{
    String book_name;
    int price;
    String press;

    public librarys(String book_name,int price,String  press){
        this.book_name = book_name;
        this.price = price;
        this.press = press;
    }

    String getBook_name;
    Integer getPrice;
    String getPress;

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer id) {
        this.price = price;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getPress() {
        return press;
    }

    public void setPrice(String press) {
        this.press = press;
    }

    @Override
    public String toString() {
        return "图书名：" +book_name + " " + "价格：" +price + " " + "出版社：" +press;
}

    public static void main(String[] args) {

        librarys librarys1 = new librarys("新华字典",118,"新华出版社");
        librarys librarys2 = new librarys("贪官落马记",99,"政治出版社");
        librarys librarys3 = new librarys("一光年的距离有多远",99,"文艺出版社");
        librarys librarys4 = new librarys("Java从零基础到全栈大师",256,"科技出版社");

        Map<Integer, librarys> book1 = new HashMap<Integer, librarys>();
        book1.put(1001, librarys1);
        Map<Integer, librarys> book2 = new HashMap<Integer, librarys>();
        book2.put(1002, librarys2);
        Map<Integer, librarys> book3 = new HashMap<Integer, librarys>();
        book3.put(1003, librarys3);
        Map<Integer, librarys> book4 = new HashMap<Integer, librarys>();
        book4.put(1004, librarys4);

        List<Map<Integer, librarys>> book = new ArrayList<>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);

        for (Map<Integer,librarys> item : book) {
            for (Integer key : item.keySet()) {
                System.out.println("Key = " + key + " value = " + item.get(key));
            }
        }

    }
    }