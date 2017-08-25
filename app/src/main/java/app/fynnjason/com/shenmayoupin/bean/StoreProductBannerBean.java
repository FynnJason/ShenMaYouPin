package app.fynnjason.com.shenmayoupin.bean;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class StoreProductBannerBean {

    /**
     * resultCode : 200
     * resultMsg : 查询成功
     * resultData : [{"link0":37,"link1":"彩妆4","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124543843.jpg","link3":null,"link4":"2017-05-04T12:45:27","link5":93,"link6":0,"link7":10,"link8":null},{"link0":16,"link1":"彩妆","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/411403359.jpg","link3":null,"link4":"2017-03-28T11:18:51","link5":93,"link6":1,"link7":10,"link8":null},{"link0":17,"link1":"美容辅助品","link2":"http://ht.shenmayoupin.com/upload/2017-05-12/1212544812.jpg","link3":null,"link4":"2017-03-28T11:19:00","link5":93,"link6":1,"link7":17,"link8":null},{"link0":40,"link1":"有机食品","link2":"http://ht.shenmayoupin.com/upload/2017-06-23/231753180.jpg","link3":null,"link4":"2017-05-04T12:46:58","link5":93,"link6":1,"link7":18,"link8":null},{"link0":35,"link1":"彩妆2","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124045359.jpg","link3":null,"link4":"2017-05-04T12:40:29","link5":93,"link6":2,"link7":10,"link8":null},{"link0":39,"link1":"美容辅助品","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124632359.jpg","link3":null,"link4":"2017-05-04T12:46:26","link5":93,"link6":2,"link7":17,"link8":null},{"link0":36,"link1":"彩妆3","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124112218.jpg","link3":null,"link4":"2017-05-04T12:41:00","link5":93,"link6":3,"link7":10,"link8":null},{"link0":42,"link1":"营养保健品3","link2":"http://ht.shenmayoupin.com/upload/2017-06-02/215522910.jpg","link3":null,"link4":"2017-05-04T12:48:09","link5":93,"link6":3,"link7":9,"link8":null},{"link0":43,"link1":"营养保健品4","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124827843.jpg","link3":null,"link4":"2017-05-04T12:48:22","link5":93,"link6":4,"link7":9,"link8":null},{"link0":44,"link1":"营养保健品5","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124837953.jpg","link3":null,"link4":"2017-05-04T12:48:34","link5":93,"link6":5,"link7":9,"link8":null},{"link0":38,"link1":"彩妆5","link2":"http://ht.shenmayoupin.com/upload/2017-05-04/4124552687.jpg","link3":null,"link4":"2017-05-04T12:45:46","link5":93,"link6":5,"link7":10,"link8":null},{"link0":45,"link1":"营养保健品6","link2":"http://ht.shenmayoupin.com/upload/2017-06-02/2155335253.jpg","link3":null,"link4":"2017-05-04T12:48:45","link5":93,"link6":6,"link7":9,"link8":null}]
     */

    private int resultCode;
    private String resultMsg;
    private List<ResultDataBean> resultData;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public List<ResultDataBean> getResultData() {
        return resultData;
    }

    public void setResultData(List<ResultDataBean> resultData) {
        this.resultData = resultData;
    }

    public static class ResultDataBean {
        /**
         * link0 : 37
         * link1 : 彩妆4
         * link2 : http://ht.shenmayoupin.com/upload/2017-05-04/4124543843.jpg
         * link3 : null
         * link4 : 2017-05-04T12:45:27
         * link5 : 93
         * link6 : 0
         * link7 : 10
         * link8 : null
         */

        private int link0;
        private String link1;
        private String link2;
        private Object link3;
        private String link4;
        private int link5;
        private int link6;
        private int link7;
        private Object link8;

        public int getLink0() {
            return link0;
        }

        public void setLink0(int link0) {
            this.link0 = link0;
        }

        public String getLink1() {
            return link1;
        }

        public void setLink1(String link1) {
            this.link1 = link1;
        }

        public String getLink2() {
            return link2;
        }

        public void setLink2(String link2) {
            this.link2 = link2;
        }

        public Object getLink3() {
            return link3;
        }

        public void setLink3(Object link3) {
            this.link3 = link3;
        }

        public String getLink4() {
            return link4;
        }

        public void setLink4(String link4) {
            this.link4 = link4;
        }

        public int getLink5() {
            return link5;
        }

        public void setLink5(int link5) {
            this.link5 = link5;
        }

        public int getLink6() {
            return link6;
        }

        public void setLink6(int link6) {
            this.link6 = link6;
        }

        public int getLink7() {
            return link7;
        }

        public void setLink7(int link7) {
            this.link7 = link7;
        }

        public Object getLink8() {
            return link8;
        }

        public void setLink8(Object link8) {
            this.link8 = link8;
        }
    }
}
