package ithanh.ntu65133236.qlbh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ithanh.ntu65133236.qlbh.dto.JwtResponse;
import ithanh.ntu65133236.qlbh.dto.LoginRequest;
import ithanh.ntu65133236.qlbh.dto.UserRegistrationDTO;
import ithanh.ntu65133236.qlbh.services.UserService;
import ithanh.ntu65133236.qlbh.utils.JwtUtils;

@Controller
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtUtils jwtUtils;

	@PostMapping("/login")
	public JwtResponse authenticateUser(@RequestBody LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		String jwt = jwtUtils.generateJwtToken(userDetails);

		return new JwtResponse(jwt, userDetails.getUsername());
	}

//	@GetMapping("/login")
//	public String login() {
//		return "login";
//	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new UserRegistrationDTO());
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("user") UserRegistrationDTO registrationDto, Model model) {
		try {
			userService.registerNewUser(registrationDto);
			return "redirect:/login?registered";
		} catch (RuntimeException e) {
			model.addAttribute("error", e.getMessage());
			return "register";
		}
	}
}