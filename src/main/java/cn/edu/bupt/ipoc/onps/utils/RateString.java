package cn.edu.bupt.ipoc.onps.utils;

public class RateString {
    public final static String RATE_622 = "622M";
    public final static String RATE_FE = "100M";
    public final static String RATE_GE = "1G";
    public final static String RATE_10G = "10G";
    public final static String RATE_100G = "100G";
    private RateString(){}
    public final static double Value(String val){
        switch (val){
            case RATE_622:return 0.622;
            case RATE_FE:return 0.1;
            case RATE_GE:return 1.0;
            case RATE_10G:return 10.0;
            case RATE_100G:return 100.0;
            default:return 0.0;
        }
    }
}
