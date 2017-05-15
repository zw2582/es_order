package com.integle.order.models;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.data.annotation.Id;

import com.integle.order.util.Utils;

/**
 * 订单
 */
public class Order {
	
	private OrderAddress address;
	
	private OrderApply apply;
	
	private OrderExpress express;
	
	private OrderFile file;
	
	private OrderInvoice invoice;
	
	private OrderLog log;
	
	private OrderOther other;
	
	private List<OrderProduct> product;

	@Id
	private String order_num;

	@Min(value=1)
	private int user_id;

	private long create_time;

	private long update_time;

	private int trade_type = 1;

	private int order_type = 1;

	private int freight;

	private int total_money;

	private int to_supplier_total_money;

	private int coupon;

	private int max_unit_price;

	private String memo;

	private int pay_status;

	private int confirm_status;

	private int delivery_status;

	private int finish_status;

	private int order_status;

	private int comment_status;

	private int seller_status;

	private int is_recycle;

	private int status = 1;

	public OrderAddress getAddress() {
		return address;
	}

	public void setAddress(OrderAddress address) {
		this.address = address;
	}

	public OrderApply getApply() {
		return apply;
	}

	public void setApply(OrderApply apply) {
		this.apply = apply;
	}

	public OrderExpress getExpress() {
		return express;
	}

	public void setExpress(OrderExpress express) {
		this.express = express;
	}

	public OrderFile getFile() {
		return file;
	}

	public void setFile(OrderFile file) {
		this.file = file;
	}

	public OrderInvoice getInvoice() {
		return invoice;
	}

	public void setInvoice(OrderInvoice invoice) {
		this.invoice = invoice;
	}

	public OrderLog getLog() {
		return log;
	}

	public void setLog(OrderLog log) {
		this.log = log;
	}

	public OrderOther getOther() {
		return other;
	}

	public void setOther(OrderOther other) {
		this.other = other;
	}

	public List<OrderProduct> getProduct() {
		return product;
	}

	public void setProduct(List<OrderProduct> product) {
		this.product = product;
	}
	
	public String getOrder_num() {
		return this.order_num;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public long getCreate_time() {
		return this.create_time;
	}

	public long getUpdate_time() {
		return this.update_time;
	}

	public void setOrder_num(String order_num) {
		this.order_num = order_num;
	}

	public void setCreate_time(long create_time) {
		this.create_time = create_time;
	}

	public void setUpdate_time(long update_time) {
		this.update_time = update_time;
	}

	public int getTrade_type() {
		return trade_type;
	}

	public void setTrade_type(int trade_type) {
		this.trade_type = trade_type;
	}

	public int getOrder_type() {
		return order_type;
	}

	public void setOrder_type(int order_type) {
		this.order_type = order_type;
	}

	public int getFreight() {
		return freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

	public int getTotal_money() {
		return total_money;
	}

	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}

	public int getTo_supplier_total_money() {
		return to_supplier_total_money;
	}

	public void setTo_supplier_total_money(int to_supplier_total_money) {
		this.to_supplier_total_money = to_supplier_total_money;
	}

	public int getCoupon() {
		return coupon;
	}

	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}

	public int getMax_unit_price() {
		return max_unit_price;
	}

	public void setMax_unit_price(int max_unit_price) {
		this.max_unit_price = max_unit_price;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getPay_status() {
		return pay_status;
	}

	public void setPay_status(int pay_status) {
		this.pay_status = pay_status;
	}

	public int getConfirm_status() {
		return confirm_status;
	}

	public void setConfirm_status(int confirm_status) {
		this.confirm_status = confirm_status;
	}

	public int getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(int delivery_status) {
		this.delivery_status = delivery_status;
	}

	public int getFinish_status() {
		return finish_status;
	}

	public void setFinish_status(int finish_status) {
		this.finish_status = finish_status;
	}

	public int getOrder_status() {
		return order_status;
	}

	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}

	public int getComment_status() {
		return comment_status;
	}

	public void setComment_status(int comment_status) {
		this.comment_status = comment_status;
	}

	public int getSeller_status() {
		return seller_status;
	}

	public void setSeller_status(int seller_status) {
		this.seller_status = seller_status;
	}

	public int getIs_recycle() {
		return is_recycle;
	}

	public void setIs_recycle(int is_recycle) {
		this.is_recycle = is_recycle;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [address=" + address + ", apply=" + apply + ", express=" + express + ", file=" + file
				+ ", invoice=" + invoice + ", log=" + log + ", other=" + other + ", product=" + product + ", order_num="
				+ order_num + ", user_id=" + user_id + ", create_time=" + create_time + ", update_time=" + update_time
				+ ", trade_type=" + trade_type + ", order_type=" + order_type + ", freight=" + freight
				+ ", total_money=" + total_money + ", to_supplier_total_money=" + to_supplier_total_money + ", coupon="
				+ coupon + ", max_unit_price=" + max_unit_price + ", memo=" + memo + ", pay_status=" + pay_status
				+ ", confirm_status=" + confirm_status + ", delivery_status=" + delivery_status + ", finish_status="
				+ finish_status + ", order_status=" + order_status + ", comment_status=" + comment_status
				+ ", seller_status=" + seller_status + ", is_recycle=" + is_recycle + ", status=" + status + "]";
	}
	
	

}
