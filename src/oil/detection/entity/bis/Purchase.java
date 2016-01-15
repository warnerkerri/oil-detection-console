package oil.detection.entity.bis;import com.base.entity.BaseEntity;import java.util.Date;/** * <b>功能：</b>PurchaseEntity<br> */public class Purchase extends BaseEntity {    private java.lang.Integer id;//    private java.lang.Integer oil_type;//   油类型（1：柴油 2：汽油）    private java.lang.Integer purchase_type;//   采购类型（1：采购需求 2：代采申请）    private java.lang.Integer quality_standard;//   质量标准    private java.lang.Integer product_model;//   产品型号    private java.lang.Integer number;//   需求数量    private java.lang.Integer pay_type;//   付款方式    private java.lang.Integer delivery_type;//   提货方式    private java.lang.String delivery_addr;//   提货地址    private java.lang.Object conditions;//   条件    private java.lang.String other_require;//    其他要求    private Date create_time;//   创建时间    private Date update_time;//   update_time    private java.lang.Integer state;//   状态(0：删除 1：审核中 2：审核通过)    private java.lang.String remark;//   备注    private java.lang.Integer user_id;//   用户id    private java.lang.Integer product_id;//   产品id    private String oil_type_desc;    private String purchase_type_desc;    private String quality_standard_desc;    private String product_model_desc;    private String pay_type_desc;    private String delivery_type_desc;    private String user_id_desc;    private String product_id_desc;    private Integer supplier_id;    public Integer getSupplier_id() {        return supplier_id;    }    public void setSupplier_id(Integer supplier_id) {        this.supplier_id = supplier_id;    }    public String getOil_type_desc() {        return oil_type_desc;    }    public void setOil_type_desc(String oil_type_desc) {        this.oil_type_desc = oil_type_desc;    }    public String getPurchase_type_desc() {        return purchase_type_desc;    }    public void setPurchase_type_desc(String purchase_type_desc) {        this.purchase_type_desc = purchase_type_desc;    }    public String getQuality_standard_desc() {        return quality_standard_desc;    }    public void setQuality_standard_desc(String quality_standard_desc) {        this.quality_standard_desc = quality_standard_desc;    }    public String getProduct_model_desc() {        return product_model_desc;    }    public void setProduct_model_desc(String product_model_desc) {        this.product_model_desc = product_model_desc;    }    public String getPay_type_desc() {        return pay_type_desc;    }    public void setPay_type_desc(String pay_type_desc) {        this.pay_type_desc = pay_type_desc;    }    public String getDelivery_type_desc() {        return delivery_type_desc;    }    public void setDelivery_type_desc(String delivery_type_desc) {        this.delivery_type_desc = delivery_type_desc;    }    public String getUser_id_desc() {        return user_id_desc;    }    public void setUser_id_desc(String user_id_desc) {        this.user_id_desc = user_id_desc;    }    public String getProduct_id_desc() {        return product_id_desc;    }    public void setProduct_id_desc(String product_id_desc) {        this.product_id_desc = product_id_desc;    }    public java.lang.Integer getId() {        return this.id;    }    public void setId(java.lang.Integer id) {        this.id = id;    }    public java.lang.Integer getOil_type() {        return this.oil_type;    }    public void setOil_type(java.lang.Integer oil_type) {        this.oil_type = oil_type;    }    public java.lang.Integer getPurchase_type() {        return this.purchase_type;    }    public void setPurchase_type(java.lang.Integer purchase_type) {        this.purchase_type = purchase_type;    }    public java.lang.Integer getQuality_standard() {        return this.quality_standard;    }    public void setQuality_standard(java.lang.Integer quality_standard) {        this.quality_standard = quality_standard;    }    public java.lang.Integer getProduct_model() {        return this.product_model;    }    public void setProduct_model(java.lang.Integer product_model) {        this.product_model = product_model;    }    public java.lang.Integer getNumber() {        return this.number;    }    public void setNumber(java.lang.Integer number) {        this.number = number;    }    public java.lang.Integer getPay_type() {        return this.pay_type;    }    public void setPay_type(java.lang.Integer pay_type) {        this.pay_type = pay_type;    }    public java.lang.Integer getDelivery_type() {        return this.delivery_type;    }    public void setDelivery_type(java.lang.Integer delivery_type) {        this.delivery_type = delivery_type;    }    public java.lang.String getDelivery_addr() {        return this.delivery_addr;    }    public void setDelivery_addr(java.lang.String delivery_addr) {        this.delivery_addr = delivery_addr;    }    public java.lang.Object getConditions() {        return this.conditions;    }    public void setConditions(java.lang.Object conditions) {        this.conditions = conditions;    }    public java.lang.String getOther_require() {        return this.other_require;    }    public void setOther_require(java.lang.String other_require) {        this.other_require = other_require;    }    public Date getCreate_time() {        return create_time;    }    public void setCreate_time(Date create_time) {        this.create_time = create_time;    }    public Date getUpdate_time() {        return update_time;    }    public void setUpdate_time(Date update_time) {        this.update_time = update_time;    }    public java.lang.Integer getState() {        return this.state;    }    public void setState(java.lang.Integer state) {        this.state = state;    }    public java.lang.String getRemark() {        return this.remark;    }    public void setRemark(java.lang.String remark) {        this.remark = remark;    }    public java.lang.Integer getUser_id() {        return this.user_id;    }    public void setUser_id(java.lang.Integer user_id) {        this.user_id = user_id;    }    public java.lang.Integer getProduct_id() {        return this.product_id;    }    public void setProduct_id(java.lang.Integer product_id) {        this.product_id = product_id;    }}