package com.finance.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_fin_payment")
public class Payment {

	@Id
	@GeneratedValue
	private int paymentId;
	private LocalDate paymentDate;
	private double emiAmount;
	
	@OneToMany
	@JoinColumn(name = "card_No")
	private EMI_Card emi_card;
	
	@OneToOne
	@JoinColumn(name = "transaction_id")
	private Order_EMI_Details orderemidetails;

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public EMI_Card getEmi_card() {
		return emi_card;
	}

	public void setEmi_card(EMI_Card emi_card) {
		this.emi_card = emi_card;
	}

	public Order_EMI_Details getOrderemidetails() {
		return orderemidetails;
	}

	public void setOrderemidetails(Order_EMI_Details orderemidetails) {
		this.orderemidetails = orderemidetails;
	}
	
	
}

