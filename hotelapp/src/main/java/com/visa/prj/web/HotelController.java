package com.visa.prj.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;
import com.visa.prj.service.BookingService;

@Controller
@SessionAttributes("user")
public class HotelController {

	@Autowired
	BookingService bookingService;
	@RequestMapping("search.do")
	public ModelAndView getSearchForm()
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchForm.jsp");
		return mav;
	}
	
	@RequestMapping("hotel.do")
	public ModelAndView getHotels(@RequestParam("searchCriteria") String s) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchResults.jsp");
		mav.addObject("hotelList", bookingService.findHotels(s));
		return mav;	
	}
	
	@RequestMapping("viewHotel.do")
	public ModelAndView getHotelById(@RequestParam("id") int id)
	{
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showHotel.jsp");
		mav.addObject("hotel", bookingService.getHotelById(id));
		return mav;	
	}
	
	@RequestMapping("bookingForm.do")
	public ModelAndView getBookingForm(@ModelAttribute("hotel") Hotel h, HttpServletRequest req)
	{
		ModelAndView mav =  new ModelAndView();
		mav.setViewName("userLoginForm.jsp");
		mav.addObject("booking", new Booking());
		HttpSession ses = req.getSession(true);
		ses.setAttribute("hotelId", h.getId());
		return mav;
	}
	
	@RequestMapping("placeReservation.do")
	public ModelAndView reserveHotel(@ModelAttribute("booking") Booking b, HttpServletRequest req)
	{
		ModelAndView mav= new ModelAndView();
		System.out.println(b.getUser()+"kkkkk");
		bookingService.makeBooking(b.getUser(), b.getHotel(), b.getCheckinDate(), b.getCheckoutDate(), b.isSmoking(), b.getBeds());
		
		mav.setViewName("showBookings.jsp");
		mav.addObject("bookingList",bookingService.getAllBookingsByUser(b.getUser()));
		return mav;
	}
	
	

	
	
	
	
	
}
