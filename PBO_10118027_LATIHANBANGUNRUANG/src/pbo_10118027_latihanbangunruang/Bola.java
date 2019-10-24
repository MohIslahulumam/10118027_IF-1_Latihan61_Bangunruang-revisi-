/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_10118027_latihanbangunruang;

/**
 *
 * @author RYZEN
 */
class Bola {

    private double r;

    private double volume;



    public double getR() {

        return r;

    }



    public void setR(double r) {

        this.r = r;

    }

    

    public double hitungVolume() {

        this.volume = (4/3) * 3.14 * (r * r * r);

        return this.volume;

    }

}