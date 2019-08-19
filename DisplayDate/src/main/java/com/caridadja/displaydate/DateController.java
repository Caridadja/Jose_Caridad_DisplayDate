package com.caridadja.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {
	@RequestMapping("")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/Date")
	public String datePage(Model model) {
		String pattern = "EEEEE, dd MMMM, yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		model.addAttribute("date", date);
		return "date.jsp";
	}
	@RequestMapping("/Time")
	public String time(Model model) {
		String pattern = "hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String time = simpleDateFormat.format(new Date());
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
