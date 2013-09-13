package com.example.response.table;

import java.util.ArrayList;

public class GeocodeTable {

	private ArrayList<AddressComponent> address_components;

	private String formatted_address;

	private Geometry geometry;

	private ArrayList<String> types;

	public ArrayList<AddressComponent> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(
			ArrayList<AddressComponent> address_components) {
		this.address_components = address_components;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public ArrayList<String> getTypes() {
		return types;
	}

	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "GeocodeTable [address_components=" + address_components
				+ ", formatted_address=" + formatted_address + ", geometry="
				+ geometry + ", types=" + types + "]";
	}

}
