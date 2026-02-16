package entities;

import java.util.Objects;

public class Product {
	
	private String nama;
	private Double price;
	
	public Product(String nama, Double price) {
		this.nama = nama;
		this.price = price;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nama, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(nama, other.nama) && Objects.equals(price, other.price);
	}
}
