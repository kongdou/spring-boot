package fun.zxj.springboot.mvc.first.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fun.zxj.springboot.mvc.first.domain.DemoObj;

@Controller
public class ConverterController {

	@RequestMapping(value="/convert",produces={"application/x-deepsky"})
	public @ResponseBody DemoObj convert(@RequestBody DemoObj obj){
		return obj;
	}
}
