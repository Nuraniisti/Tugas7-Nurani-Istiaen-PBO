/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outer;

/**
 *
 * @author ACER
 */
public class Outer1 {
    int number = 0;

    void OuterMethod(){
    class Inner{
        public void print(){
            System.out.println("Mengakses inner class yang ke : " + (number++));
        }
    }
        Inner inner = new Inner();
        inner.print();
    }
}

class OuterAccess{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.OuterMethod();
        out.OuterMethod();
        out.OuterMethod();
    }
}
