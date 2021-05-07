package com.htttql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.htttql.entity.Bill;
import com.htttql.repository.BillRepository;

@Controller
public class BillController {
	@Autowired
	private BillRepository billRepository;
	
	public String getAllBill(Model model) {
		List<Bill> bills = billRepository.findAll();
		model.addAttribute("bills",bills);
		return "Bill/showbill";
	}
}
