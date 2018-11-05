package cn.itheima.git;

public class URLDemo {

    public static void main(String[] args) {
        String url = "http://10.0.0.222:8080/pay/health/insure?recorderId=undefined";
        String recorderId =  getRecorderId(url);
        System.out.println(recorderId);
    }

    private static String getRecorderId(String url) {
        int index = url.indexOf("?");
        String paramUrl = url.substring(index + 1);
        return paramUrl.substring(paramUrl.indexOf("=")+1);
    }


}
