package com.zhang.test;

class Pointt {
        private double x, y, z;
        public Pointt(double x, double y, double z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double getPointtX(){
            return this.x;
        }

        
        public double getPointtY(){
            return this.y;
        }
        
        public double getPointtZ(){
            return this.z;
        }

        public void setPointtX(double x){
            this.x = x;
        }

        public void setPointtY(double y){
            this.y = y;
        }

        public void setPointtZ(double z){
            this.z = z;
        }

        // A(x1, y1, z1) B(x2, y2, z2)
        // dist = sqrt (x1 - x2)² + (y1 - y2)² + (z1 - z2)²
        public double GetDist(Pointt other){
            double x1 = this.x, x2 = other.x;
            double y1 = this.y, y2 = other.y;
            double z1 = this.z, z2 = other.z;

            double res = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2) + (z1 - z2)*(z1 - z2);
            return Math.sqrt(res);
        }

        // 重写toString()
        public String toString(){
            return "x = " + this.x + " y = " + this.y + " z = " + this.z + "\n";
        }

    }

public class aaa {
    public static void main(String args[]) throws Exception {
        Pointt p1 = new Pointt(1, 20.2, 3);
        Pointt p2 = new Pointt(2, 0.2, 3);

        System.out.println("--------------Points----------");
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());

        System.out.println("--------------GetXPoint----------");
        System.out.println("p1_x: " + p1.getPointtX());
        System.out.println("p2_x:  " + p2.getPointtX());

        System.out.println("--------------SetYPoint And GetPoint----------");
        p1.setPointtY(4);
        p2.setPointtY(2);
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2.toString());
        System.out.println("--------------GetDist----------");
        double dist = p1.GetDist(p2);
        System.out.println("dist: " + dist);
    }
}