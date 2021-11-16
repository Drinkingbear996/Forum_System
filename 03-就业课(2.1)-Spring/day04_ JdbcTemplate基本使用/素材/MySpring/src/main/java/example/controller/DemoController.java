package example.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import example.pojo.User;
import example.pojo.VO;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/index1")
    public ModelAndView index1(){
        ModelAndView modelAndView = new ModelAndView();

        //设置模型数据
        modelAndView.addObject("username","itcast");

        //设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping(value="/index2")
    public ModelAndView index2(ModelAndView modelAndView){
        modelAndView.addObject("username","itheima");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping(value="/index3")
    public String index3(Model model){
        model.addAttribute("username","博学谷");
        return "success";
    }


    @RequestMapping(value = "/index4")
    public String index4(HttpServletRequest request)
    {
        request.setAttribute( "username","hwc");
        return "success";
    }

    @RequestMapping(value="index5")
    public void index5(HttpServletResponse response) throws IOException {
      response.getWriter().println("hello hwc");
    }

    @RequestMapping(value="/index6")
    @ResponseBody  //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String index6() throws IOException {
        return "hello xxxxxxxxx";
    }

    @RequestMapping(value="/index7")
    @ResponseBody  //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String index7() throws IOException {
        return "\"username:\",\" hwc \", \" age:\",\"20\" ";
    }

    @RequestMapping(value="/index8")
    @ResponseBody //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public String index8() throws IOException {
        User user=new User();
        user.setName("list");
        user.setAge(30);

        //使用json的转换工具将对象转换成json格式字符串在返回
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);

        return json;
    }


    @RequestMapping(value="/index9")
    @ResponseBody //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    //期望SpringMVC自动将User转换成json格式的字符串
    public User index9() throws IOException {
        User user = new User();
        user.setName("lisi2");
        user.setAge(32);
        return user;
    }

    @RequestMapping(value = "/index10")
    @ResponseBody  //告知SpringMVC框架 不进行视图跳转 直接进行数据响应
    public void index10(String name,int age)
    {
        System.out.println(name);
        System.out.println(age);

    }

    @RequestMapping(value = "/index11")
    @ResponseBody
    public void index11(User user)
    {
        System.out.println(user);
    }

    //封装数组类型
    @RequestMapping(value = "/index12")
    @ResponseBody
    public void index12(String s[])
    {
        //输出数组对象直接打印数组的值
        System.out.println( Arrays.asList(s));
        System.out.println(Arrays.toString(s));

    }

    @RequestMapping("/index13")
    @ResponseBody
    public void index13(VO vo)
    {
        System.out.println(vo);
    }


    @RequestMapping("/index14")
    @ResponseBody
    public void index14( @RequestBody List<User> xxx)
    {
        System.out.println(xxx);
    }


    @RequestMapping("/index15")
    @ResponseBody
    public void index15( @RequestParam(value = "name" ,defaultValue = "没有输入参数时打印") String username)
    {
        System.out.println(username);
    }

    @RequestMapping(value = "/index16/{xxx}")
    @ResponseBody
    public void index16( @PathVariable(value = "xxx") String x)
    {
        System.out.println(x);
    }

    @RequestMapping(value = "/index17")
    @ResponseBody
    public void index17(Date date)
    {
        System.out.println(date);
    }

    @RequestMapping(value = "/index18")
    @ResponseBody
    public void index18(HttpServletRequest request, HttpServletResponse response, HttpSession session)
    {

        System.out.println(request);
        System.out.println(response);
        System.out.println(session);

    }

    @RequestMapping(value = "/index19")
    @ResponseBody
    public void index19(@RequestHeader(value ="User-Agent",required = false) String User_Agent)
    {

        System.out.println(User_Agent);

    }

    //获取Cookie 对应的JSESSIONID
    @RequestMapping(value = "/index20")
    @ResponseBody
    public void index20(@CookieValue(value ="JSESSIONID",required = false) String JSessionID)
    {

        System.out.println(JSessionID);

    }



}

