package com.visa.prj.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.User;
import com.visa.prj.service.BookingService;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	BookingService bs;
	@RequestMapping("login.do")
	//RequestParam to get parameter
	public String doLogin(@ModelAttribute("booking") Booking b, Model m,HttpServletRequest req) {
		//code for validate comes here
		
				m.addAttribute("user", b.getUser().getEmail());
				HttpSession ses = req.getSession(false);
				b.setHotel(bs.getHotelById((long)ses.getAttribute("hotelId")));
				m.addAttribute("hotel", b.getHotel());
				return "bookingForm.jsp";
		
	}
	 
	@RequestMapping("signout.do")
	public String doLogout(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		ses.removeAttribute("user");
		ses.invalidate();
		//client-side redirection
		return "redirect:login.html";
	}
	 
}
