package com.ujiuye.test;

import java.util.Objects;

public class Product {
        private String proId;
        private String proName;
        private double proPrice;
        private int proSum;
        private String proEle;
        private String proCon;

    public Product() {
    }

    public Product(String proId, String proName, double proPrice, int proSum, String proEle, String proCon) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proSum = proSum;
        this.proEle = proEle;
        this.proCon = proCon;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public int getProSum() {
        return proSum;
    }

    public void setProSum(int proSum) {
        this.proSum = proSum;
    }

    public String getProEle() {
        return proEle;
    }

    public void setProEle(String proEle) {
        this.proEle = proEle;
    }

    public String getProCon() {
        return proCon;
    }

    public void setProCon(String proCon) {
        this.proCon = proCon;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                ", proSum=" + proSum +
                ", proEle='" + proEle + '\'' +
                ", proCon='" + proCon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.proPrice, proPrice) == 0 &&
                proSum == product.proSum &&
                Objects.equals(proId, product.proId) &&
                Objects.equals(proName, product.proName) &&
                Objects.equals(proEle, product.proEle) &&
                Objects.equals(proCon, product.proCon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proId, proName, proPrice, proSum, proEle, proCon);
    }
}
