package com.zhoufy.bean;

/**
 * Created with IDEA by ChouFy on 2019/7/29.
 *
 * @author Zhoufy
 */
public class Color {

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }

}
