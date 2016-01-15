package oil.detection.page.bis;import com.base.page.BasePage;import java.math.BigDecimal;import java.util.Date;/** * <b>功能：</b>OrderPage<br> */public class OrderPage extends BasePage {    private java.lang.Integer id;//    private java.lang.Integer user_id;//   用户id    private java.lang.Integer product_id;//   产品id    private java.lang.Integer supplier_id;//   供应商id    private java.lang.Integer order_type;//   订单类型（1：直营订单 2：免费代采）    private BigDecimal price;//   单价    private BigDecimal number;//   数量    private BigDecimal total_price;//   订单总价    private java.lang.Integer pay_type;//   付款方式    private java.lang.Integer delivery_type;//   提货方式    private java.lang.String car_number;//   提货车牌号    private java.lang.String receiver_name;//   收货人姓名    private java.lang.String receiver_phone;//   收货人电话    private java.lang.String receiver_addr;//   收货人地址    private java.lang.String other_require;//   其他要求    private Date create_time;//   下单时间    private Date update_time;//   修改时间    private Date arrival_time;//   送达时间    private java.lang.String remark;//   备注    private java.lang.Integer state;//   状态（0：删除 1：审核中 2：未完成 3：已完成 3：交易取消）    private java.lang.Integer purchase_id;//   用户id    public Date getCreate_time() {        return create_time;    }    public void setCreate_time(Date create_time) {        this.create_time = create_time;    }    public Date getUpdate_time() {        return update_time;    }    public void setUpdate_time(Date update_time) {        this.update_time = update_time;    }    public Date getArrival_time() {        return arrival_time;    }    public void setArrival_time(Date arrival_time) {        this.arrival_time = arrival_time;    }    public Integer getPurchase_id() {        return purchase_id;    }    public void setPurchase_id(Integer purchase_id) {        this.purchase_id = purchase_id;    }    public java.lang.Integer getId() {        return this.id;    }    public void setId(java.lang.Integer id) {        this.id = id;    }    public java.lang.Integer getUser_id() {        return this.user_id;    }    public void setUser_id(java.lang.Integer user_id) {        this.user_id = user_id;    }    public java.lang.Integer getProduct_id() {        return this.product_id;    }    public void setProduct_id(java.lang.Integer product_id) {        this.product_id = product_id;    }    public java.lang.Integer getSupplier_id() {        return this.supplier_id;    }    public void setSupplier_id(java.lang.Integer supplier_id) {        this.supplier_id = supplier_id;    }    public java.lang.Integer getOrder_type() {        return this.order_type;    }    public void setOrder_type(java.lang.Integer order_type) {        this.order_type = order_type;    }    public BigDecimal getPrice() {        return this.price;    }    public void setPrice(BigDecimal price) {        this.price = price;    }    public BigDecimal getNumber() {        return this.number;    }    public void setNumber(BigDecimal number) {        this.number = number;    }    public BigDecimal getTotal_price() {        return this.total_price;    }    public void setTotal_price(BigDecimal total_price) {        this.total_price = total_price;    }    public java.lang.Integer getPay_type() {        return this.pay_type;    }    public void setPay_type(java.lang.Integer pay_type) {        this.pay_type = pay_type;    }    public java.lang.Integer getDelivery_type() {        return this.delivery_type;    }    public void setDelivery_type(java.lang.Integer delivery_type) {        this.delivery_type = delivery_type;    }    public java.lang.String getCar_number() {        return this.car_number;    }    public void setCar_number(java.lang.String car_number) {        this.car_number = car_number;    }    public java.lang.String getReceiver_name() {        return this.receiver_name;    }    public void setReceiver_name(java.lang.String receiver_name) {        this.receiver_name = receiver_name;    }    public java.lang.String getReceiver_phone() {        return this.receiver_phone;    }    public void setReceiver_phone(java.lang.String receiver_phone) {        this.receiver_phone = receiver_phone;    }    public java.lang.String getReceiver_addr() {        return this.receiver_addr;    }    public void setReceiver_addr(java.lang.String receiver_addr) {        this.receiver_addr = receiver_addr;    }    public java.lang.String getOther_require() {        return this.other_require;    }    public void setOther_require(java.lang.String other_require) {        this.other_require = other_require;    }    public java.lang.String getRemark() {        return this.remark;    }    public void setRemark(java.lang.String remark) {        this.remark = remark;    }    public java.lang.Integer getState() {        return this.state;    }    public void setState(java.lang.Integer state) {        this.state = state;    }}