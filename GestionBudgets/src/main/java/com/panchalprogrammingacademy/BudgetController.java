package com.panchalprogrammingacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;
@RequestMapping("")
@Controller
public class BudgetController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "index";
    }

//    private BudgetDao budgetDao;
//
//    @Autowired
//    public BudgetController(BudgetDao budgetDao) {
//        this.budgetDao = budgetDao;
//    }
//
//    @GetMapping("/list")
//    public ModelAndView getAllBudgets() {
//        List<Budget> budgets = budgetDao.getAllBudgets();
//        ModelAndView modelAndView = new ModelAndView("budget-list");
//        modelAndView.addObject("budgets", budgets);
//        return modelAndView;
//    }
//
//    @PostMapping("/create")
//    public String createBudget(@ModelAttribute("budget") Budget budget) {
//        budgetDao.createBudget(budget);
//        return "redirect:/budgets/list";
//    }


}
