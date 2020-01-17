package com.example.weather.pojo;

public class Days {
    private String v01301;

    private String vTimeAvaila;

    private Integer v04292;

    private Double v12001701;

    private Double v1200170105;

    private Double v1200170106;

    private Double v13004701;

    private Double v13305701;

    private Double v13306701;

    private Double v11002701;

    public Days(String v01301, String vTimeAvaila, Integer v04292, Double v12001701, Double v1200170105, Double v1200170106, Double v13004701, Double v13305701, Double v13306701, Double v11002701) {
        this.v01301 = v01301;
        this.vTimeAvaila = vTimeAvaila;
        this.v04292 = v04292;
        this.v12001701 = v12001701;
        this.v1200170105 = v1200170105;
        this.v1200170106 = v1200170106;
        this.v13004701 = v13004701;
        this.v13305701 = v13305701;
        this.v13306701 = v13306701;
        this.v11002701 = v11002701;
    }

    public Days() {
        super();
    }

    public String getV01301() {
        return v01301;
    }

    public void setV01301(String v01301) {
        this.v01301 = v01301 == null ? null : v01301.trim();
    }

    public String getvTimeAvaila() {
        return vTimeAvaila;
    }

    public void setvTimeAvaila(String vTimeAvaila) {
        this.vTimeAvaila = vTimeAvaila == null ? null : vTimeAvaila.trim();
    }

    public Integer getV04292() {
        return v04292;
    }

    public void setV04292(Integer v04292) {
        this.v04292 = v04292;
    }

    public Double getV12001701() {
        return v12001701;
    }

    public void setV12001701(Double v12001701) {
        this.v12001701 = v12001701;
    }

    public Double getV1200170105() {
        return v1200170105;
    }

    public void setV1200170105(Double v1200170105) {
        this.v1200170105 = v1200170105;
    }

    public Double getV1200170106() {
        return v1200170106;
    }

    public void setV1200170106(Double v1200170106) {
        this.v1200170106 = v1200170106;
    }

    public Double getV13004701() {
        return v13004701;
    }

    public void setV13004701(Double v13004701) {
        this.v13004701 = v13004701;
    }

    public Double getV13305701() {
        return v13305701;
    }

    public void setV13305701(Double v13305701) {
        this.v13305701 = v13305701;
    }

    public Double getV13306701() {
        return v13306701;
    }

    public void setV13306701(Double v13306701) {
        this.v13306701 = v13306701;
    }

    public Double getV11002701() {
        return v11002701;
    }

    public void setV11002701(Double v11002701) {
        this.v11002701 = v11002701;
    }
}