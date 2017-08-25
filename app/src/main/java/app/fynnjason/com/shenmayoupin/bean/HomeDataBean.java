package app.fynnjason.com.shenmayoupin.bean;

import java.util.List;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */

public class HomeDataBean {

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

        private String VipExclusive;
        private List<String> Banners;
        private List<ClassifiedNavigationsBean> ClassifiedNavigations;
        private List<RecommendProductsBean> RecommendProducts;
        private List<GodHorsesBean> GodHorses;

        public String getVipExclusive() {
            return VipExclusive;
        }

        public void setVipExclusive(String VipExclusive) {
            this.VipExclusive = VipExclusive;
        }

        public List<String> getBanners() {
            return Banners;
        }

        public void setBanners(List<String> Banners) {
            this.Banners = Banners;
        }

        public List<ClassifiedNavigationsBean> getClassifiedNavigations() {
            return ClassifiedNavigations;
        }

        public void setClassifiedNavigations(List<ClassifiedNavigationsBean> ClassifiedNavigations) {
            this.ClassifiedNavigations = ClassifiedNavigations;
        }

        public List<RecommendProductsBean> getRecommendProducts() {
            return RecommendProducts;
        }

        public void setRecommendProducts(List<RecommendProductsBean> RecommendProducts) {
            this.RecommendProducts = RecommendProducts;
        }

        public List<GodHorsesBean> getGodHorses() {
            return GodHorses;
        }

        public void setGodHorses(List<GodHorsesBean> GodHorses) {
            this.GodHorses = GodHorses;
        }

        public static class ClassifiedNavigationsBean {

            private int ClassId;
            private String Img;
            private String Title;

            public int getClassId() {
                return ClassId;
            }

            public void setClassId(int ClassId) {
                this.ClassId = ClassId;
            }

            public String getImg() {
                return Img;
            }

            public void setImg(String Img) {
                this.Img = Img;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }
        }

        public static class RecommendProductsBean {

            private String Classify;
            private int ClassifyId;
            private String ClassifyImg;
            private List<String> Banners;
            private List<ProductsBean> Products;

            public String getClassify() {
                return Classify;
            }

            public void setClassify(String Classify) {
                this.Classify = Classify;
            }

            public int getClassifyId() {
                return ClassifyId;
            }

            public void setClassifyId(int ClassifyId) {
                this.ClassifyId = ClassifyId;
            }

            public String getClassifyImg() {
                return ClassifyImg;
            }

            public void setClassifyImg(String ClassifyImg) {
                this.ClassifyImg = ClassifyImg;
            }

            public List<String> getBanners() {
                return Banners;
            }

            public void setBanners(List<String> Banners) {
                this.Banners = Banners;
            }

            public List<ProductsBean> getProducts() {
                return Products;
            }

            public void setProducts(List<ProductsBean> Products) {
                this.Products = Products;
            }

            public static class ProductsBean {

                private int PId;
                private String Name;
                private String LabelName;
                private String Price;
                private String Purchase;
                private String Img;
                private Object LabelVal;

                public int getPId() {
                    return PId;
                }

                public void setPId(int PId) {
                    this.PId = PId;
                }

                public String getName() {
                    return Name;
                }

                public void setName(String Name) {
                    this.Name = Name;
                }

                public String getLabelName() {
                    return LabelName;
                }

                public void setLabelName(String LabelName) {
                    this.LabelName = LabelName;
                }

                public String getPrice() {
                    return Price;
                }

                public void setPrice(String Price) {
                    this.Price = Price;
                }

                public String getPurchase() {
                    return Purchase;
                }

                public void setPurchase(String Purchase) {
                    this.Purchase = Purchase;
                }

                public String getImg() {
                    return Img;
                }

                public void setImg(String Img) {
                    this.Img = Img;
                }

                public Object getLabelVal() {
                    return LabelVal;
                }

                public void setLabelVal(Object LabelVal) {
                    this.LabelVal = LabelVal;
                }
            }
        }

        public static class GodHorsesBean {

            private int Id;
            private String Title;
            private int Mid;
            private String DetailsPage;

            public int getId() {
                return Id;
            }

            public void setId(int Id) {
                this.Id = Id;
            }

            public String getTitle() {
                return Title;
            }

            public void setTitle(String Title) {
                this.Title = Title;
            }

            public int getMid() {
                return Mid;
            }

            public void setMid(int Mid) {
                this.Mid = Mid;
            }

            public String getDetailsPage() {
                return DetailsPage;
            }

            public void setDetailsPage(String DetailsPage) {
                this.DetailsPage = DetailsPage;
            }
        }
    }
}
