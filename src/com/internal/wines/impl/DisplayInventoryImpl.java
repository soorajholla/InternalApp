/**
 * 
 */
package com.internal.wines.impl;

import java.util.ArrayList;

import com.internal.wines.utils.EmployeeBean;
import com.internal.wines.utils.EmployeeDAO;
import com.internal.wines.utils.InventoryBean;
import com.internal.wines.utils.InventoryDAO;
import com.internal.wines.utils.VendorBean;
import com.internal.wines.utils.VendorDAO;

/**
 * @author Vartika
 *
 */
public class DisplayInventoryImpl {
	/**
	 * InventoryDAO initialized
	 */
InventoryDAO dao = new InventoryDAO();
EmployeeDAO empdao = new EmployeeDAO();
VendorDAO vendao = new VendorDAO();
	/**
	 * 
	 */
	public DisplayInventoryImpl() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * inventoryList of InventoryBean sent to controller
	 * @return
	 */
	public ArrayList<InventoryBean> loadInventory() {
		ArrayList<InventoryBean> inventoryList = 	dao.loadInventory();
		return inventoryList;
	}
	public ArrayList<EmployeeBean> loadEmployees() {
		ArrayList<EmployeeBean> employeeList = 	empdao.loadEmployees();
		return employeeList;
	}
	public ArrayList<VendorBean> loadVendors() {
		ArrayList<VendorBean> vendorList = 	vendao.loadVendors();
		return vendorList;
	}

}
