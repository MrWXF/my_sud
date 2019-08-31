package com.wzq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzq.model.Product;
import com.wzq.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;

    //保存数据
    @RequestMapping("/save")
    public String save(Product product) throws Exception {
        productService.save(product);

        return "redirect:findAll.do";
    }

//    //查询所有(为分页)
//    @RequestMapping("/findAll")
//    public String findAll(Model model) throws Exception {
//        ModelAndView vm = new ModelAndView();
//        List<Product> pl = productService.findAll();
//        System.out.println(pl);
//        model.addAttribute("productList",pl);
//
////        vm.addObject("productList", pl);
////        vm.setViewName("product-list");
//        return "product-list";
//    }


    //分页后的(厉害pageInfo)
    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1")int page,//required=true：表示这个值必须要有 defaultValue：默认值
                                @RequestParam(name = "size",required = true,defaultValue = "4")int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<Product> serviceAll = productService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(serviceAll);
        System.out.println(pageInfo);
        mv.addObject("pageInfo",pageInfo);

        mv.setViewName("product-page-list");
        return mv;
    }


}
