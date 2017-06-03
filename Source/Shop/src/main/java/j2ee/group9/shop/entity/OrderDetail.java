package j2ee.group9.shop.entity;
// Generated Jun 1, 2016 9:27:59 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * OrderDetail generated by hbm2java
 */
@Entity
@Table(name = "order_detail", catalog = "sportshop")
public class OrderDetail implements java.io.Serializable {

	private Integer id;
	private int idOrder;
	private int idProduct;
	private int quantity;
	private double price;
	private Double pricePromotion;
	private double total;

	public OrderDetail() {
	}

	public OrderDetail(int idOrder, int idProduct, int quantity, double price, double pricePromotion, double total) {
		this.idOrder = idOrder;
		this.idProduct = idProduct;
		this.quantity = quantity;
		this.price = price;
		this.pricePromotion = pricePromotion;
		this.total = total;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "id_order", nullable = false)
	public int getIdOrder() {
		return this.idOrder;
	}

	public void setIdOrder(int idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "id_product", nullable = false)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "price", nullable = false, precision = 22, scale = 0)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Column(name = "price_promotion", nullable = true, precision = 22, scale = 0)
	public Double getPricePromotion() {
		return this.pricePromotion;
	}

	public void setPricePromotion(Double pricePromotion) {
		this.pricePromotion = pricePromotion;
	}

	@Column(name = "total", nullable = false, precision = 22, scale = 0)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}