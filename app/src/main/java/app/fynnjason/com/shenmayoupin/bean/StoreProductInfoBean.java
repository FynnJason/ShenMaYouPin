package app.fynnjason.com.shenmayoupin.bean;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class StoreProductInfoBean {

    /**
     * resultCode : 200
     * resultMsg : 查询成功
     * resultData : {"CurPage":1,"TotalPage":1,"dt":[{"ID":43,"Name":"胡萝卜素口红","Tag":"HOT","Description":"胡萝卜素口红","Picture":"http://ht.shenmayoupin.com/upload/2017-05-04/4123520265.jpg","Category":"彩妆","NetQuantity":"1","Datetime":"2017/3/28 17:01:58","Details":"<p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992531423437505220497.jpg\" title=\"1.jpg\" alt=\"1.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992531982812504543538.jpg\" title=\"2.jpg\" alt=\"2.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992532548437507783559.jpg\" title=\"3.jpg\" alt=\"3.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992533148437503750525.jpg\" title=\"4.jpg\" alt=\"4.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992533759375008216725.jpg\" title=\"5.jpg\" alt=\"5.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992534320312501769010.jpg\" title=\"6.jpg\" alt=\"6.jpg\"/><\/p>","ColumnID":19,"OrderNum":0,"QuantityOfSale":1500,"IndexShow":"是","Price":"98","ActivityPrice":"98","ActivityBeginDate":"2017/3/28 17:01:58","ActivityEndDate":"2017/3/28 17:01:58","stock":18,"PageView":0,"Freight":"0","SevenReturn":"否","Rebate":0.3,"Parameter":"","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-05-04/4123526875.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123530265.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123533359.jpg"],"Feature":["口红"],"VIPPrice":null,"GolbNum":"0","Token":null,"UId":0},{"ID":49,"Name":"口红雨衣","Tag":"HOT","Description":"口红雨衣","Picture":"http://ht.shenmayoupin.com/upload/2017-05-16/1695229509.jpg","Category":"彩妆","NetQuantity":"5g","Datetime":"2017/5/4 12:29:52","Details":"<p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949783234375003277940.jpg\" title=\"100.jpg\" alt=\"100.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949786954687501378614.jpg\" title=\"101.jpg\" alt=\"101.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949787582812504559200.jpg\" title=\"102.jpg\" alt=\"102.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949788193750004727227.jpg\" title=\"103.jpg\" alt=\"103.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949788807812501950089.jpg\" title=\"104.jpg\" alt=\"104.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949789442187504345828.jpg\" title=\"105.jpg\" alt=\"105.jpg\"/><\/p><p><br/><\/p>","ColumnID":19,"OrderNum":0,"QuantityOfSale":2605,"IndexShow":"是","Price":"98","ActivityPrice":"98","ActivityBeginDate":"2017/5/4 12:29:52","ActivityEndDate":"2017/5/4 12:29:52","stock":10,"PageView":0,"Freight":"0","SevenReturn":"否","Rebate":0.3,"Parameter":"","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-05-04/413562562.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4135628875.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4135632156.jpg"],"Feature":["口红雨衣"],"VIPPrice":null,"GolbNum":"0","Token":null,"UId":0},{"ID":69,"Name":"测试产品","Tag":"HOT","Description":"测试产品，请勿购买","Picture":"http://ht.shenmayoupin.com/upload/2017-07-22/2214327209.png","Category":"彩妆","NetQuantity":"100","Datetime":"2017/7/22 14:01:29","Details":"<p>1111测试数据<\/p>","ColumnID":19,"OrderNum":1,"QuantityOfSale":202,"IndexShow":"是","Price":"11","ActivityPrice":"11","ActivityBeginDate":"2017/7/22 14:01:29","ActivityEndDate":"2017/7/22 14:01:29","stock":431,"PageView":1,"Freight":"0","SevenReturn":"否","Rebate":0,"Parameter":"<p>111<\/p>","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-07-22/2214251927.png","http://ht.shenmayoupin.com/upload/2017-07-22/2214327740.png"],"Feature":["测试的"],"VIPPrice":null,"GolbNum":"20","Token":null,"UId":0}]}
     */

    private int resultCode;
    private String resultMsg;
    private ResultDataBean resultData;

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

    public ResultDataBean getResultData() {
        return resultData;
    }

    public void setResultData(ResultDataBean resultData) {
        this.resultData = resultData;
    }

    public static class ResultDataBean {
        /**
         * CurPage : 1
         * TotalPage : 1
         * dt : [{"ID":43,"Name":"胡萝卜素口红","Tag":"HOT","Description":"胡萝卜素口红","Picture":"http://ht.shenmayoupin.com/upload/2017-05-04/4123520265.jpg","Category":"彩妆","NetQuantity":"1","Datetime":"2017/3/28 17:01:58","Details":"<p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992531423437505220497.jpg\" title=\"1.jpg\" alt=\"1.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992531982812504543538.jpg\" title=\"2.jpg\" alt=\"2.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992532548437507783559.jpg\" title=\"3.jpg\" alt=\"3.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992533148437503750525.jpg\" title=\"4.jpg\" alt=\"4.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992533759375008216725.jpg\" title=\"5.jpg\" alt=\"5.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-09/6362992534320312501769010.jpg\" title=\"6.jpg\" alt=\"6.jpg\"/><\/p>","ColumnID":19,"OrderNum":0,"QuantityOfSale":1500,"IndexShow":"是","Price":"98","ActivityPrice":"98","ActivityBeginDate":"2017/3/28 17:01:58","ActivityEndDate":"2017/3/28 17:01:58","stock":18,"PageView":0,"Freight":"0","SevenReturn":"否","Rebate":0.3,"Parameter":"","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-05-04/4123526875.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123530265.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123533359.jpg"],"Feature":["口红"],"VIPPrice":null,"GolbNum":"0","Token":null,"UId":0},{"ID":49,"Name":"口红雨衣","Tag":"HOT","Description":"口红雨衣","Picture":"http://ht.shenmayoupin.com/upload/2017-05-16/1695229509.jpg","Category":"彩妆","NetQuantity":"5g","Datetime":"2017/5/4 12:29:52","Details":"<p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949783234375003277940.jpg\" title=\"100.jpg\" alt=\"100.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949786954687501378614.jpg\" title=\"101.jpg\" alt=\"101.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949787582812504559200.jpg\" title=\"102.jpg\" alt=\"102.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949788193750004727227.jpg\" title=\"103.jpg\" alt=\"103.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949788807812501950089.jpg\" title=\"104.jpg\" alt=\"104.jpg\"/><\/p><p style=\"text-align: center;\"><img src=\"http://ht.shenmayoupin.com/upload/2017-05-04/6362949789442187504345828.jpg\" title=\"105.jpg\" alt=\"105.jpg\"/><\/p><p><br/><\/p>","ColumnID":19,"OrderNum":0,"QuantityOfSale":2605,"IndexShow":"是","Price":"98","ActivityPrice":"98","ActivityBeginDate":"2017/5/4 12:29:52","ActivityEndDate":"2017/5/4 12:29:52","stock":10,"PageView":0,"Freight":"0","SevenReturn":"否","Rebate":0.3,"Parameter":"","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-05-04/413562562.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4135628875.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4135632156.jpg"],"Feature":["口红雨衣"],"VIPPrice":null,"GolbNum":"0","Token":null,"UId":0},{"ID":69,"Name":"测试产品","Tag":"HOT","Description":"测试产品，请勿购买","Picture":"http://ht.shenmayoupin.com/upload/2017-07-22/2214327209.png","Category":"彩妆","NetQuantity":"100","Datetime":"2017/7/22 14:01:29","Details":"<p>1111测试数据<\/p>","ColumnID":19,"OrderNum":1,"QuantityOfSale":202,"IndexShow":"是","Price":"11","ActivityPrice":"11","ActivityBeginDate":"2017/7/22 14:01:29","ActivityEndDate":"2017/7/22 14:01:29","stock":431,"PageView":1,"Freight":"0","SevenReturn":"否","Rebate":0,"Parameter":"<p>111<\/p>","IsShow":"是","Banner":["http://ht.shenmayoupin.com/upload/2017-07-22/2214251927.png","http://ht.shenmayoupin.com/upload/2017-07-22/2214327740.png"],"Feature":["测试的"],"VIPPrice":null,"GolbNum":"20","Token":null,"UId":0}]
         */

        private int CurPage;
        private int TotalPage;
        private List<DtBean> dt;

        public int getCurPage() {
            return CurPage;
        }

        public void setCurPage(int CurPage) {
            this.CurPage = CurPage;
        }

        public int getTotalPage() {
            return TotalPage;
        }

        public void setTotalPage(int TotalPage) {
            this.TotalPage = TotalPage;
        }

        public List<DtBean> getDt() {
            return dt;
        }

        public void setDt(List<DtBean> dt) {
            this.dt = dt;
        }

        public static class DtBean {
            /**
             * ID : 43
             * Name : 胡萝卜素口红
             * Tag : HOT
             * Description : 胡萝卜素口红
             * Picture : http://ht.shenmayoupin.com/upload/2017-05-04/4123520265.jpg
             * Category : 彩妆
             * NetQuantity : 1
             * Datetime : 2017/3/28 17:01:58
             * Details : <p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992531423437505220497.jpg" title="1.jpg" alt="1.jpg"/></p><p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992531982812504543538.jpg" title="2.jpg" alt="2.jpg"/></p><p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992532548437507783559.jpg" title="3.jpg" alt="3.jpg"/></p><p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992533148437503750525.jpg" title="4.jpg" alt="4.jpg"/></p><p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992533759375008216725.jpg" title="5.jpg" alt="5.jpg"/></p><p style="text-align: center;"><img src="http://ht.shenmayoupin.com/upload/2017-05-09/6362992534320312501769010.jpg" title="6.jpg" alt="6.jpg"/></p>
             * ColumnID : 19
             * OrderNum : 0
             * QuantityOfSale : 1500
             * IndexShow : 是
             * Price : 98
             * ActivityPrice : 98
             * ActivityBeginDate : 2017/3/28 17:01:58
             * ActivityEndDate : 2017/3/28 17:01:58
             * stock : 18
             * PageView : 0
             * Freight : 0
             * SevenReturn : 否
             * Rebate : 0.3
             * Parameter :
             * IsShow : 是
             * Banner : ["http://ht.shenmayoupin.com/upload/2017-05-04/4123526875.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123530265.jpg","http://ht.shenmayoupin.com/upload/2017-05-04/4123533359.jpg"]
             * Feature : ["口红"]
             * VIPPrice : null
             * GolbNum : 0
             * Token : null
             * UId : 0
             */

            private int ID;
            private String Name;
            private String Tag;
            private String Description;
            private String Picture;
            private String Category;
            private String NetQuantity;
            private String Datetime;
            private String Details;
            private int ColumnID;
            private int OrderNum;
            private int QuantityOfSale;
            private String IndexShow;
            private String Price;
            private String ActivityPrice;
            private String ActivityBeginDate;
            private String ActivityEndDate;
            private int stock;
            private int PageView;
            private String Freight;
            private String SevenReturn;
            private double Rebate;
            private String Parameter;
            private String IsShow;
            private Object VIPPrice;
            private String GolbNum;
            private Object Token;
            private int UId;
            private List<String> Banner;
            private List<String> Feature;

            public int getID() {
                return ID;
            }

            public void setID(int ID) {
                this.ID = ID;
            }

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getTag() {
                return Tag;
            }

            public void setTag(String Tag) {
                this.Tag = Tag;
            }

            public String getDescription() {
                return Description;
            }

            public void setDescription(String Description) {
                this.Description = Description;
            }

            public String getPicture() {
                return Picture;
            }

            public void setPicture(String Picture) {
                this.Picture = Picture;
            }

            public String getCategory() {
                return Category;
            }

            public void setCategory(String Category) {
                this.Category = Category;
            }

            public String getNetQuantity() {
                return NetQuantity;
            }

            public void setNetQuantity(String NetQuantity) {
                this.NetQuantity = NetQuantity;
            }

            public String getDatetime() {
                return Datetime;
            }

            public void setDatetime(String Datetime) {
                this.Datetime = Datetime;
            }

            public String getDetails() {
                return Details;
            }

            public void setDetails(String Details) {
                this.Details = Details;
            }

            public int getColumnID() {
                return ColumnID;
            }

            public void setColumnID(int ColumnID) {
                this.ColumnID = ColumnID;
            }

            public int getOrderNum() {
                return OrderNum;
            }

            public void setOrderNum(int OrderNum) {
                this.OrderNum = OrderNum;
            }

            public int getQuantityOfSale() {
                return QuantityOfSale;
            }

            public void setQuantityOfSale(int QuantityOfSale) {
                this.QuantityOfSale = QuantityOfSale;
            }

            public String getIndexShow() {
                return IndexShow;
            }

            public void setIndexShow(String IndexShow) {
                this.IndexShow = IndexShow;
            }

            public String getPrice() {
                return Price;
            }

            public void setPrice(String Price) {
                this.Price = Price;
            }

            public String getActivityPrice() {
                return ActivityPrice;
            }

            public void setActivityPrice(String ActivityPrice) {
                this.ActivityPrice = ActivityPrice;
            }

            public String getActivityBeginDate() {
                return ActivityBeginDate;
            }

            public void setActivityBeginDate(String ActivityBeginDate) {
                this.ActivityBeginDate = ActivityBeginDate;
            }

            public String getActivityEndDate() {
                return ActivityEndDate;
            }

            public void setActivityEndDate(String ActivityEndDate) {
                this.ActivityEndDate = ActivityEndDate;
            }

            public int getStock() {
                return stock;
            }

            public void setStock(int stock) {
                this.stock = stock;
            }

            public int getPageView() {
                return PageView;
            }

            public void setPageView(int PageView) {
                this.PageView = PageView;
            }

            public String getFreight() {
                return Freight;
            }

            public void setFreight(String Freight) {
                this.Freight = Freight;
            }

            public String getSevenReturn() {
                return SevenReturn;
            }

            public void setSevenReturn(String SevenReturn) {
                this.SevenReturn = SevenReturn;
            }

            public double getRebate() {
                return Rebate;
            }

            public void setRebate(double Rebate) {
                this.Rebate = Rebate;
            }

            public String getParameter() {
                return Parameter;
            }

            public void setParameter(String Parameter) {
                this.Parameter = Parameter;
            }

            public String getIsShow() {
                return IsShow;
            }

            public void setIsShow(String IsShow) {
                this.IsShow = IsShow;
            }

            public Object getVIPPrice() {
                return VIPPrice;
            }

            public void setVIPPrice(Object VIPPrice) {
                this.VIPPrice = VIPPrice;
            }

            public String getGolbNum() {
                return GolbNum;
            }

            public void setGolbNum(String GolbNum) {
                this.GolbNum = GolbNum;
            }

            public Object getToken() {
                return Token;
            }

            public void setToken(Object Token) {
                this.Token = Token;
            }

            public int getUId() {
                return UId;
            }

            public void setUId(int UId) {
                this.UId = UId;
            }

            public List<String> getBanner() {
                return Banner;
            }

            public void setBanner(List<String> Banner) {
                this.Banner = Banner;
            }

            public List<String> getFeature() {
                return Feature;
            }

            public void setFeature(List<String> Feature) {
                this.Feature = Feature;
            }
        }
    }
}
