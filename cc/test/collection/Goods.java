package cc.test.collection;

import javax.persistence.criteria.CriteriaBuilder;

class Goods implements Comparable<Goods> {
    String goods_name;
    String goods_press;
    int goods_id;
    int goods_pirce;

    public Goods(int goods_id, String goods_name, int goods_pirce, String goods_press) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_pirce = goods_pirce;
        this.goods_press = goods_press;

    }


    public String toString() {
        return "商品编号：" + this.goods_id + " 商品名称：" + this.goods_name + " 商品单价：" + this.goods_pirce + "出版社：" + this.goods_press;
    }

    Integer good_id = goods_id;
    Integer goods_price = goods_pirce;

    public boolean equals(Object obj) {
        if (obj instanceof Goods) {
            Goods goods = (Goods) obj;
            return (good_id.equals(goods.goods_id)) && (goods_name.equals(goods.goods_name) && (goods_price.equals(goods.goods_pirce)) && (goods_press.equals(goods.goods_press)));
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return good_id.hashCode();
    }


    @Override
    public int compareTo(Goods o) {
        if (this.goods_id > o.goods_id ) {
            return 1;
        }else if  (this.goods_id == o.goods_id ){
            return  0;
            }
        return -1;
    }
}
