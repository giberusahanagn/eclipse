package com.xworkz.collection.lamda.lamdaBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkz.collection.lamda.lamdaConstant.Type;
import com.xworkz.collection.lamda.lamdaDTO.DataBaseVendorDTO;

public class DataBaseVendorRunner {
	public static void main(String[] args) {

		List<DataBaseVendorDTO> baseVendorDTOs = new ArrayList<DataBaseVendorDTO>();
		baseVendorDTOs.add(new DataBaseVendorDTO("MySql", "Oracle Corporation", 9, 0d, Type.Microsoft_Access));
		baseVendorDTOs.add(new DataBaseVendorDTO("Oracle", "Larry Ellison", 0, 0d, Type.Microsoft_SQLServer));
		baseVendorDTOs.add(new DataBaseVendorDTO("Microsoft Server", "bill gates", 0, 90d, Type.OracleRDBMS));
		baseVendorDTOs.add(new DataBaseVendorDTO("IBM", "ibm company", 0, 90d, Type.IBM));
		baseVendorDTOs.add(new DataBaseVendorDTO("Sql", "Oracle Corporation(sql)", 0, 90d, Type.SQL));

		baseVendorDTOs.stream().map(ele -> ele.getDevelopedBy().toUpperCase()).collect(Collectors.toList())
				.forEach(ele -> System.out.println("developed by all name :" + ele));
		System.out.println(System.lineSeparator());
		System.out.println("printing type sql");
		baseVendorDTOs.stream().filter(ele -> ele.getLicenseCost() <= 100).filter(ele -> ele.getType().equals(Type.SQL))
				.collect(Collectors.toList()).forEach(ele -> System.out.println("got type :" + ele));
		System.out.println(System.lineSeparator());
		baseVendorDTOs.stream().map(ele -> ele.getType()).collect(Collectors.toList())
				.forEach(ele -> System.out.println("all types: " + ele));
	}
}
