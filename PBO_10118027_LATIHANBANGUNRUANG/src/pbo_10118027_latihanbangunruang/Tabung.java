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
public class Tabung extends BangunRuang {

    private double r;

    private double h;

    private double volume;



    public double getR() {

        return r;

    }



    public void setR(double r) {

        this.r = r;

    }



    public double getH() {

        return h;

    }



    public void setH(double h) {

        this.h = h;

    }

    /**
     *
     * @return
     */
    @Override
    public double hitungVolume() {

        this.volume = 3.14 * r * r * h;

        return this.volume;

    }

}
