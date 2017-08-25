package app.fynnjason.com.shenmayoupin.bean;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class StoreProductTypeBean {

    /**
     * resultCode : 200
     * resultMsg : 查询成功
     * resultData : [{"ClassSys0":9,"ClassSys1":"营养保健品","ClassSys2":0,"ClassSys3":1,"ClassSys4":20,"ClassSys5":0,"classsys6":"http://ht.shenmayoupin.com/upload/2017-05-10/1085242312.png","classsys7":null,"classsys8":null,"classsys9":null,"classsys10":null},{"ClassSys0":10,"ClassSys1":"彩妆","ClassSys2":0,"ClassSys3":2,"ClassSys4":20,"ClassSys5":0,"classsys6":"http://ht.shenmayoupin.com/upload/2017-05-10/1085250406.png","classsys7":null,"classsys8":null,"classsys9":null,"classsys10":null},{"ClassSys0":17,"ClassSys1":"美容辅助品","ClassSys2":0,"ClassSys3":3,"ClassSys4":20,"ClassSys5":null,"classsys6":"http://ht.shenmayoupin.com/upload/2017-05-10/108534500.png","classsys7":null,"classsys8":null,"classsys9":null,"classsys10":null},{"ClassSys0":18,"ClassSys1":"有机食品","ClassSys2":0,"ClassSys3":4,"ClassSys4":20,"ClassSys5":null,"classsys6":"http://ht.shenmayoupin.com/upload/2017-05-10/1085315109.png","classsys7":null,"classsys8":null,"classsys9":null,"classsys10":null}]
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
         * ClassSys0 : 9
         * ClassSys1 : 营养保健品
         * ClassSys2 : 0
         * ClassSys3 : 1
         * ClassSys4 : 20
         * ClassSys5 : 0
         * classsys6 : http://ht.shenmayoupin.com/upload/2017-05-10/1085242312.png
         * classsys7 : null
         * classsys8 : null
         * classsys9 : null
         * classsys10 : null
         */

        private int ClassSys0;
        private String ClassSys1;
        private int ClassSys2;
        private int ClassSys3;
        private int ClassSys4;
        private int ClassSys5;
        private String classsys6;
        private Object classsys7;
        private Object classsys8;
        private Object classsys9;
        private Object classsys10;

        public int getClassSys0() {
            return ClassSys0;
        }

        public void setClassSys0(int ClassSys0) {
            this.ClassSys0 = ClassSys0;
        }

        public String getClassSys1() {
            return ClassSys1;
        }

        public void setClassSys1(String ClassSys1) {
            this.ClassSys1 = ClassSys1;
        }

        public int getClassSys2() {
            return ClassSys2;
        }

        public void setClassSys2(int ClassSys2) {
            this.ClassSys2 = ClassSys2;
        }

        public int getClassSys3() {
            return ClassSys3;
        }

        public void setClassSys3(int ClassSys3) {
            this.ClassSys3 = ClassSys3;
        }

        public int getClassSys4() {
            return ClassSys4;
        }

        public void setClassSys4(int ClassSys4) {
            this.ClassSys4 = ClassSys4;
        }

        public int getClassSys5() {
            return ClassSys5;
        }

        public void setClassSys5(int ClassSys5) {
            this.ClassSys5 = ClassSys5;
        }

        public String getClasssys6() {
            return classsys6;
        }

        public void setClasssys6(String classsys6) {
            this.classsys6 = classsys6;
        }

        public Object getClasssys7() {
            return classsys7;
        }

        public void setClasssys7(Object classsys7) {
            this.classsys7 = classsys7;
        }

        public Object getClasssys8() {
            return classsys8;
        }

        public void setClasssys8(Object classsys8) {
            this.classsys8 = classsys8;
        }

        public Object getClasssys9() {
            return classsys9;
        }

        public void setClasssys9(Object classsys9) {
            this.classsys9 = classsys9;
        }

        public Object getClasssys10() {
            return classsys10;
        }

        public void setClasssys10(Object classsys10) {
            this.classsys10 = classsys10;
        }
    }
}
