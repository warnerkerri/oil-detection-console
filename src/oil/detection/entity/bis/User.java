package oil.detection.entity.bis;

import com.base.entity.BaseEntity;
import java.math.BigDecimal;
/**
 * <b>功能：</b>UserEntity<br>
 */
public class User extends BaseEntity {
	
		private java.lang.Integer id;//   	private java.lang.String user_id;//   用户id	private java.lang.Integer user_type;//   用户类型（1：普通用户 2：供应商）	private java.lang.String nickname;//   昵称	private java.lang.String real_name;//   真实姓名	private java.lang.String company_name;//   公司名	private java.lang.String phone;//   手机号	private java.lang.String email;//   用户邮箱	private java.lang.String password;//   密码	private java.lang.String head_portrait;//   头像	private java.lang.Integer sex;//   性别（1：男2：女3：保密）	private java.lang.String device;//   当前设备	private java.sql.Timestamp create_time;//   注册时间	private java.sql.Timestamp update_time;//   修改时间	private java.lang.String longitude;//   经度	private java.lang.String latitude;//   纬度	private java.lang.Integer state;//   状态	private java.lang.String remark;//   备注	private java.lang.Integer supplier_id;//   企业id	public java.lang.Integer getId() {	    return this.id;	}	public void setId(java.lang.Integer id) {	    this.id=id;	}	public java.lang.String getUser_id() {	    return this.user_id;	}	public void setUser_id(java.lang.String user_id) {	    this.user_id=user_id;	}	public java.lang.Integer getUser_type() {	    return this.user_type;	}	public void setUser_type(java.lang.Integer user_type) {	    this.user_type=user_type;	}	public java.lang.String getNickname() {	    return this.nickname;	}	public void setNickname(java.lang.String nickname) {	    this.nickname=nickname;	}	public java.lang.String getReal_name() {	    return this.real_name;	}	public void setReal_name(java.lang.String real_name) {	    this.real_name=real_name;	}	public java.lang.String getCompany_name() {	    return this.company_name;	}	public void setCompany_name(java.lang.String company_name) {	    this.company_name=company_name;	}	public java.lang.String getPhone() {	    return this.phone;	}	public void setPhone(java.lang.String phone) {	    this.phone=phone;	}	public java.lang.String getEmail() {	    return this.email;	}	public void setEmail(java.lang.String email) {	    this.email=email;	}	public java.lang.String getPassword() {	    return this.password;	}	public void setPassword(java.lang.String password) {	    this.password=password;	}	public java.lang.String getHead_portrait() {	    return this.head_portrait;	}	public void setHead_portrait(java.lang.String head_portrait) {	    this.head_portrait=head_portrait;	}	public java.lang.Integer getSex() {	    return this.sex;	}	public void setSex(java.lang.Integer sex) {	    this.sex=sex;	}	public java.lang.String getDevice() {	    return this.device;	}	public void setDevice(java.lang.String device) {	    this.device=device;	}	public java.sql.Timestamp getCreate_time() {	    return this.create_time;	}	public void setCreate_time(java.sql.Timestamp create_time) {	    this.create_time=create_time;	}	public java.sql.Timestamp getUpdate_time() {	    return this.update_time;	}	public void setUpdate_time(java.sql.Timestamp update_time) {	    this.update_time=update_time;	}	public java.lang.String getLongitude() {	    return this.longitude;	}	public void setLongitude(java.lang.String longitude) {	    this.longitude=longitude;	}	public java.lang.String getLatitude() {	    return this.latitude;	}	public void setLatitude(java.lang.String latitude) {	    this.latitude=latitude;	}	public java.lang.Integer getState() {	    return this.state;	}	public void setState(java.lang.Integer state) {	    this.state=state;	}	public java.lang.String getRemark() {	    return this.remark;	}	public void setRemark(java.lang.String remark) {	    this.remark=remark;	}	public java.lang.Integer getSupplier_id() {	    return this.supplier_id;	}	public void setSupplier_id(java.lang.Integer supplier_id) {	    this.supplier_id=supplier_id;	}
}

